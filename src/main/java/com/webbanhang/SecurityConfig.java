package com.webbanhang;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.oauth2.client.registration.ClientRegistrationRepository;

import javax.sql.DataSource;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    DataSource dataSource;

    @Autowired
    private ClientRegistrationRepository clientRegistrationRepository;

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Autowired
    public void configAuthentication(AuthenticationManagerBuilder auth) throws Exception {
        auth.jdbcAuthentication().dataSource(dataSource);
    }

    @Override
    public void configure(HttpSecurity http) throws Exception {
        http.csrf().disable().cors().disable();

        // phan quyen
        http.authorizeRequests()
                .antMatchers("/admin/**").hasRole("ADMIN")
                .antMatchers(new String[]{"/account/cart/**","/account/newcart"}).authenticated()
                .anyRequest().permitAll();

        // fomr login
        http.formLogin().loginPage("/account/signin")
                .loginProcessingUrl("/account/login") // post url login
                .defaultSuccessUrl("/product/index",true)
                .failureUrl("/account/login/error")
                .usernameParameter("username")
                .passwordParameter("password")
                .and()
                .oauth2Login().defaultSuccessUrl("/product/index",true);


        http.rememberMe().rememberMeParameter("remember");

        // logout
        http.logout().logoutUrl("/account/logoff").logoutSuccessUrl("/account/signin");

        // dieu kiem loi tru cap khong dung quyen
        http.exceptionHandling().accessDeniedPage("/account/signin");
    }
}

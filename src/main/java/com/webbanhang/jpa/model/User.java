package com.webbanhang.jpa.model;


import javax.persistence.*;

@Entity
@Table(name = "users")
public class User {

	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Id")
	private int id;

	@Column(name="Email")
	private String email;

	@Column(name="Password")
	private String password;

	@Column(name="Enabled")
	private boolean status;

	@Column(name="Username")
	private String username;
	
	private String img;
	
	//bi-directional many-to-one association to Cutomer
	@ManyToOne
	@JoinColumn(name="Cutomers_id")
	private Cutomer cutomer;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public Cutomer getCutomer() {
		return cutomer;
	}

	public void setCutomer(Cutomer cutomer) {
		this.cutomer = cutomer;
	}

}
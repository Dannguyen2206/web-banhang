package com.webbanhang.jpa.model;

import javax.persistence.*;

import java.util.List;



@Entity
@Table(name="cutomers")
public class Cutomer {
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Id")
	private int id;

	@Column(name="Address")
	private String address;

	@Column(name="Birthday")
	private String birthday;

	@Column(name="Name")
	private String name;

	@Column(name="Procvince")
	private String procvince;

	@Column(name="Tel")
	private String tel;

	@Column(name="District")
	private String district;

	@Column(name="Gender")
	private String sex;

	//bi-directional many-to-one association to Order
	@OneToMany(mappedBy="cutomer")
	private List<Order> orders;

	//bi-directional many-to-one association to User
	@OneToMany(mappedBy="cutomer")
	private List<User> users;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getProcvince() {
		return procvince;
	}

	public void setProcvince(String procvince) {
		this.procvince = procvince;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public List<Order> getOrders() {
		return orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	

}
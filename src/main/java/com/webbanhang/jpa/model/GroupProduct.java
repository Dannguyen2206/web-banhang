package com.webbanhang.jpa.model;

import javax.persistence.*;

import java.util.List;



@Entity
@Table(name = "groupproduct")
public class GroupProduct{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Id")
	private int id;

	@Column(name="Content")
	private String content;

	@Column(name="Images")
	private String images;

	@Column(name="Name")
	private String name;

	@Column(name="Status")
	private int status;

	//bi-directional many-to-one association to Product
	@OneToMany(mappedBy="groupProduct")
	private List<Product> products;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getImages() {
		return images;
	}

	public void setImages(String images) {
		this.images = images;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}


}
package com.webbanhang.jpa.model;


import javax.persistence.*;


@Entity
@Table(name = "img")
public class Img {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Id")
	private int id;

	@Column(name="Image")
	private String image;

	//bi-directional many-to-one association to Product
	@ManyToOne
	@JoinColumn(name="Imageid")
	private Product product;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	
	
}

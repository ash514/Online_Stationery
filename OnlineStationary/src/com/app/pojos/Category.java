package com.app.pojos;

import java.util.List;

//import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.sun.istack.internal.NotNull;

public class Category {
	private Integer category_id;
	private String category;
	
	private List<Product> products;

	public Category() {
		System.out.println("in category constructor");
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getCategory_id() {
		return category_id;
	}

	public void setCategory_id(Integer category_id) {
		this.category_id = category_id;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	
	
	/*
	 * @OneToOne(mappedBy = "cat",cascade = CascadeType.ALL,fetch =
	 * FetchType.EAGER,orphanRemoval = true) public List<Product> getProducts() {
	 * return products; }
	 */

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	
	

	
	
	

}

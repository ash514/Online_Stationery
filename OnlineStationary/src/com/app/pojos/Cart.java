package com.app.pojos;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="cart")
public class Cart {
	
	//data members
	private Integer cart_id;
	private float grand_total;
	
	private List<CartItem> cart_items;
	private User user;
	private Orders order1;
	
	
	public Cart() {
		System.out.println("in cart constructor");
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getCart_id() {
		return cart_id;
	}


	public void setCart_id(Integer cart_id) {
		this.cart_id = cart_id;
	}


	public float getGrand_total() {
		return grand_total;
	}


	public void setGrand_total(float grand_total) {
		this.grand_total = grand_total;
	}

	@OneToMany(mappedBy = "cart")
	public List<CartItem> getCart_items() {
		return cart_items;
	}


	public void setCart_items(List<CartItem> cart_items) {
		this.cart_items = cart_items;
	}

	@OneToOne
	@JoinColumn(name = "cart_uid")
	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}

	@OneToOne(mappedBy = "cart")
	public Orders getOrder1() {
		return order1;
	}


	public void setOrder1(Orders order1) {
		this.order1 = order1;
	}


	
	
	
	
	
	
}
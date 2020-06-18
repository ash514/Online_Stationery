package com.app.pojos;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="cartitem")
public class CartItem {
	
	
	private Integer cartitem_id;
	private int  quantity;
	private float toatalprice;
	
	
	private Product product;
	private Cart cart;
	
	
	public CartItem() {
		System.out.println("in cartitem constructor");
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getCartitem_id() {
		return cartitem_id;
	}


	public void setCartitem_id(Integer cartitem_id) {
		this.cartitem_id = cartitem_id;
	}


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}


	public float getToatalprice() {
		return toatalprice;
	}


	public void setToatalprice(float toatalprice) {
		this.toatalprice = toatalprice;
	}

	@ManyToOne
	@JoinColumn(name = "product_id")
	public Product getProduct() {
		return product;
	}


	public void setProduct(Product product) {
		this.product = product;
	}

	@ManyToOne
	@JoinColumn(name = "cart_id")
	public Cart getCart() {
		return cart;
	}


	public void setCart(Cart cart) {
		this.cart = cart;
	}


	
}

package com.app.pojos;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="orders_details")
public class OrderDetails {
	private Integer detail_id;
	private int quantity;
	private int product_price;
	
	private User user;
	//private Category category;
	private Orders order;
	private BillGeneration bill;
	
	
	public OrderDetails() {
		
		System.out.println("in orderdetails constructor");
		}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getDetail_id() {
		return detail_id;
	}


	public void setDetail_id(Integer detail_id) {
		this.detail_id = detail_id;
	}


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	public int getProduct_price() {
		return product_price;
	}


	public void setProduct_price(int product_price) {
		this.product_price = product_price;
	}

	@OneToOne
	@JoinColumn(name = "user_id")
	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}


	/*
	 * public Category getCategory() { return category; }
	 * 
	 * 
	 * public void setCategory(Category category) { this.category = category; }
	 */

	@OneToOne
	@JoinColumn(name = "order_id")
	public Orders getOrder() {
		return order;
	}


	public void setOrder(Orders order) {
		this.order = order;
	}

	@OneToOne(mappedBy = "orderdetails")
	public BillGeneration getBill() {
		return bill;
	}


	public void setBill(BillGeneration bill) {
		this.bill = bill;
	}


}

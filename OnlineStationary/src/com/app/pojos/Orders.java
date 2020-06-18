package com.app.pojos;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;


@Entity
@Table(name="orders")
public class Orders {
	
	private Integer order_id;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date order_date;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date shipment_date;
	private String order_status;
	
	private OrderDetails orderdetails;
	private Cart cart;
	
	
	public Orders() {
		System.out.println("in order constructor");
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getOrder_id() {
		return order_id;
	}


	public void setOrder_id(Integer order_id) {
		this.order_id = order_id;
	}

	@Temporal(TemporalType.DATE)
	public Date getOrder_date() {
		return order_date;
	}


	public void setOrder_date(Date order_date) {
		this.order_date = order_date;
	}

	@Temporal(TemporalType.DATE)
	public Date getShipment_date() {
		return shipment_date;
	}


	public void setShipment_date(Date shipment_date) {
		this.shipment_date = shipment_date;
	}


	public String getOrder_status() {
		return order_status;
	}


	public void setOrder_status(String order_status) {
		this.order_status = order_status;
	}

	@OneToOne(mappedBy = "order")
	public OrderDetails getOrderdetails() {
		return orderdetails;
	}


	public void setOrderdetails(OrderDetails orderdetails) {
		this.orderdetails = orderdetails;
	}

	@OneToOne
	@JoinColumn(name = "cart_id")
	public Cart getCart() {
		return cart;
	}


	public void setCart(Cart cart) {
		this.cart = cart;
	}

}
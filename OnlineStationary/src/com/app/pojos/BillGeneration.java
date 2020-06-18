package com.app.pojos;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="billgeneration")
public class BillGeneration {
	
	private Integer bill_id;
	private String order_status;
	private String billing_status;
	
	
	private OrderDetails orderdetails;


	public BillGeneration() {
	System.out.println("in billgeneration constructor");	
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getBill_id() {
		return bill_id;
	}


	public void setBill_id(Integer bill_id) {
		this.bill_id = bill_id;
	}


	public String getOrder_status() {
		return order_status;
	}


	public void setOrder_status(String order_status) {
		this.order_status = order_status;
	}


	public String getBilling_status() {
		return billing_status;
	}


	public void setBilling_status(String billing_status) {
		this.billing_status = billing_status;
	}
	@OneToOne
	@JoinColumn(name = "detail_id")
	public OrderDetails getOrderdetails() {
		return orderdetails;
	}


	public void setOrderdetails(OrderDetails orderdetails) {
		this.orderdetails = orderdetails;
	}


	
}

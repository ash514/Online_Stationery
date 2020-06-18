package com.app.pojos;

import javax.persistence.*;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

@Entity  //mandatory
@Table(name="users")
public class User 
{
	private Integer User_id; //must be serializable
	private String User_name;
	@NotEmpty(message = "phone no is required")
	@Length(min = 10,max=10,message = "Invalid phone no")
	private String mobile_Number;
	private int adhar_Number;
	private String address;
	private String city;
	@NotEmpty(message="Email must be supplied")
	@Email(message = "Invalid email format")
	private String email_id;
	private String confirm_password;
	private String password;
	private String role;
	
	
	private Cart cart;
	private OrderDetails Orderdetails;
	
	public User()
	{
		System.out.println("In User default Constructor");
	}
	
	public User(Integer user_id, String user_name, String mobile_Number, int adhar_Number, String address, String city,
			String email_id, String confirm_password, String password, String role) {
		super();
		User_id = user_id;
		User_name = user_name;
		this.mobile_Number = mobile_Number;
		this.adhar_Number = adhar_Number;
		this.address = address;
		this.city = city;
		this.email_id = email_id;
		this.confirm_password = confirm_password;
		this.password = password;
		this.role = role;
		
	}

	public User(String user_name, String mobile_Number, int adhar_Number, String address, String city, String email_id,
			String confirm_password, String password, String role) {
		super();
		User_name = user_name;
		this.mobile_Number = mobile_Number;
		this.adhar_Number = adhar_Number;
		this.address = address;
		this.city = city;
		this.email_id = email_id;
		this.confirm_password = confirm_password;
		this.password = password;
		this.role = role;
	}


	/*public User(String user_name2, String mobile_Number2, int adhar_Number2, String address2, String city2,
			String email_id2, String confirm_password2, String password2, String role2) {
		// TODO Auto-generated constructor stub
		this.User_name = user_name2;
		this.mobile_Number = mobile_Number2;
		this.adhar_Number = adhar_Number2;
		this.address = address2;
		this.city = city2;
		this.email_id = email_id2;
		this.confirm_password = confirm_password2;
		this.password = password2;
		this.role = role2;
	}*/


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getUser_id() {
		return User_id;
	}


	public void setUser_id(Integer user_id) {
		User_id = user_id;
	}

	@Column(length = 20)
	public String getUser_name() {
		return User_name;
	}


	public void setUser_name(String user_name) {
		User_name = user_name;
	}

	@Column(length = 20)
	public String getMobile_Number() {
		return mobile_Number;
	}


	public void setMobile_Number(String mobile_Number) {
		this.mobile_Number = mobile_Number;
	}

	@Column(length = 20)
	public int getAdhar_Number() {
		return adhar_Number;
	}


	public void setAdhar_Number(int adhar_Number) {
		this.adhar_Number = adhar_Number;
	}

	@Column(length = 20)
	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}

	@Column(length = 20)
	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}

	@Column(length = 20)
	public String getEmail_id() {
		return email_id;
	}


	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}

	@Column(length = 20)
	public String getConfirm_password() {
		return confirm_password;
	}


	public void setConfirm_password(String confirm_password) {
		this.confirm_password = confirm_password;
	}

	@Column(length = 20)
	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}

	@Column(length = 20)
	public String getRole() {
		return role;
	}


	public void setRole(String role) {
		this.role = role;
	}

	@OneToOne(mappedBy = "user")
	public Cart getCart() {
		return cart;
	}


	public void setCart(Cart cart) {
		this.cart = cart;
	}

	@OneToOne(mappedBy = "user")
	public OrderDetails getOrderdetails() {
		return Orderdetails;
	}


	public void setOrderdetails(OrderDetails orderdetails) {
		Orderdetails = orderdetails;
	}


}

	
	
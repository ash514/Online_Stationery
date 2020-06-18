package com.app.dao;

import java.util.List;

import com.app.pojos.Product;
import com.app.pojos.User;


public interface IUserDao 
{
	User auntheticateUser(String email_id, String password,String role);
	
	String registerUser(User u);
	
	List<User> listUsers();//here we taking List of User
	
	String deleteUserDetails(int User_id);

	List<Product> showcart(List<Integer> c);

	float getCustomerOrderGrandTotal(int cart_id);
	
}

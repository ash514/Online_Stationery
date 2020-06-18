package com.app.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.app.pojos.Cart;
import com.app.pojos.CartItem;
import com.app.pojos.Product;
import com.app.pojos.User;


import java.util.List;

import org.hibernate.*;

@Repository
@Transactional // MANDATORY
public class UserDaoImpl implements IUserDao 
{
	// dependency
	@Autowired // auto wiring by type
	private SessionFactory sf;
	
	@Autowired 
	private ICartDao cdao;

	
	//For Checking The User is valid or Not
	@Override
	public User auntheticateUser(String email_id, String password,String role) {
		String jpql = "select u from User u where u.email_id=:em and u.password=:pa and u.role=:rl";
		return sf.getCurrentSession().createQuery(jpql, User.class).setParameter("em", email_id).setParameter("pa", password).setParameter("rl", role).getSingleResult();

	}

	//For Register The user
	@Override
	public String registerUser(User u)
	{
		sf.getCurrentSession().persist(u);
		
		Cart c= new Cart();
		sf.getCurrentSession().persist(c);
		c.setUser(u);

		// TODO Auto-generated method stub
		return "User details inserted for User_Id"+u.getUser_id();
	}

	
	
	//Display List List Of Users
	@Override
	public List<User> listUsers() {
		String jpql="select u from User u where u.role=:role";
		
		List<User> u=sf.getCurrentSession().createQuery(jpql,User.class).
				setParameter("role","user").getResultList();
		System.out.println("List of User"+u);
		
		// TODO Auto-generated method stub
		return u;
	}

	@Override
	public String deleteUserDetails(int User_id) {
		Session hs = sf.getCurrentSession();
		User u = hs.get(User.class, User_id);
		if (u != null) {
			hs.delete(u);
			return "User un-subscribed with ID " + u.getUser_id();
		}
		return "User deletion failed : Invalid User ID";
	}

	@Override
	public List<Product> showcart(List<Integer> c) {
		// TODO Auto-generated method stub
		List<Product> prod = null;
		String jpql = "select p from Product p where p.product_id in (:product_id)";
		prod=sf.getCurrentSession().createQuery(jpql, Product.class).setParameterList("product_id",c).getResultList();
		System.out.println(prod);
		return prod;
	}

	
	
	 @Override
	    public float getCustomerOrderGrandTotal(int cart_id) {
	        float grand_total = 0;
	        Cart cart = cdao.getCartById(cart_id); // retrieve the cart using cart service
	        List<CartItem> cartItems = cart.getCart_items(); // list of cart items

	        // Loop through the cart items list
	        for (CartItem item : cartItems) {
	        	grand_total+=item.getToatalprice();
	        }
	        cart.setGrand_total(grand_total);
	        	System.out.println(grand_total);
	       return grand_total;
	    }

	

}

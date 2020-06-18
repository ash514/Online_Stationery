package com.app.dao;

import java.io.IOException;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.app.pojos.Cart;
import com.app.pojos.CartItem;



@Repository
@Transactional
public class CartDaoImpl implements ICartDao{

	
	@Autowired
	SessionFactory sf;
	
	@Autowired
	private IUserDao udao;

	public CartDaoImpl() {
		super();
	}

	@Override
	public Cart getCartById(int cart_id) {
		// TODO Auto-generated method stub
		Session hs= sf.getCurrentSession();
		 Cart c=hs.get(Cart.class, cart_id);
		 return c;
	}
	
	

	@Override
	public Cart validate(int cart_id) throws IOException {
		// TODO Auto-generated method stub
		 Cart cart = getCartById(cart_id);
	        /**
	         * if the cart doesn't exist or there is not cart item in the cart, then throw IOException for our cart
	         */
	        if (cart == null || cart.getCart_items().size() == 0) {
	            throw new IOException(cart_id+"");
	        }
	       
	        return cart;
	}
	
	
	

	  @Override
	  public void update(Cart cart) 
	  {
		  int cart_id = cart.getCart_id(); 
		  float grand_total = udao.getCustomerOrderGrandTotal(cart_id); 
		  cart.setGrand_total(grand_total);;
		  Session session = sf.getCurrentSession(); session.saveOrUpdate(cart);
	  
	 	}


	
	@Override
	public void addCartItem(CartItem cartItem) {
		Session session = sf.getCurrentSession();
		session.saveOrUpdate(cartItem);
		session.flush();

	}
	
	
	@Override
	public List<CartItem> getAllItems(int cart_id, int quantity) {
		// TODO Auto-generated method stub
		Session session = sf.getCurrentSession();
		List<CartItem> cl = session
				.createQuery("select c from CartItem c join fetch c.cart where c.cart.cart_id=:cart_id", CartItem.class)
				.setParameter("cart_id", cart_id).getResultList();
		return cl;
	}
	
	
	
	

	@Override
	public String deleteCartItem(int cartitem_id) {
		Session hs = sf.getCurrentSession();
		CartItem c = hs.get(CartItem.class, cartitem_id);
		if (c != null) {
			hs.delete(c);
			hs.flush();
		return "Cartitem deleted  from cart with id" + c.getCartitem_id();
		}
		return "Cartitem deletion Failed : invalid Product id";
	}

}



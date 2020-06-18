package com.app.dao;

import java.io.IOException;
import java.util.List;

import com.app.pojos.Cart;
import com.app.pojos.CartItem;

public interface ICartDao {

	
	Cart getCartById(int cart_id);

    Cart validate(int cart_id) throws IOException;

	void update(Cart cart);
	
	void addCartItem(CartItem cartItem);
	
    //void removeCartItem(CartItem cartItem);
   
	//void removeAllCartItems(Cart cart);
   
	//CartItem getCartItemByProductId(int productId);
	
	List<CartItem> getAllItems(int cart_id,int quantity);

	String deleteCartItem(int cartitem_id);

	
}

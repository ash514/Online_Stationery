package com.app.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.app.dao.ICartDao;
import com.app.dao.IProductDao;
import com.app.dao.IUserDao;
import com.app.pojos.Cart;
import com.app.pojos.CartItem;
import com.app.pojos.Product;
import com.app.pojos.User;

@Controller
@RequestMapping("/cart")
public class CartController {
	
	@Autowired
	private ICartDao cdao;
	@Autowired
	private IProductDao	 dao;

	@Autowired
	private IUserDao	 udao;

	public CartController() {
		super();
		System.out.println("In Cart Controller");
	}
	
	
	
	 @GetMapping("/add") 
	 public String addtocart() {
	  System.out.println("in add to cart");
		return "/cart/add";
	}
 
	 @PostMapping("/add")
	 public String getCart(@RequestParam int product_id,@RequestParam int quantity, Model model,HttpSession session) 
	 {
	 		 	System.out.println("----------------------");
	 		 	
		    	User c=	(User)session.getAttribute("user_dtls");
		    	System.out.println(c.getCart());
		    	Cart cart=c.getCart();
		    	Product product = dao.getProductDetails(product_id);
		    	CartItem cartItem = new CartItem();
		        cartItem.setProduct(product);
		        cartItem.setQuantity(quantity);
		        
		        //for Total price
		        cartItem.setToatalprice(product.getProduct_price()*cartItem.getQuantity());
		        cartItem.setCart(cart);
		        cdao.addCartItem(cartItem);
			session.setAttribute("cart", cdao.getAllItems(cart.getCart_id(), quantity));
			session.setAttribute("catid",cart.getCart_id());
			/*System.out.println(cartItem);
			System.out.println(cartItem.getToatalprice());
			System.out.println(cartItem.getQuantity());*/
		        return "/cart/showcart";
	 }
	 
	 
	 
	 @GetMapping("/showcart")
	 public String showCart()
	 {
		 System.out.println("in show cart");
		 return "/cart/showcart";
	 }
	
	
	
	 
	 @GetMapping("/grandtotal")
	 public String inshowCart(@RequestParam int cart_id,HttpSession hs)
	 {
		 System.out.println(cart_id);
		 System.out.println("in in process of showcart");
		 hs.setAttribute("gtotal", udao.getCustomerOrderGrandTotal(cart_id));
		 System.out.println("in in process of showcart");
		 
		 return "/cart/grandtotal";
	 }
	 
	 @GetMapping("/remove")
		public String deleteProduct(@RequestParam int cartitem_id, RedirectAttributes flashMap,
				HttpSession hs) {
			System.out.println("in del cartitem " + cartitem_id);
			//flashMap.addFlashAttribute("mesg", dao.deleteEmployeeDetails(eid));
			hs.setAttribute("mesg", cdao.deleteCartItem(cartitem_id));
			return "redirect:/cart/showcart";
			//return "/cart/showcart";
		}
	 

}

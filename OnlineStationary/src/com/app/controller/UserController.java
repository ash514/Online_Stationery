package com.app.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.app.dao.IUserDao;
import com.app.pojos.Product;
import com.app.pojos.User;

@Controller
@RequestMapping("/user")
public class UserController {
	
	
	@Autowired // auto wiring by type
	private IUserDao dao;

	
	@Autowired
	List<Integer> cart=new ArrayList<>();
	
	
	
	public UserController() {
		System.out.println("in user controller constr");
	}

	// request handling method to show login form
	@GetMapping("/login")
	public String showLoginForm() {
		System.out.println("in show login form");
		return "/user/login";
	}
	
	
	@PostMapping("/login")
	public String processLoginForm(Model map, 
			@RequestParam String email_id,
			@RequestParam String password,@RequestParam String role,
			HttpSession hs) 
	{
		System.out.println("in process login form");
		try {
		
			User u = dao.auntheticateUser(email_id, password,role);
			
			map.addAttribute("status", "Login Successful....");
			
			hs.setAttribute("user_dtls", u);
			System.out.println(u);
			if (u.getRole().equals("user")) 
			{
				return "/user/home";
			}
		
			return "/admin/home";
			
		} catch (RuntimeException e) {
			System.out.println("err in user controller " + e);
			map.addAttribute("status", "Invalid Login , Pls retry!!!!");
			return "/user/login";
		}
	
	}
	
	
	// request handling method for user logout
		@GetMapping("/logout")
		public String userLogout(HttpSession hs,Model map,HttpServletRequest request,HttpServletResponse resp) {
			System.out.println("in user logout");
			//copy session attr ---> model map
			map.addAttribute("u_dtls",hs.getAttribute("user_dtls"));
			//set refresh hdr
			resp.setHeader("refresh", "5;url="+request.getContextPath());
			//discard session
			hs.invalidate();
			return "/user/logout";
		}
		
		
		@GetMapping("/delete")
		public String deleteVendor(@RequestParam int vid, RedirectAttributes flashMap) {
			System.out.println("in del vendor " + vid);
			flashMap.addFlashAttribute("mesg", dao.deleteUserDetails(vid));
			// redirect clnt to vendor list page
			return "redirect:/admin/list";
		}
		
		
		
	/*	@GetMapping("/cart")
		public String addToCart(@RequestParam List<Integer> product_id,HttpSession sc)
		{
			
			
			for(Integer id1:product_id)
			cart.add(id1);
			sc.setAttribute("cart", cart);
	       System.out.println("added to cart");
		   return "redirect:/user/plist";
		}*/
		
		
		
		@GetMapping("/showcart")
		public String showCart(HttpSession sc,Model map)
		{
			try
			{
				int sum=0;
				List<Integer> c=new ArrayList<>();
				c=(List<Integer>)sc.getAttribute("cart"); 
				List<Product> p=dao.showcart(c);
			
				for(Product p1:p)
				{
					sum+=p1.getProduct_price();
				}
				map.addAttribute("cart", p);
				sc.setAttribute("sum",sum);
			}
				catch (RuntimeException e) {
				// TODO Auto-generated catch block
				int sum=0;
				sc.setAttribute("sum",sum);
				return "/user/showcart";
			}
			
			return "/user/showcart";
		}
	
		
}


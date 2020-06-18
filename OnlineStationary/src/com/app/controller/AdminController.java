package com.app.controller;

import org.springframework.ui.Model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.app.dao.IProductDao;
import com.app.dao.IUserDao;
import com.app.pojos.User;

@Controller
@RequestMapping("/admin")
public class AdminController{
		
		@Autowired
		private IUserDao dao;
		@Autowired
		private JavaMailSender sender;
		
		@Autowired
		private IProductDao pdao;
		public AdminController()
		{
			
			System.out.println("In Admin Controller");
		}
		
		@GetMapping("/register")
		public String ShowRegistrationForm(User u)
		{
			System.out.println("In Show Registration Form");
			return "/admin/register";
		
		}
		
		@PostMapping("/register")
		public String processRegForm(@RequestParam String User_name,
				@RequestParam String mobile_Number,
				@RequestParam int adhar_Number,
				@RequestParam String address,
				@RequestParam String city,
				@RequestParam String email_id,
				@RequestParam String password,
				@RequestParam String confirm_password,
				@RequestParam String role,
				Model map)
		{
			User u=new User(User_name, mobile_Number, adhar_Number,address,city,  email_id,
					 confirm_password,  password,  role);
			
			System.out.println("in process reg form "+u);
			map.addAttribute("status", dao.registerUser(u));
			
			SimpleMailMessage mesg=new SimpleMailMessage();
			mesg.setTo(u.getEmail_id());
			mesg.setSubject("OnlineStationary");
			mesg.setText("Successfully Registered");
			sender.send(mesg);
			
			
			return "redirect:/user/login";
			
		}
		
		@GetMapping("/user_list")
		public String User_List(Model map)
		{
			System.out.println("In User_List or Details admin controller");
			map.addAttribute("user_list",dao.listUsers());
			return "/admin/user_list" ;
			
		}
		
		
		@GetMapping("/delete")
		public String deleteUser(@RequestParam int User_id, RedirectAttributes flashMap) {
			System.out.println("In Delete User " + User_id);
			flashMap.addFlashAttribute("user_list", dao.deleteUserDetails(User_id));
			// redirect clnt to vendor list page
			return "redirect:/admin/user_list";
		}
		
		
		@GetMapping("/delete_product")
		public String deleteProduct(@RequestParam int product_id, RedirectAttributes flashMap) {
			System.out.println("In Delete User " + product_id);
			flashMap.addFlashAttribute("Delete_Products", pdao.deleteProductDetails(product_id));
			// redirect clnt to vendor list page
			return "redirect:/product/product_details";
		}
}
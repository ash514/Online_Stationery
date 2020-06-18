package com.app.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.app.dao.IProductDao;
import com.app.dao.IUserDao;
import com.app.pojos.Product;

@Controller
@RequestMapping("/product")
public class ProductController {
	
	@Autowired
	private IProductDao dao;
	
	@GetMapping("/add")
	public String showProductForm()
	{
		System.out.println("In Show ProductForm");
		return "/product/add";
	}
	
	@PostMapping("/add")
	public String processAddProduct(@RequestParam Integer stock,
				@RequestParam String product_name,
				@RequestParam int quantity ,
				@RequestParam int product_price,
				@RequestParam String description,
				@RequestParam byte[] image,
				
				Model map)
	{
		Product p=new Product(stock,product_name,quantity,product_price,description,image);
		System.out.println("In Process Add Product Form"+p);
		map.addAttribute("status",dao.addproduct(p));
		return "/admin/user_list";
	
	}
	
	
	@GetMapping("/product_details")
	public String showProductDetails(Model map) {
		System.out.println("in list product controller");
		map.addAttribute("product_list", dao.listProducts());
		return "/admin/product_details";
	}
	
	
	/*@GetMapping("/product_list")
	public String showProductList(Model map) {
		System.out.println("in list product controller");
		map.addAttribute("product_list", dao.listProducts());
		return "/product/product_list";
	}*/
	
	@GetMapping("/category_list")
	public String showCategoryList(Model map)
	{
		System.out.println("in category list admin controller");
		map.addAttribute("category_list", dao.category_list());
		return "/product/category_list";
	}
	
	
	@PostMapping("/category_list")
	public String processCategoryList(Model map,@RequestParam String category,HttpSession hs)
	{
		System.out.println("--In Category List--");
		map.addAttribute("product_list", dao.listProducts());
		return "/product/product_list";
		
	}
	
	
	@GetMapping("/update")
	public String showUpdateForm(@RequestParam int product_id,Model map,Product p)
	{
		System.out.println("in product update form ");
		map.addAttribute("product",dao.getProductDetails(product_id));
		System.out.println(map);
		return "/product/update";
	}
	
	
	@PostMapping("/update")
	public String processUpdateForm(Product p,RedirectAttributes flashMap)
	{
		
		System.out.println("in process update product "+p);
		
		
		flashMap.addFlashAttribute("status", dao.updateProduct(p));
		return "redirect:/product/product_list";
	}
	
	
	@GetMapping("/product_list")
	public String showProductDetailss(Model map) {
		System.out.println("in list product controller");
		map.addAttribute("product_list", dao.listProducts());
		return "/product/product_list";
	}
	
	
	
	/*@GetMapping("/acategory_list")
	public String showACategoryList(Model map)
	{
		System.out.println("in category list admin controller");
		map.addAttribute("category_list", dao.category_list());
		return "/product/acategory_list";
	}
	
	
	@GetMapping("/acategory_list_add")
	public String processACategoryList(Model map,@RequestParam String category,HttpSession hs)
	{
		System.out.println("--In Category List--");
		map.addAttribute("cat", category);
		return "/product/add";

	}*/
}

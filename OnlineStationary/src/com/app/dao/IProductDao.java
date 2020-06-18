package com.app.dao;

import java.util.List;

import com.app.pojos.Category;
import com.app.pojos.Product;

public interface IProductDao {

	String addproduct(Product p);

	List<Product> listProducts();

	List<Category> category_list();
	
	Product getProductDetails(int product_id);

	
	String updateProduct(Product p);
	
	String deleteProductDetails(int product_id);
	
}

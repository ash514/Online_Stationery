package com.app.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.app.pojos.Category;
import com.app.pojos.Product;
import com.app.pojos.User;

@Repository
@Transactional
public class ProductDaoImpl implements IProductDao{
	
	@Autowired
	public SessionFactory sf;

	@Override
	public String addproduct(Product p) {
		sf.getCurrentSession().persist(p);
		// TODO Auto-generated method stub
		return "Product details inserted for Product ID "+p.getProduct_id();
	}

	/*@Override
	public List<Product> listProducts() {
		String jpql="select p from Product p";
		List<Product> p=sf.getCurrentSession().createQuery(jpql,Product.class).getResultList();
		System.out.println("list"+p);
		// TODO Auto-generated method stub
		return p;
		}
		*/
	

	
	@Override
	public List<Category> category_list() {
		String jpql="select c from Category c";
		List<Category> c=sf.getCurrentSession().createQuery(jpql,Category.class).getResultList();
		System.out.println("In List"+c);
		// TODO Auto-generated method stub
		return c;
	}

	@Override
	public List<Product> listProducts() {
		String jpql="select p from Product p";
		List<Product> p=sf.getCurrentSession().createQuery(jpql,Product.class).getResultList();
		System.out.println("list"+p);
		// TODO Auto-generated method stub
		return p;
	}

	@Override
	public String updateProduct(Product p) {
		
		sf.getCurrentSession().update(p);
		// TODO Auto-generated method stub
		return "Product details updated for Product ID "+p.getProduct_id();
		// TODO Auto-generated method stub
		
	}

	@Override
	public Product getProductDetails(int product_id) {
		
		// TODO Auto-generated method stub
		return sf.getCurrentSession().get(Product.class, product_id);
	}

	@Override
	public String deleteProductDetails(int product_id) {
		Session hs = sf.getCurrentSession();
		Product p = hs.get(Product.class, product_id);
		if (p != null) {
			hs.delete(p);
			return "Product un-subscribed with ID " + p.getProduct_id();
		}
		return "Product deletion failed : Invalid Product ID";
	}

}

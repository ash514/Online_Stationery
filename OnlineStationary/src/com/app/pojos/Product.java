package com.app.pojos;

import java.util.Arrays;
import java.util.List;

import javax.persistence.*;
@Entity
@Table(name="products")
public class Product 
{
	
	//data members 
	private Integer product_id;
	private Integer stock;
	private String product_name;
	private int quantity;
	private int product_price;
	private String description;
	private byte[] image;
	
	//private category cart;
	private List<CartItem> cartitem;
	
	
	//constructor
	public Product() {
		
		System.out.println("in default constructor of product");
	}
	
	/*public Product(Integer stock, String product_name, String quantity, int product_price, String description,
			byte[] image, List<CartItem> cartitem) {
		super();
		this.stock = stock;
		this.product_name = product_name;
		this.quantity = quantity;
		this.product_price = product_price;
		this.description = description;
		this.image = image;
		this.cartitem = cartitem;
	}
	*/
	public Product(Integer product_id, Integer stock, String product_name, int quantity, int product_price,
			String description, byte[] image) {
		super();
		this.product_id = product_id;
		this.stock = stock;
		this.product_name = product_name;
		this.quantity = quantity;
		this.product_price = product_price;
		this.description = description;
		this.image = image;
	}
	
	public Product(Integer stock, String product_name, int quantity, int product_price, String description,
			byte[] image) {
		super();
		this.stock = stock;
		this.product_name = product_name;
		this.quantity = quantity;
		this.product_price = product_price;
		this.description = description;
		this.image = image;
	}

	//getters and setters
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getProduct_id() {
		return product_id;
	}
	public void setProduct_id(Integer product_id) {
		this.product_id = product_id;
	}
	
	public Integer getStock() {
		return stock;
	}
	public void setStock(Integer stock) {
		this.stock = stock;
	}
	
	@Column(length = 20)
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getProduct_price() {
		return product_price;
	}
	public void setProduct_price(int product_price) {
		this.product_price = product_price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public byte[] getImage() {
		return image;
	}
	public void setImage(byte[] image) {
		this.image = image;
	}

	@OneToMany(mappedBy = "product",fetch = FetchType.EAGER)
	public List<CartItem> getCartitem() {
		return cartitem;
	}

	public void setCartitem(List<CartItem> cartitem) {
		this.cartitem = cartitem;
	}


	
}

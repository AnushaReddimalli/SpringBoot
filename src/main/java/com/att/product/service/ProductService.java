package com.att.product.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

import org.springframework.stereotype.Service;

import com.att.product.dao.Product;

@Service
public class ProductService {


	HashMap<String, Product> allProducts = new HashMap<String, Product>();
	
	Product p4 = new Product("4","9 Back case","Opus 9999 back case","","image");
	Product p5 = new Product("5","8 Back case","Opus 8888 back case","","image");
	Product p6 = new Product("6","Headphones","Opus MDR headphones","","image");
	Product p1 = new Product("1","Opus 1122","Opus new series","Headphones,9 Back case","image");
	Product p2 = new Product("2","Opus 9999","Opus 9 series","Headphones,8 Back case","image");
	Product p3 = new Product("3","Opus 8888","Opus 8 series","Headphones","image");
		
	public ProductService()
	{
		allProducts.put("1", p1);
		allProducts.put("2", p2);
		allProducts.put("3", p3);
		allProducts.put("4", p4);
		allProducts.put("5", p5);
		allProducts.put("6", p6);
	}

	public ArrayList<Product> getAllProducts()
	{

		ArrayList<Product> productsList = new ArrayList<Product>();

		for(Entry<String, Product> map : allProducts.entrySet()){

			productsList.add(map.getValue());

		}
		return productsList;
	}

	public Product getProduct(String id)
	{
		return allProducts.get(id);
	}

	public ArrayList<Product> addProduct(Product product) {
		allProducts.put(product.getProductId(), product);
		ArrayList<Product> productsList = new ArrayList<Product>();

		for(Entry<String, Product> map : allProducts.entrySet()){

			productsList.add(map.getValue());

		}
		return productsList;
	}

	public ArrayList<Product> updateProduct(String id, Product product) {
		allProducts.replace(id, product);
		ArrayList<Product> productsList = new ArrayList<Product>();

		for(Entry<String, Product> map : allProducts.entrySet()){

			productsList.add(map.getValue());

		}
		return productsList;
	}

	public void deleteProduct(String id) {
		allProducts.remove(id);

	}

}

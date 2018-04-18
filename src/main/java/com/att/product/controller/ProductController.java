package com.att.product.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.att.product.dao.Product;
import com.att.product.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	private ProductService productService;

	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping(path = "/products")

	public ArrayList<Product> getAllProducts()
	{
		return productService.getAllProducts();
	}

	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping(path = "/products/{id}")
	public Product getProduct(@PathVariable String id)
	{
		return productService.getProduct(id);
	}
	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping(path = "/products")
	public ArrayList<Product> addProduct(@RequestBody Product product)
	{
		ArrayList<Product> products = productService.addProduct(product);
		return products;
	}
	@CrossOrigin(origins = "http://localhost:4200")
	@PutMapping(path = "/products/{id}")
	public ArrayList<Product> updateProduct(@RequestBody Product product, @PathVariable String id)
	{
		ArrayList<Product> products = productService.updateProduct(id, product);
		return products;
	}
	@CrossOrigin(origins = "http://localhost:4200")
	@DeleteMapping(path = "/products/{id}")
	public ResponseEntity<String> deleteProduct(@PathVariable String id)
	{
		productService.deleteProduct(id);
		return new ResponseEntity<String>(HttpStatus.OK);
	}
}

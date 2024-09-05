package com.soft.engineer.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.soft.engineer.dom.Cart;
import com.soft.engineer.dom.Product;
import com.soft.engineer.service.IService;

@RestController
public class CartController {
	
	@Autowired
	private IService<Cart> servicio;
	
	@PutMapping("/update-cart/{id}")
	public Cart updateCart(@RequestBody Product product, @PathVariable int id) {
		
		Cart cart = servicio.get(id);
		
		System.out.println(cart);
		
		if(cart.getProducts() == null) {
			cart.setProducts(new ArrayList<Product>());
		}
		
		cart.getProducts().add(product);
		
		return cart;
	}
	
	@GetMapping("/cart/{id}")
	public Cart getCart(@PathVariable int id) {
		
		Cart cart = servicio.get(id);
		
		return cart;
	}
	
	@GetMapping("/cart/info/{id}")
	public String getCartInfo(@PathVariable int id) {
		
		Cart cart = servicio.get(id);
		
		return cart.toString();
	}


}

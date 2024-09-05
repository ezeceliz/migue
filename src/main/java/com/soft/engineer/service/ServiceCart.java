package com.soft.engineer.service;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import com.soft.engineer.dom.Cart;

@Service
public class ServiceCart<T> implements IService<Cart> {

	@Override
	@Cacheable(value = "cart-cache", key = "#id")
	public Cart get(int id) {
		// TODO Auto-generated method stub
		return new Cart(id);
	}

	@Override
	@CacheEvict(value = "cart-cache", key = "#id")
	public void remove(int id) {
		// TODO Auto-generated method stub
	}

}

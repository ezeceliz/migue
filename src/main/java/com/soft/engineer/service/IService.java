package com.soft.engineer.service;

public interface IService<T> {
	
	T get(int id);
	
	void remove(int id);

}

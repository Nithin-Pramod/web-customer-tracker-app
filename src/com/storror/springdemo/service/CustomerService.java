package com.storror.springdemo.service;

import java.util.List;

import com.storror.springdemo.entity.Customer;

public interface CustomerService {
	
	public List<Customer> getCustomers();

	public void save(Customer theCustomer);

	public Customer getCustomers(int theId);

	public void deleteCustomer(int theId);

}

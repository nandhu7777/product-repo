package com.sapient.aem.service;

import java.util.List;
import java.util.Map;

import com.sapient.aem.exception.CustomerException;
import com.sapient.aem.model.Customer;

public interface CustomerService {
	// returns Customer object with the given customer id
	public abstract Customer getCustomerById(Integer customerId) throws CustomerException;
	// returns All Customers 
	public abstract List<Customer> getAllCustomers() throws CustomerException;
	//returns names of all the customer names as List
	public abstract List<String> getAllCustomerNames() throws CustomerException;
	//returns Map with city name as key and number of customers in the city as value
	public Map<String,Integer> getCityCount() throws CustomerException;

}

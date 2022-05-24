package com.sapient.aem.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import com.sapient.aem.dao.CustomerDao;
import com.sapient.aem.dao.CustomerDaoImpl;
import com.sapient.aem.exception.CustomerException;
import com.sapient.aem.model.Customer;



public class CustomerServiceImpl implements CustomerService{

	private CustomerDao customerDao = new CustomerDaoImpl();
	List<Customer> customerList= new ArrayList<>();
	@Override
	public Customer getCustomerById(Integer customerId) throws CustomerException {



		try {
			return customerDao.getCustomerById(customerId);
		}catch(Exception e){
			throw new CustomerException(e.getMessage(),e);
		}




	}





	@Override
	public List<Customer> getAllCustomers() throws CustomerException {
		try {
			return customerDao.getAllCustomers();
		}catch(Exception e){
			throw new CustomerException(e.getMessage(),e);
		}
	}





	@Override
	public List<String> getAllCustomerNames() throws CustomerException {
		try {



			List<String> customerList = customerDao.getAllCustomers()
					.stream().map(m -> m.getName())  
					.collect(Collectors.toList());

			return customerList;



		}catch(Exception e){
			throw new CustomerException(e.getMessage(),e);
		}



	}





	@Override
	public Map<String, Integer> getCityCount() throws CustomerException {
		// TODO Auto-generated method stub
		return null;
	}
}
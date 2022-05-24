package com.sapient.aem.dao;

import java.sql.SQLException;
import java.util.List;

import com.sapient.aem.model.Customer;

public interface CustomerDao {
	public abstract Customer getCustomerById(Integer customerId) throws SQLException;
	public abstract List<Customer> getAllCustomers() throws SQLException;

}

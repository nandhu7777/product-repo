package com.sapient.aem.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.sapient.aem.mapper.QueryMapper;
import com.sapient.aem.model.Customer;

import com.sapient.aem.util.Connections;



public class CustomerDaoImpl implements CustomerDao {

	@Override
	public Customer getCustomerById(Integer customerId) throws SQLException {
		
		Connection connection=null;
		try  {

			connection=Connections.jdbcConnection();
			PreparedStatement preparedStatement= connection.prepareStatement(QueryMapper.GET_CUSTOMER);

			preparedStatement.setInt(1,customerId );
			ResultSet resultSet= preparedStatement.executeQuery();

			if(resultSet.next()) {
				Customer customer =new Customer();

				populateCustomer(resultSet,customer);
				return customer;				
			}else {
				return null;
			}

		}catch(SQLException e) {

			throw e;
		}catch(Exception e) {
			throw new SQLException(e.getMessage());
		}finally {
			connection.close();
		}

	}


	private void populateCustomer(ResultSet resultSet, Customer customer)throws SQLException {
		customer.setCustomerid(resultSet.getInt("customerId"));
		customer.setCustomername(resultSet.getString("customerName"));
		customer.setBirthdate(resultSet.getDate("birthdate").toLocalDate());
		customer.setAddress(resultSet.getString("address"));
		customer.setEmail(resultSet.getString("email"));
		customer.setMobile(resultSet.getLong("mobile"));
		
	}


	@Override
	
	public List<Customer> getAllCustomers() throws SQLException {
		Connection connection=null;
		try {

			connection=Connections.jdbcConnection();
			Statement statement= 
					connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
							ResultSet.CONCUR_UPDATABLE);

			ResultSet resultSet= statement.executeQuery(QueryMapper.SELECT_CUSTOMER);
			int rowcount=0;
			if ( resultSet.last()) {
				rowcount =  resultSet.getRow();
				resultSet.beforeFirst();
			}

			List<Customer> customerList=new ArrayList<Customer>();			
			while(resultSet.next()) {
				Customer customer=new Customer();
				populateCustomer(resultSet,customer);
				customerList.add(customer);				
			}

			return customerList;

		}catch(SQLException e) {
			throw e;
		}catch(Exception e) {
			throw new SQLException(e.getMessage());
		}finally {
			connection.close();
		}
	}


}
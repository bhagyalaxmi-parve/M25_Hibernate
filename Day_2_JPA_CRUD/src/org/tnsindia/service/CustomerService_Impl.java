package org.tnsindia.service;

import org.tnsindia.dao.CustomerDAO_Impl;
import org.tnsindia.dao.Customer_DAO;
import org.tnsindia.entities.Customer;

public class CustomerService_Impl implements Customer_Service{
	
	
	private Customer_DAO dao;
	

	public CustomerService_Impl() {
		super();
		dao = new CustomerDAO_Impl();
	}

	@Override
	public void addCustomer(Customer customer) {
		dao.beginTransaction();
		dao.addCustomer(customer);
		dao.commitTransaction();
		
	}

	@Override
	public void updateCustomer(Customer customer) {
		
		dao.beginTransaction();
		dao.updateCustomer(customer);
		dao.commitTransaction();
		
		
	}

	@Override
	public void deleteCustomer(Customer customer) {
		
		
		dao.beginTransaction();
		dao.deleteCustomer(customer);
		dao.commitTransaction();
		
	}

	@Override
	public Customer getCustomerById(int cust_ID) {
		
		Customer customer = dao.getCustomerById(cust_ID);
		return customer;
	}

}

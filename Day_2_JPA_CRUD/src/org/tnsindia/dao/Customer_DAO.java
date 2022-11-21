package org.tnsindia.dao;

import org.tnsindia.entities.Customer;

public interface Customer_DAO {
	
	void addCustomer(Customer customer);
	void updateCustomer(Customer customer);
	void deleteCustomer(Customer customer);
	Customer getCustomerById(int cust_ID);
	void beginTransaction();
	void commitTransaction();

}

package org.tnsindia.service;

import org.tnsindia.entities.Customer;

public interface Customer_Service {
	
	void addCustomer(Customer customer);
	void updateCustomer(Customer customer);
	void deleteCustomer(Customer customer);
	Customer getCustomerById(int cust_ID);

}

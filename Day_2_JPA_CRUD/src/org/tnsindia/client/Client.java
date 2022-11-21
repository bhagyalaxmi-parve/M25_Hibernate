package org.tnsindia.client;

import java.util.Scanner;

import org.tnsindia.entities.Customer;
import org.tnsindia.service.CustomerService_Impl;
import org.tnsindia.service.Customer_Service;

public class Client {

	public static void main(String[] args) {
		Customer_Service service = new CustomerService_Impl();
		Customer customer = new Customer();
		Scanner sc = new Scanner(System.in);
		
		//create
//		customer.setCust_ID(1001);
//		customer.setName("Sakshi Jadhav");
//		service.addCustomer(customer);
		
		
		
//		
//		customer.setCust_ID(1003);
//		customer.setName("Sarita jadhav");
//		service.addCustomer(customer);
//		System.out.println("CUSTOMER ADDED SUCCESSFULLY");
		
		
		//retrieve
		/*customer= service.getCustomerById(1001);
		System.out.println("Customer ID :"+customer.getCust_ID());
		System.out.println("Customer Name :"+customer.getName());*/
		
		
		
		//updation
		/*System.out.println("Enter customer ID for the updation");
		customer = service.getCustomerById(sc.nextInt());
		customer.setName("aanand p");
		service.updateCustomer(customer);*/
		
		
		
		/*System.out.println("Enter customer ID for the updation");
		customer = service.getCustomerById(sc.nextInt());
		customer.setName("shubhangi p");
		service.updateCustomer(customer);
		
		System.out.println("CUSTOMER UPDATED SUCCESSFULLY");*/
		
		
		//deletion
		System.out.println("Enter customer ID for the deletion");
		customer=service.getCustomerById(sc.nextInt());
		service.deleteCustomer(customer);
		System.out.println("CUSTOMER DELETED SUCCESSFULLY");
		
		

	}

}

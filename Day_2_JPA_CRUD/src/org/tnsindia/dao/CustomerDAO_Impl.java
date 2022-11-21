package org.tnsindia.dao;

import javax.persistence.EntityManager;

import org.tnsindia.entities.Customer;

public class CustomerDAO_Impl implements Customer_DAO {

	
	private  EntityManager em;


	public CustomerDAO_Impl() {
		super();
		em = JPAUtil.getEntityManager();
		
	}



	@Override
	public void addCustomer(Customer customer) {
		// TODO Auto-generated method stub
		em.persist(customer);
		
	}


	@Override
	public void updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		em.merge(customer);
		
	}


	@Override
	public void deleteCustomer(Customer customer) {
		// TODO Auto-generated method stub
		em.remove(customer);
		
	}
	


	@Override
	public Customer getCustomerById(int cust_ID) {
		Customer customer = em.find(Customer.class, cust_ID);
		return customer;
	}


	@Override
	public void beginTransaction() {
		// TODO Auto-generated method stub
		em.getTransaction().begin();
		
	}


	@Override
	public void commitTransaction() {
		// TODO Auto-generated method stub
		em.getTransaction().commit();
		
	}


	
	


}

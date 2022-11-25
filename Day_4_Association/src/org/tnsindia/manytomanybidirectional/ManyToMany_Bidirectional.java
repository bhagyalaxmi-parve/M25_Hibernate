package org.tnsindia.manytomanybidirectional;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ManyToMany_Bidirectional {

	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();

		

		Product p1 = new Product();
		p1.setId(1);
		p1.setName("TV");
		p1.setPrice(45000);

		Product p2 = new Product();
		p2.setId(2);
		p2.setName("Washing Machine");
		p2.setPrice(8000);

		Product p3 = new Product();
		p3.setId(3);
		p3.setName("Fan");
		p3.setPrice(2000);

		Product p4 = new Product();
		p4.setId(4);
		p4.setName("Face Wash");
		p4.setPrice(250);

		
		Order o1 = new Order();
		o1.setId(1000);
		o1.setPurchaseDate(new Date());

		o1.addProduct(p1);
		o1.addProduct(p2);
		o1.addProduct(p3);
		o1.addProduct(p4);

	
		Order o2 = new Order();
		o2.setId(1001);
		o2.setPurchaseDate(new Date());

		o2.addProduct(p1);		
		o2.addProduct(p2);
		o2.addProduct(p3);
		o2.addProduct(p4);

		
		em.persist(o1);
		em.persist(o2);
		
		System.out.println("DATA ADDED SUCCESSFULLY..");

		em.getTransaction().commit();
		em.close();
		factory.close();
	}
}
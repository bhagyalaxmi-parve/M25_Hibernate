package org.tnsindia.joinedinheritance;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Joined_Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		EntityManagerFactory f= Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = f.createEntityManager();
		em.getTransaction().begin();
		
		
		//create a sales
		
		
		Sales s1 = new Sales();
		s1.setSales_ID(1201);
		s1.setPrice(5000.00);
		em.persist(s1);
		
		Sales s2 = new Sales();
		s2.setSales_ID(1202);
		s2.setPrice(6700.00);
		em.persist(s2);
		
		
		//salesDepartment
		Sales_Department d1 = new Sales_Department();
		d1.setSales_ID(1031);
		d1.setDept_Id(1301);
		d1.setDept_Name("Cosmentic");
		d1.setPrice(7777);
		em.persist(d1);
		
		
		em.getTransaction().commit();
		System.out.println("DATA IS ADDED");
		em.close();
		f.close();
		
		
		
		
		
		
	}

}

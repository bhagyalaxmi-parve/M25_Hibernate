package org.tnsindia.onetooneunidirectional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class OneToOneUnidirectional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory f = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = f.createEntityManager();
		em.getTransaction().begin();
		
		Student s1 = new Student();
		s1.setID(1001);
		s1.setNAME("abc");
		
		Address a1= new Address();
		a1.setStreetNo(12);
		a1.setArea("nashik road");
		a1.setCity("nashik");
		
		s1.setAddress(a1);
		em.persist(s1);
		
		Student s2 = new Student();
		s2.setID(1002);
		s2.setNAME("xyz");
		
		
		Address a2= new Address();
		a2.setStreetNo(9);
		a2.setArea("pathardi phata");
		a2.setCity("nashik");
		s2.setAddress(a2);
		em.persist(s2);
		
		em.getTransaction().commit();
		System.out.println("DATA ADDED");
		f.close();		
		
		
		
		
		
		
	}

}

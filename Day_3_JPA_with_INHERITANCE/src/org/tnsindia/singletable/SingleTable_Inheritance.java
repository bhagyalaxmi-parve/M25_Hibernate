package org.tnsindia.singletable;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class SingleTable_Inheritance {

	public static void main(String[] args) {
		
		
		EntityManagerFactory f= Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = f.createEntityManager();
		em.getTransaction().begin();
	
		Employee e = new Employee();
		e.setEmpId(1001);
		e.setName("xyz");
		e.setSalary(70000.50);
		em.persist(e);
		
		
		Employee e1= new Employee();
		e1.setEmpId(1002);
		e1.setName("ddd");
		e1.setSalary(23466.89);
		em.persist(e1);
		
		
		//manager
		Manager m = new Manager();
		
		m.setEmpId(123);
		m.setName("aaand");
		m.setSalary(87000.00);
		m.setDeptname("hr");
		em.persist(m);
		
		
		
		em.getTransaction().commit();
		System.out.println("Data Added");	
		em.close();
		f.close();

	}

}

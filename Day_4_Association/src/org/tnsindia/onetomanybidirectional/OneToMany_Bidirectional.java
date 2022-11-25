package org.tnsindia.onetomanybidirectional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class OneToMany_Bidirectional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory f = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = f.createEntityManager();
		em.getTransaction().begin();
		
		Department d1= new Department();
		d1.setId(121);
		d1.setName("HR");
		em.persist(d1);
		
		
		Department d2= new Department();
		d2.setId(122);
		d2.setName("MARKETING");
		em.persist(d2);
		
		
		
		//create employee1
		Employee e1 =new Employee();
		e1.setEmp_id(111);
		
		e1.setEmp_name("aaa");
		e1.setEmp_salary(60000);
		e1.setDepartment(d1);
		em.persist(e1);
	
	
		Employee e2 =new Employee();
		e2.setEmp_id(222);
		e2.setEmp_name("xyz");
		e2.setEmp_salary(750000);
		e2.setDepartment(d2);
		em.persist(e2);
	    
		
		
		em.getTransaction().commit();	
	    System.out.println("DATA ADDED SUCCESSFULLY");
	    em.close();
	    f.close();
	    
	
	}

}

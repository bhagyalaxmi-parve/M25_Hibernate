package org.tnsindia.tableperclass;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TablePerClass_Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		EntityManagerFactory f = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = f.createEntityManager();
		em.getTransaction().begin();
		
		
		//create vehicle 
		
		Vehicle v1 = new Vehicle();
		v1.setVehicle_No(1643);
		v1.setVehicle_Name("SCOOTER");
		v1.setVehicle_type("Two Wheeler");
		em.persist(v1);
		
		
		Vehicle v2 = new Vehicle();
		v2.setVehicle_No(12333);
		v2.setVehicle_Name("VAN");
		v2.setVehicle_type("Four Wheeler");
		em.persist(v2);
		
		
		Vehicle v3 = new Vehicle();
		v3.setVehicle_No(10023);
		v3.setVehicle_Name("DRUMP_TRUCK");
		v3.setVehicle_type("Four Wheeler");
		em.persist(v3);
		
		
		Car c= new Car();
		c.setVehicle_No(14523);
		c.setVehicle_Name("Nano");
		c.setVehicle_type("Four Wheeler");
		c.setPrice(150000);
		em.persist(c);
		
		
		em.getTransaction().commit();

		System.out.println("DATA ADDED SUCCESSFULLY");
		em.close();
		f.close();
		
		
		
		
		

	}

}

package org.tnsindia.joinedinheritance;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;


@Entity
@Table(name="Sales")
@Inheritance(strategy=InheritanceType.JOINED)
public class Sales implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private int Sales_ID;
	private double price;
	
	//setters and getters
	public int getSales_ID() {
		return Sales_ID;
	}
	public void setSales_ID(int sales_ID) {
		Sales_ID = sales_ID;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
	

}

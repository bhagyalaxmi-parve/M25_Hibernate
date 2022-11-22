package org.tnsindia.tableperclass;


import javax.persistence.Entity;

import javax.persistence.Table;


@Entity
@Table(name="Car")
public class Car extends Vehicle{
	

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
	
	

}

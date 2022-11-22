package org.tnsindia.tableperclass;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;


@Entity
@Table(name="Vehicle")
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public class Vehicle implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	@Id
	private int Vehicle_No;
	private String Vehicle_Name;
	private String Vehicle_type;
	
	public int getVehicle_No() {
		return Vehicle_No;
	}
	public void setVehicle_No(int vehicle_No) {
		Vehicle_No = vehicle_No;
	}
	public String getVehicle_Name() {
		return Vehicle_Name;
	}
	public void setVehicle_Name(String vehicle_Name) {
		Vehicle_Name = vehicle_Name;
	}
	public String getVehicle_type() {
		return Vehicle_type;
	}
	public void setVehicle_type(String vehicle_type) {
		Vehicle_type = vehicle_type;
	}
	
	
	

}

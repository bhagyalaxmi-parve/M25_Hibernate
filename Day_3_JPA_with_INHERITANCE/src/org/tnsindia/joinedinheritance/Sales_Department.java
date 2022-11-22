package org.tnsindia.joinedinheritance;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Sales_Department")
public class Sales_Department extends Sales{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int Dept_Id;
	private String Dept_Name;
	
	
	
	public int getDept_Id() {
		return Dept_Id;
	}
	public void setDept_Id(int dept_Id) {
		Dept_Id = dept_Id;
	}
	public String getDept_Name() {
		return Dept_Name;
	}
	public void setDept_Name(String dept_Name) {
		Dept_Name = dept_Name;
	}
	
	
	
	
	
	
	
}

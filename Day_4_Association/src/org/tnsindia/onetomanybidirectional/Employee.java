package org.tnsindia.onetomanybidirectional;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Employee1")
public class Employee implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private int emp_id;
	private String emp_name;
	private double emp_salary;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="id")
	private Department  department;

	public int getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}

	public String getEmp_name() {
		return emp_name;
	}

	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}

	public double getEmp_salary() {
		return emp_salary;
	}

	public void setEmp_salary(double emp_salary) {
		this.emp_salary = emp_salary;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	
	//getters and setters
	

		

}

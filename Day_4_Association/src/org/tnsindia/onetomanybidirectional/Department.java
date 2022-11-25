package org.tnsindia.onetomanybidirectional;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="department")
public class Department {
	
	
	
	
	@Id
	//id is a primary key
	private int id;
	private String name;
	
	
	@OneToMany(mappedBy="department")
	private Set<Employee> emp;

	
	
	//getters and setters
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Employee> getEmp() {
		return emp;
	}

	public void setEmp(Set<Employee> emp) {
		this.emp = emp;
	}
	
	

	

}

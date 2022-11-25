package org.tnsindia.onetooneunidirectional;



import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Address")
public class Address {
	
	
	@Id
	private int StreetNo;
	private String area;
	private String city;
	
	public int getStreetNo() {
		return StreetNo;
	}
	public void setStreetNo(int streetNo) {
		StreetNo = streetNo;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	

}

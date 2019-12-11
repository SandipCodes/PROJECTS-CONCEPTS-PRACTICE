
/* @Copyright,2019 YBM Inc.  Disclosing valuable information should be avoided. 
 * All the rights are reserved by YBM Inc. 
 * Terms and condition will apply.
 */


package com.app.programs;

import java.util.ArrayList;
import java.util.List;

/**
 *  Description: This class is intended to:
 *  @author Sandip Humbe
 *  Written On:  Dec 6, 2019 
 */

public class Employee {

	private String name;
	private String city;
	
	
	public Employee(String name, String city) {
		super();
		this.name = name;
		this.city = city;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Employee [name=").append(name).append(", city=").append(city).append("]");
		return builder.toString();
	}
	public static List<Employee> getAll() {
		
		List<Employee> list=new ArrayList<>();
		
		list.add(new Employee("sandip", "pune"));
		list.add(new Employee("sachin", "osbad"));
		list.add(new Employee("swapnil", "baramati"));

		return list;
	}
	
	
	
}

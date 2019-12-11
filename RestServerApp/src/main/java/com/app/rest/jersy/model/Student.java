
/* @Copyright,2019 YBM Inc.  Disclosing valuable information should be avoided. 
 * All the rights are reserved by YBM Inc. 
 * Terms and condition will apply.
 */

package com.app.rest.jersy.model;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Description: This class is intended to:
 * 
 * @author Sandip Humbe Written On: Nov 21, 2019
 */
@XmlRootElement
public class Student {

	private String studentId;
	private String firstName;
	private String lastName;
	private String city;

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
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
		builder.append("Student [studentId=").append(studentId).append(", firstName=").append(firstName)
				.append(", lastName=").append(lastName).append(", city=").append(city).append("]");
		return builder.toString();
	}

}

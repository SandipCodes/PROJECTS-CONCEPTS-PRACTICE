
/* @Copyright,2019 YBM Inc.Disclosing valuable information should be avoided. 
 * All the rights are reserved by YBM Inc. 
 * Terms and condition will apply.
 */

package com.app.rest.jersy.api;

import javax.jws.WebParam;
import javax.management.MXBean;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.xml.ws.BindingType;

import com.app.rest.jersy.model.Student;

/**
 * Description: This class is intended to:
 * 
 * @author Sandip Humbe Written On: Nov 20, 2019
 */

@Path("/student")
public class StudentServiceApi {

	@GET
	@Produces("text/plain")
	//@Path("/test")
	public String test() {

		return "Welcome to Rest Api.";

	}
	
	@GET
	@Produces("text/plain")
	@Path("/plaintext")
	public String plainText() {
		return "This is plain a Text.";
	}
	
	@GET
	@Produces("text/html")
	@Path("/htmltext")
	public String htmlText() {
		return" <html><body><h1>This is a html Text.</h1></body></html>";
	}
	
	@GET
	@Produces("text/xml")
	@Path("/xmltext")
	public String xmlText() {
		
		return"<message>This is a xml text</message>";
	}

	
	@GET
	@Produces({"application/json","application/xml"})
	@Path("/getstu")
	public Student getStudent() {
		Student st=new Student();
		st.setStudentId("100");
		st.setFirstName("sandip");
		st.setLastName("humbe");
		st.setCity("pune");
		
		return st;
	}
	

	@POST
	@Produces({"application/json","application/xml"})
	@Consumes("application/json")
	@Path("/savestu")
	public Student saveStudent(@WebParam Student st) {
		 
		return st;
	}
}// class

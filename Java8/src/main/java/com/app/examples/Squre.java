
/* @Copyright,2019 YBM Inc.  Disclosing valuable information should be avoided. 
 * All the rights are reserved by YBM Inc. 
 * Terms and condition will apply.
 */


package com.app.examples;


/**
 *  Description: This class is intended to:
 *  @author Sandip Humbe
 *  Written On:  Dec 7, 2019 
 */

@FunctionalInterface
public interface Squre {

	 public int calSquare(int a);
	//public int cube(int a);
	default void dummy() {
		System.out.println("Squre.dummy()");
	}
	public static void main(String args[]) {
		
		System.out.println("Squre.main()");
	}
}

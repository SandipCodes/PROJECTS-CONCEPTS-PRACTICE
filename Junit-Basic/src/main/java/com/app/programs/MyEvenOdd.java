
/* @Copyright,2019 YBM Inc.  Disclosing valuable information should be avoided. 
 * All the rights are reserved by YBM Inc. 
 * Terms and condition will apply.
 */


package com.app.programs;


/**
 *  Description: This class is intended to:
 *  @author Sandip Humbe
 *  Written On:  Dec 6, 2019 
 */

public class MyEvenOdd {

	
	public boolean isEvenNumber(int num){
		
		/*if(num % 2==0) {
			return true;
		}
		else {
			return false;
		}*/
		
		return(num%2==0? true:false);
	}
	public boolean isGreat(int num1,int num2) {
		
		return((num1>num2? true:false));
	}
}

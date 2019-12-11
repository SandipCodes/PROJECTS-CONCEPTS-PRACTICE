
/* @Copyright,2019 YBM Inc.  Disclosing valuable information should be avoided. 
 * All the rights are reserved by YBM Inc. 
 * Terms and condition will apply.
 */


package com.app.programs;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

/**
 *  Description: This class is intended to:
 *  @author Sandip Humbe
 *  Written On:  Dec 6, 2019 
 */

public class MyEvenOddTest {

    MyEvenOdd evenOdd=new MyEvenOdd();
 
	@BeforeClass
	public static void beforeClass(){
		System.out.println("MyEvenOddTest.beforeClass()");
		}
	
	@Before
	public void beforeTest() {
		System.out.println("MyEvenOddTest.beforeTest()");
	}
	@Test
	public void testIsEvenNumber() {
		//assertTrue("number is not even", evenOdd.isEvenNumber(19));
	    System.out.println("MyEvenOddTest.testIsEvenNumber()");
		assertFalse("number is  even", evenOdd.isEvenNumber(21));
	}
	
	@Test
	public void testIsGreat() {
		System.out.println("MyEvenOddTest.testIsGreat()");
		assertTrue(evenOdd.isGreat(20, 10));
	}
	
	@Test
	public void testAssertArrayEquals() {
		
		System.out.println("MyEvenOddTest.testAssertArrayEquals()");
		String expectedOutput[]= {"mango","orange","papaya"};
	//	String actualOutput[]= {"mango","orange","pineapple"};
		String actualOutput[]= {"mango","orange","papaya"};
		
		//assertArrayEquals(expectedOutput, actualOutput);
		assertArrayEquals(expectedOutput, actualOutput);
	}
	
	@After
	public void afterTest() {
		System.out.println("MyEvenOddTest.afterTest.enclosing_method()");
	}

	@AfterClass
	public static void afterClass() {
		System.out.println("MyEvenOddTest.afterClass.enclosing_method()");
	}
}

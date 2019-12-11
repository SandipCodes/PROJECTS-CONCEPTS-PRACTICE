
/* @Copyright,2019 YBM Inc.  Disclosing valuable information should be avoided. 
 * All the rights are reserved by YBM Inc. 
 * Terms and condition will apply.
 */


package com.app.service.impl.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

import java.util.ArrayList;
import java.util.List;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.app.model.Account;
import com.app.service.AccountService;
import com.app.service.impl.AccountServiceImpl;

/**
 *  Description: This class is intended to:
 *  @author Sandip Humbe
 *  Written On:  Dec 7, 2019 
 */

public class AccountServiceImplTest {

	AccountService accountService=new AccountServiceImpl();
  	Account account=new Account();
	@BeforeClass
	public static void setup() {
	   System.out.println("AccountServiceImplTest.setup()");	
	}
	
	@Test
	public void testSaveAccount() {
	 	System.out.println("AccountServiceImplTest.testSaveAccount()");
	 	account.setAccountId(101);
	 	account.setOwner("sandip");
	 	account.setCity("pune");
	 	
	 	assertSame(account, accountService.saveAccount(account));
	}
	
	@Test
	public void testUpdateAccount() {
		System.out.println("AccountServiceImplTest.testUpdateAccount()");
		
	assertNotSame(account.getAccountId(), accountService.updateAccount(account).getAccountId());
	}
	
	@Test
	public void testDeleteAccount() {
		System.out.println("AccountServiceImplTest.testDeleteAccount()");
		assertNull(accountService.deleteAccount(account));
	}
	@Test
	public void testGetAllAccounts() {
		System.out.println("AccountServiceImplTest.testGetAllAccounts()");
		List<Account> list=new ArrayList<>();
		list.add(new Account(100,"sandip","pune"));
		list.add(new Account(101,"sandip","pune"));
		list.add(new Account(100,"sandip","pune"));
	    
		assertEquals(list, accountService.getAllAccounts());
	}
	@AfterClass
	public static void tirerDown() {
		System.out.println("AccountServiceImplTest.tirerDown()");
	}
	
}

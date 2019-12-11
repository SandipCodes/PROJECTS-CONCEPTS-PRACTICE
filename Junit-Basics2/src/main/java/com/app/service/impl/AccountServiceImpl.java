
/* @Copyright,2019 YBM Inc.  Disclosing valuable information should be avoided. 
 * All the rights are reserved by YBM Inc. 
 * Terms and condition will apply.
 */


package com.app.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.app.model.Account;
import com.app.service.AccountService;

/**
 *  Description: This class is intended to:
 *  @author Sandip Humbe
 *  Written On:  Dec 7, 2019 
 */

public class AccountServiceImpl implements AccountService {

	@Override
	public Account saveAccount(Account ac) {
		return ac;
	}

	@Override
	public Account updateAccount(Account ac) {
		ac.setAccountId(200);
		ac.setCity("osmanabad");
		ac.setOwner("sachin");
		return ac;
	}

	@Override
	public Account deleteAccount(Account ac) {
         ac=null;
		return ac;
	}

	@Override
	public List<Account> getAllAccounts() {
		List<Account> accountList=new ArrayList<Account>();
		accountList.add(new Account(100,"sandip","pune"));
		accountList.add(new Account(101,"sandip","pune"));
		accountList.add(new Account(100,"sandip","pune"));
	    return accountList;
	}

}

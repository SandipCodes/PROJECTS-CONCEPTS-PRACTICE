
/* @Copyright,2019 YBM Inc.  Disclosing valuable information should be avoided. 
 * All the rights are reserved by YBM Inc. 
 * Terms and condition will apply.
 */


package com.app.service;

import java.util.List;

import com.app.model.Account;

/**
 *  Description: This class is intended to:
 *  @author Sandip Humbe
 *  Written On:  Dec 7, 2019 
 */

public interface AccountService {

	public Account saveAccount(Account ac);
	public Account updateAccount(Account ac);
	public Account deleteAccount(Account ac);
	public List<Account> getAllAccounts();
}

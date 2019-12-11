
/* @Copyright,2019 YBM Inc.  Disclosing valuable information should be avoided. 
 * All the rights are reserved by YBM Inc. 
 * Terms and condition will apply.
 */


package com.app.model;


/**
 *  Description: This class is intended to:
 *  @author Sandip Humbe
 *  Written On:  Dec 7, 2019 
 */

public class Account {

	private Integer accountId;
	private String owner;
	private String city;
	
	
	public Account() {
		// TODO Auto-generated constructor stub
	}
	public Account(Integer accountId) {
		this.accountId = accountId;
	}
	
	public Account(Integer accountId, String owner, String city) {
		super();
		this.accountId = accountId;
		this.owner = owner;
		this.city = city;
	}
	public Integer getAccountId() {
		return accountId;
	}
	public void setAccountId(Integer accountId) {
		this.accountId = accountId;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
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
		builder.append("Account [accountId=").append(accountId).append(", owner=").append(owner).append(", city=")
				.append(city).append("]");
		return builder.toString();
	}
}

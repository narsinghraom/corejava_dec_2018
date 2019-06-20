package com.vtalent.nageswar;

import java.io.Serializable;

public class BankAccount implements Serializable {

	static double minBal=5000;
	private long accNo;
	private String accHName;
	private String userName;
	private transient String password;
	private transient double balence;
	 
	public long getAccNo() {
		return accNo;
	}
	public void setAccNo(long accNo) {
		this.accNo = accNo;
	}
	public String getAccHName() {
		return accHName;
	}
	public void setAccHName(String accHName) {
		this.accHName = accHName;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public double getBalence() {
		return balence;
	}
	public void setBalence(double amt) {
		this.balence = balence+amt;
	}
	public String toString() {
		return "accNo:"+accNo+"\n"+
		       "accHName:"+accHName+"\n"+
				"userName:"+userName+"\n"+
				"password:"+password+"\n"+
				"balence:"+balence+"\n"+
				"minBalence:"+minBal+"\n";
	}
	
	
}

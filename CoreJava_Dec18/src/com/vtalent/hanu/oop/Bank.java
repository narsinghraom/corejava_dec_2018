package com.vtalent.hanu.oop;

public class Bank {
	
	private double balance;

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		if (balance<=0) {
			System.out.println("Do not be a -ve amount..");
		}else {
			this.balance = balance;
					
		}
	}
	
	

}

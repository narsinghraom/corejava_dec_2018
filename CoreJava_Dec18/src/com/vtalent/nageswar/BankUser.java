package com.vtalent.nageswar;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class BankUser {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//create object input Stream object
		ObjectInputStream ois=new ObjectInputStream(new FileInputStream("BankAccountsinfo.ser"));
		//casting returned object to Bank type
		BankAccount accDtls=(BankAccount) ois.readObject();
		//print bank object date
		System.out.println(accDtls.getAccHName()+"details");
		System.out.println(accDtls);
		

	}

}

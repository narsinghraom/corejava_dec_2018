package com.vtalent.nageswar;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class BankTransaction {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		//create bank account object
		BankAccount acc=new BankAccount();
		//setting bank object state
		acc.setAccNo(0607100);
		acc.setAccHName("Nageswar");
		acc.setUserName("tiger");
		acc.setPassword("loveyoubaby");
		acc.setBalence(10000);
		//print bank object state
		System.out.println(acc);
		//creating object output stream object
		ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("BankAccountsinfo.ser"));
		//writing bank object state to file
		oos.writeObject(acc);
		System.out.println("object written to file");
	}

}

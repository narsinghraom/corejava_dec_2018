package com.vtalent.sujith.oops;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter id");
		int id=sc.nextInt();
		System.out.println("enter name");
		String name=sc.next();
		System.out.println("enter salary");
		double salary=sc.nextDouble();
		
		System.out.println("id=       "+id);
		System.out.println("name=     "+name);
		System.out.println("salary=   "+salary);


	}

}

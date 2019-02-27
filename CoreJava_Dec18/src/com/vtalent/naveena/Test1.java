package com.vtalent.naveena;

import java.util.Scanner;

public class Test1 {
	int empId;
	double empSalary;


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter number howmany employees do you want store");
		int n = scn.nextInt();
		Test1[] ts = new Test1[n];
		System.out.println("Select below options as for your requirement");
		System.out.println("1.Insert Employee Data");
		System.out.println("2.Delete employee data");
		System.out.println("3.View employees Data");
		System.out.println("4.Exit ");
	

	}

}

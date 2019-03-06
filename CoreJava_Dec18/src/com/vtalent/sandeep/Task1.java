package com.vtalent.sandeep;

import java.util.Scanner;
	
public class Task1 {
	
     int empId;
     double empSalary;


		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner scn
			= new Scanner(System.in);
			System.out.println("Enter number howmany employees do you want store");
			int n = scn.nextInt();
			Task1[] ts = new Task1[n];	
			System.out.println("Select below options as for your requirement");
			System.out.println("1.Insert Employee Data");
			System.out.println("2.Delete employee data");
			System.out.println("3.View employees Data");
			System.out.println("4.Exit ");
		}
	}


package com.vtalent.naresh;

import java.util.ArrayList;
import java.util.Scanner;

public class DBOperationsTest {
		Scanner sc = new Scanner(System.in);
		public void inputdata() {
			int size;
			DBOperations db=new DBOperations();
				System.out.println("Enter the no.of Employees to be stored");
				size = sc.nextInt();
				for (int i = 0; i <= size - 1; i++) {
					System.out.println("Enter " + (i + 1) + " EmployeeData ");
					Employee emp = new Employee();
					System.out.println("Enter Id:");
					emp.setEmployId(sc.nextInt());
					System.out.println("Enter Employ Name");
					emp.setEmployname(sc.next());
					System.out.println("Enter Package:");
					emp.setEmployPackage(sc.nextDouble());
					
					db.insertData(emp);
				}
					 
		 	}
		
		public static void main(String [] args) {
			System.out.println("hi");
					DBOperationsTest dbt=new DBOperationsTest();
						dbt.inputdata();
			
												}
	}

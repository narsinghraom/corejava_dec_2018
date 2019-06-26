package com.vtalent.sanjana;

import java.util.*;
import java.util.Scanner;

public class EmpListTest {
	public static void main(String[] args) throws Exception
	{
		//Employee emp=new Employee();
		EmpList elt=new EmpList();
		Scanner sc= new Scanner(System.in);
		int choice;

		do
		{
			
	      System.out.println("Select an Option:"+'\n'+"1. Insert an Employee"+'\n'+"2. Update an Employee"+'\n'+"3. Delete an Employee"+'\n'+"4. Search an Employee"+'\n'+"5. Print All Employee Data"+'\n'+"6. Loan Status"+'\n'+"7. Exit");

		System.out.println("Enter the option num");
		choice=sc.nextInt();
	switch(choice)
	{
	case 1:
		System.out.println("Enter num of employees to insert");
		int size=sc.nextInt();
		//EmployeeOperations.empArray=new Employee[size];
		for(int i=0;i<=size-1;i++)
		{
			Employee emp=new Employee();	
			System.out.println("Enter "+(i+1)+" Employee Data");
			System.out.println("Enter Id");
			emp.setEmployeeId(sc.nextInt());
			System.out.println("Enter Name");
			emp.setEmployeeName(sc.next());
			System.out.println("Enter Package");
			emp.setEmployeePackage(sc.nextDouble());
			emp.setEmployeeSalary(emp.getEmployeePackage());

			elt.insertData(emp);

			 
		}
		  break;
	case 2:
		System.out.println("Enter id to be updated");
		int id1=sc.nextInt();
		EmpList.update(id1);
		break;
	case 3:
		System.out.println("Enter id to be deleted");
		int id=sc.nextInt();
		
		EmpList.deleteEmployee(id);
		break;
	case 4:
		System.out.println("Enter id to search");
		int id2=sc.nextInt();
		EmpList.searchEmployee(id2);
		break;
	case 5:
		
		EmpList.printAllEmployeeData();
		
		break;
	}}
		while(choice!=7);
}}
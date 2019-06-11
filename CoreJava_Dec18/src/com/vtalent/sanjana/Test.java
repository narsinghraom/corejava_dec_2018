package com.vtalent.sanjana;


import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

public class Test implements Serializable{
	
	

	public static void main(String[] args) throws Exception
	{
		Employee emp=new Employee();
		EmployeeOperations eop=new EmployeeOperations();
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
		EmployeeOperations.empArray=new Employee[size];
		for(int i=0;i<=size-1;i++)
		{
			
			System.out.println("Enter "+(i+1)+" Employee Data");
			System.out.println("Enter Id");
			emp.setEmployeeId(sc.nextInt());
			System.out.println("Enter Name");
			emp.setEmployeeName(sc.next());
			System.out.println("Enter Package");
			emp.setEmployeePackage(sc.nextDouble());
			// SerializableEx.doSerialization();
			EmployeeOperations.insertData(emp);
			 
		}
		
		
	   
	
	    break;
	    
	case 2:
		
		eop.updateData();
		
		break;
	case 3:
		
		
		eop.deleteEmployee( );
		
		break;
		
	case 4:
		
		eop.searchEmployee( );
	
		break;
		
	case 5:
		
		
	eop.printAllEmployeeData();
		

		break;
		
	case 6:
		eop.loanElgibility();
		break;
	
	case 7:
		//public static void doSerialization() throws IOException{
		
			SerializableEx.doSerialization();
			
			
		System.out.println("Exit");
		break;
	
	}
	}
while(choice!=7);

	}}

package com.vtalent.sanjana;

import java.util.Scanner;

public class DBTest {

	public static void main(String[] args) {
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
			DBOperations.insertDataWithPstmt(emp);
			 
		}
		
		
	   
	
	    break;
	    
	/*case 2:
		
		eop.updateData();
		
		break;
	case 3:
		
		
		eop.deleteEmployee( );
		
		break;
		
	case 4:
		try {
		eop.searchEmployee( );
		}
		catch(Exception e) {
			
		}
		break;
		
	case 5:
		
		try {
	eop.printAllEmployeeData();
	//		eop.deSerialization();
		}
		catch(Exception e) {
			
		}

		break;
		
	case 6:
		eop.loanElgibility();
		break;
	
	case 7:
		EmployeeOperations eo=new EmployeeOperations();
		try {
			eo.serialization();
		}
		catch(Exception e) {
			
		}
			
		System.out.println("Exit");
		break;
	
	}
	}*/}}
while(choice!=7);

	

		}
	}



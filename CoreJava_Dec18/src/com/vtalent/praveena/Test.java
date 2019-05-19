package com.vtalent.praveena;


import java.util.Scanner;

public class Test {
	 static Scanner a=new Scanner(System.in);
	 public static void main(String[] args) {
		
	System.out.println("select your option");
	int choice  = a.nextInt();
	switch(choice)
	{
	case 1:
	System.out.println("enter number of employees to input");
	int size=a.nextInt();
	EmployeeOperations.empArray=new Employee[size];
	for(int i=0;i<=size-1;i++)
	{
		System.out.println("enter"+i+1+"employeeData");
		Employee emp=new Employee();
		System.out.println("enter ID");
				emp.setemployeeID(a.nextInt());
				System.out.println("enter salary");
				emp.setemployeeSalary(a.nextDouble());
				EmployeeOperations.insertData(emp);
	}
	break;
	case 2:
		System.out.println("enter number of employees to print");
		int size2=a.nextInt();
		EmployeeOperations.empArray=new Employee[size2];
		EmployeeOperations.printAllEmployeeData();
		break;
	case 3:
		System.out.println("Enter Employee details");
		Employee emp=new Employee();
		System.out.println("enter ID");
		emp.setemployeeID(a.nextInt());
		System.out.println("enter salary");
		emp.setemployeeSalary(a.nextDouble());
		EmployeeOperations.updateData(emp);
		break;
	case 4:
		System.out.println("Enter Employee ID");
		Employee emp1=new Employee();
		System.out.println("enter ID");
				emp1.setemployeeID(a.nextInt());
				System.out.println("enter salary");
		EmployeeOperations.deleteData(emp1);
		break;
	case 5:
		System.out.println("Enter Employee ID");
		Employee emp2=new Employee();
		System.out.println("enter ID");
				emp2.setemployeeID(a.nextInt());
				System.out.println("enter salary");
		EmployeeOperations.SearchEmployee(emp2);
		break;
	case 6:
		System.out.println("exited from home page");
		break;
	}
}
}
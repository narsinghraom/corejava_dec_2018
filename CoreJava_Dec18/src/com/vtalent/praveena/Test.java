package com.vtalent.praveena;


import java.util.Scanner;

public class Test {
	 static Scanner a=new Scanner(System.in);
	 public static void main(String[] args) {
		
	for(;;)
	 {
		
	System.out.println("select your options"+"\n"+"1.Insert"+"\n"+"2.Print"+"\n"+"3.Update"+"\n"+"4.Delete"+"\n"+"5.Search"+"\n"+"6.Exit");
	
	int choice  = a.nextInt();
	if(choice==6)
	{
		System.out.println("Exited from home page");
		break;
	}
	
	switch(choice)
	{
	case 1:
	System.out.println("Inserting data.....");
	int size;
	System.out.println("1.To add data into new database"+"\n"+"2.Add data into existing database");
	int n=a.nextInt();
	if(n==1)
	{
	System.out.println("enter number of employees to input");
	 size=a.nextInt();
	EmployeeOperations.empArray=new Employee[size];
	for(int i=0;i<=size-1;i++)
	{
		System.out.println("enter "+(i+1)+" employeeData");
		Employee emp=new Employee();
		System.out.println("enter ID");
				emp.setemployeeID(a.nextInt());
				System.out.println("enter salary");
				emp.setemployeeSalary(a.nextDouble());
				EmployeeOperations.insertData(emp);
	}
	}
	else if(n==2)
	{
		if(EmployeeOperations.empArray==null)
		{
			System.out.println("Database is empty, please enter details first");
		}
		else
		{
			System.out.println("Enter number of employees to be added");
			size=a.nextInt();
			for(int i=0;i<=size-1;i++)
			{
				System.out.println("enter "+(i+1)+" employeeData");
				Employee emp=new Employee();
				System.out.println("enter ID");
						emp.setemployeeID(a.nextInt());
						System.out.println("enter salary");
						emp.setemployeeSalary(a.nextDouble());
						EmployeeOperations.insertData(emp);
			}
			
		}
	}
	break;
	case 2:
		System.out.println("Printing all employees details");
		//System.out.println("Enter number of employees to print");
		//int size2=a.nextInt();
		//EmployeeOperations.printAllEmployeeData(size2);
		EmployeeOperations.printAllEmployeeData();
		break;
	case 3:
		//System.out.println("Enter Employee details");
		System.out.println("To update Employee details");
		Employee emp=new Employee();
		System.out.println("Please enter employee ID");
		emp.setemployeeID(a.nextInt());
		EmployeeOperations.updateData(emp.getemployeeID());
		break;
	case 4:
		System.out.println("To delete employee details");
		Employee emp1=new Employee();
		System.out.println("Please enter Employee ID");
		emp1.setemployeeID(a.nextInt());
		EmployeeOperations.deleteData(emp1.getemployeeID());
		break;
	case 5:
		System.out.println("To Search Employee details");
		System.out.println("Please enter Employee ID");
		Employee emp2=new Employee();
		emp2.setemployeeID(a.nextInt());
		EmployeeOperations.SearchEmployee(emp2.getemployeeID());
		break;
	
	}
}
}
}
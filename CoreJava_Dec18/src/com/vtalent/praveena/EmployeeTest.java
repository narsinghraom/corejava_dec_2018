package com.vtalent.praveena;

import java.util.Scanner;

public class EmployeeTest {

	static Scanner a=new Scanner(System.in);
	 public static void main(String[] args) {
	
	for(;;)
	 {
		
	System.out.println("select your options"+"\n"+"1.Insert"+"\n"+"2.Print"+"\n"+"3.Update"+"\n"+"4.Delete"+"\n"+"5.Search"+"\n"+"6.Get Loan"+"\n"+"7.Print previous data by using deserialization"+"\n"+"8.Exit");
	
	int choice  = a.nextInt();
	if(choice==8)
	{
		try
		{
		EmployeeTask.Serializable();
		}
		catch(Exception e)
		{
			
		}
		
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
	
	EmployeeTask.empArray=new EmployeeDetails[size];
	for(int i=0;i<=size-1;i++)
	{

		System.out.println("enter "+(i+1)+" employeeData");
		EmployeeDetails emp=new EmployeeDetails();
		System.out.println("Enter Employee Name");
		emp.setemployeeName(a.next());
		System.out.println("enter ID");
		emp.setemployeeID(a.nextInt());
		System.out.println("Enter Package");
		emp.setemployeePackage(a.nextDouble());
		//emp.setemployeePF(emp.getemployeePackage());
		//emp.setemployeeSalary(emp.getemployeePackage());
		
		/*double Salary=(emp.getemployeePackage())/12;
		double PF=Salary*0.02;
		emp.setemployeePF(PF);
		Salary=Salary-PF;
		emp.setemployeeSalary(Salary);*/
		
		EmployeeTask.insertData(emp);
	}
	}
	else if(n==2)
	{
		if(EmployeeTask.empArray==null)
		{
			System.out.println("Dayabase is empty please enter data first");
		}
		else
		{
				
			System.out.println("Enter number of employees to be added");
			size=a.nextInt();
			for(int i=0;i<=size-1;i++)
			{

				System.out.println("enter "+(i+1)+" employeeData");
				EmployeeDetails emp=new EmployeeDetails();
				System.out.println("Enter Employee Name");
				emp.setemployeeName(a.next());
				System.out.println("enter ID");
				emp.setemployeeID(a.nextInt());
				System.out.println("Enter Package");
				emp.setemployeePackage(a.nextDouble());
				EmployeeTask.insertData(emp);
			}
		}
	}
	break;
	case 2:
		System.out.println("Printing all employees details");
		//System.out.println("Enter number of employees to print");
		//int size2=a.nextInt();
		//EmployeeOperations.printAllEmployeeData(size2);
		EmployeeTask.printAllEmployeeData();
		break;
	case 3:
		//System.out.println("Enter Employee details");
		System.out.println("To update Employee details");
		EmployeeDetails emp=new EmployeeDetails();
		System.out.println("Please enter employee ID");
		emp.setemployeeID(a.nextInt());
		EmployeeTask.updateData(emp.getemployeeID());
		break;
	case 4:
		System.out.println("To delete employee details");
		EmployeeDetails emp1=new EmployeeDetails();
		System.out.println("Please enter Employee ID");
		emp1.setemployeeID(a.nextInt());
		EmployeeTask.deleteData(emp1.getemployeeID());
		break;
	case 5:
		System.out.println("To Search Employee details");
		System.out.println("Please enter Employee ID");
		EmployeeDetails emp2=new EmployeeDetails();
		emp2.setemployeeID(a.nextInt());
		EmployeeTask.SearchEmployee(emp2.getemployeeID());
		break;
	case 6:
		System.out.println("To get Loan");
		System.out.println("Please enter Employee ID");
		EmployeeDetails emp3=new EmployeeDetails();
		emp3.setemployeeID(a.nextInt());
		EmployeeTask.getLoan(emp3.getemployeeID());
		break;
	case 7:
		System.out.println("Printing employee details by using deserialization");
		//System.out.println("Search employee details by using deserialization");
		try
		{
			EmployeeTask.deserialization();
			
		}
		catch(Exception e)
		{
		}
	}
}
	 }
}

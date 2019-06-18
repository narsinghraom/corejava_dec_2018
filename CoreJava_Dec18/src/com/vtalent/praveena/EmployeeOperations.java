package com.vtalent.praveena;

import java.util.Scanner;

public class EmployeeOperations {
	static Employee[] empArray;
	 static Scanner a=new Scanner(System.in);
	public static void insertData(Employee emp)
	{
		if(empArray!=null)
		{
			for(int i=0;i<=empArray.length-1;i++)
			{
			if(empArray[i]==null)
			{
				empArray[i]=emp;
				break;
			}
			}
		}
	}
	public static void printAllEmployeeData()
	{
		if(empArray!=null)
		{
			for(int i=0;i<empArray.length;i++)
			{
			
				Employee emp=empArray[i];
				if(empArray[i]==null)
				{
					
				}
				else
				{
					System.out.println("employee ID: "+emp.getemployeeID()+"\n"+"employee salary:"+"\n"+emp.getemployeeSalary());
				}
				}
		}
			
	}
	public static void updateData(int empID)
	{
		if(empArray!=null)
		{
			for(int i=0;i<=empArray.length-1;i++)
			{
				if(empArray[i].getemployeeID()==empID)
				{
					System.out.println("Enter new employee details");
					System.out.println("enter salary");
					empArray[i].setemployeeSalary(a.nextDouble());		
					//Employee empUD=new Employee();empUD.setemployeeSalary(a.nextDouble());
							//empArray[i]=empUD;
					System.out.println("Data got updated and updated employee details are");
					System.out.println("Employee ID: "+empArray[i].getemployeeID()+"\n"+"Salary: "+empArray[i].getemployeeSalary());
					break;
				}
				
			}
			System.out.println("Enter valid employee ID");

		}
		else
		{
			System.out.println("No data available in database");
			
		}
	}
	public static void deleteData(int empID)
	{
		if(empArray!=null)
		{
			for(int i=0;i<=empArray.length-1;i++)
			{
				if(empArray[i].getemployeeID()==empID)
				{
				
				empArray[i]=null;
				System.out.println("Employee ID: "+empID+ " deleted");
				break;
			}
			}
			System.out.println("Enter valid Employee ID to delete");
		}
		else
		{
			System.out.println("No data available in database");
		}
	}
	public static void SearchEmployee(int empID)
	{
	if(empArray!=null)
	{
		for(int i=0;i<=empArray.length-1;i++)
		{
			if(empArray[i]==null)
			{
				
			}
			
			
			else if(empArray[i].getemployeeID()==empID)
			{
				System.out.println("Employee ID: "+empArray[i].getemployeeID()+"\n"+"Employee Salary: "+empArray[i].getemployeeSalary());
				break;
			}
			
		}
		System.out.println("please enter valid employee ID");
	}
	else
	{
		System.out.println("no data available in database");
	}
	}
}

		
		
			
	


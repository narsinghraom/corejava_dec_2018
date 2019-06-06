package com.vtalent.praveena;

import java.util.Scanner;

public class EmployeeOperations {
	static Employee[] empArray;
	 static Scanner a=new Scanner(System.in);
	public static void printAllEmployeeData()
	{
		if(empArray!=null)
		{
			for(int i=0;i<=empArray.length-1;i++)
			{
				Employee emp=empArray[i];
				if(empArray!=null)
				{
					System.out.println("employee ID"+emp.getemployeeID()+"employee salary"+emp.getemployeeSalary());
				}
				}
		}
			
	}
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
				else
				{
					System.out.println("Enter valid employee ID");
				}
			}

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
				break;
			}
		
			else
			{
					System.out.println("Enter valid employee ID");
	
			}
			}
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
			if(empArray[i].getemployeeID()==empID)
			{
				System.out.println("Employee ID: "+empArray[i].getemployeeID()+"\n"+"Employee Salary: "+empArray[i].getemployeeSalary());
				break;
			}
			else
			{
				System.out.println("Enter valid employee ID");
			}
		}
	}
	else
	{
		System.out.println("no data available in database");
	}
	}
}

		
		
			
	


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
	public static void updateData(Employee emp)
	{
		if(empArray!=null)
		{
			for(int i=0;i<=empArray.length-1;i++)
			{
				if(empArray[i]==emp)
				{
					System.out.println("Enter new employee details");
					Employee empUD=new Employee();
					System.out.println("enter ID");
							empUD.setemployeeID(a.nextInt());
							System.out.println("enter salary");
							empUD.setemployeeSalary(a.nextDouble());
							emp=empUD;
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
	public static void deleteData(Employee emp)
	{
		if(empArray!=null)
		{
			for(int i=0;i<=empArray.length-1;i++)
			{
				if(empArray[i]==emp)
				{
				
				empArray[i]=null;
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
	public static void SearchEmployee(Employee emp)
	{
	if(empArray!=null)
	{
		for(int i=0;i<=empArray.length-1;i++)
		{
			if(empArray[i]==emp)
			{
				System.out.println(emp);
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

		
		
			
	


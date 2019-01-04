package com.vtalent.chamu;

public class EmpArray 
{
	static Employee[]  empArray = new Employee[4];
	static Employee emp = null;
	
	//inserting static data into an array
	public static void insertData(Employee emp)
	{	
		//inserting dynamic data into an array
		if(empArray!=null && empArray.length>0)
		{
			for(int i=0;i<=3;i++)
			{
				if(empArray[i]==null)
				{
				empArray[i]=emp;
				break;
				}
			}
		}
	}
	
	// displaying inserted data from array
	public static void display()
	{
		if(empArray!=null && empArray.length>0)
		{
			for(Employee emp:empArray)
			{
				if(null!=emp)
				{
				System.out.println("id="+emp.getId()+" "+"mobileno="+emp.getMblno()+" "+"Salary="+emp.getSalary());
				}
			}
		}
	}
	
	//Updating data into an array by comparing with one empid and updating details of that id 
	public static void update(int id)
	{
		boolean flag=false;
		if(empArray!=null && empArray.length>0)
		{
			for(int i=0;i<=3;i++)
			{
				Employee emp = empArray[i];
				if(emp.getId()==id)
				{
					emp.setSalary(emp.getSalary()+5000);
					empArray[i]=emp;
					flag=true;
				}
			}
			if(!flag)
			{
				System.out.println("Invalid Id");
			}
		}
	}
	//Deleting data into an array by comparing with one empid and deleting details of that id 
	public static void delete(int id)
	{
		boolean flag=false;
		if(empArray!=null && empArray.length>0)
		{
			for(int i=0;i<=3;i++)
			{
				Employee emp = empArray[i];
				if(emp.getId()==id)
				{	
					emp.setMblno(9586425852l);
					emp.setSalary(20000);
					empArray[i]=emp;
					System.out.println("Update Emp Date");
					/*emp = null;
					
					empArray[i]=emp;
					flag=true;
					*/
				}
			}
			if(!flag)
			{
				System.out.println("Invalid Id");
			}
		}
		 
	}
	//Displaying only one employee details
	public static void displayOneEmpDetails(int id)
	{		
		boolean flag=false;
		if(empArray!=null && empArray.length>0)
		{
			for(int i=0;i<=3;i++)
			{
				Employee emp = empArray[i];
				
				if(emp.getId()==id)
				{				
					emp.getMblno();
					emp.getSalary();
					if(empArray[i]==null)
					{
					empArray[i]=emp;
					}
					
				flag=true;
				}
			}
			if(!flag)
			{
			System.out.println("Invalid Id");
			}
		}	
	}
}
	


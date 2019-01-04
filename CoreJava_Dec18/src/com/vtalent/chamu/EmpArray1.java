package com.vtalent.chamu;

public class EmpArray1 
{
	static Employee[]  empArray1 = new Employee[4];//creating an array to employee class
	static Employee emp = null;// intializing employee-class object to null
	
	//inserting static data into an array
	public static void insertData()
	{	
		for(int i=0;i<=3;i++)
		{
			emp = new Employee();	
			emp.setId(i+100);
			emp.setSalary(25000.00*(i+1));
			emp.setMblno(9458712560l+i);
			empArray1[i]= emp;
		}
	}
	// displaying inserted data from array
	public static void display()
	{
		if(empArray1!=null && empArray1.length>0)
		{
			for(Employee emp:empArray1)
			{
			System.out.println("id="+emp.getId()+" "+"mobileno="+emp.getMblno()+" "+"Salary="+emp.getSalary());
			}
		}
	}
	//Updating data into an array 
	public static void update()
	{	
		for(int i=0;i<=3;i++)
		{
			emp = new Employee();
			emp.setId(i+200);
			emp.setSalary(25000.00*(i+1));
			emp.setMblno(9458712560l+i);
			empArray1[i]= emp;
		}
	
		/*if(empArray!=null && empArray.length>0)
		{
			for(Employee emp:empArray)
			{
				System.out.println("id="+emp.getId()+" "+"mobileno="+emp.getMblno()+" "+"Salary="+emp.getSalary());
			}
		}*/
		
	}
	// deleting data from an array	
	public static void delete()
	{
		for(int i=0;i<=3;i++)
		{
			//emp = new Employee();	
			emp.setId(0);
			emp.setSalary(0.0);
			emp.setMblno(0);
			empArray1[i] = emp;
		}
			/*for(Employee emp:empArray)
			{
				System.out.println("id="+emp.getId()+" "+"mobileno="+emp.getMblno()+" "+"Salary="+emp.getSalary());
			}*/
		
		}
	// displaying single emp details
	public static void displayOneEmpDetails()
	{		
			for(int i=0;i==0;i++)
			{
			emp = new Employee();
			emp.setId(i+100);
			emp.setSalary(25000.00*(i+1));
			emp.setMblno(9458712560l+i);
			empArray1[i]=emp;
			}
			if(empArray1!=null && empArray1.length>0)
			{
			
			for(Employee emp:empArray1)
			{
				System.out.println("id="+emp.getId()+" "+"mobileno="+emp.getMblno()+" "+"Salary="+emp.getSalary());
			}
		}
	}
}
	


package com.vtalent.praveena;

import java.util.Calendar;
import java.util.Scanner;
import java.io.*;

public class EmployeeTask {
	static EmployeeDetails[] empArray;
	 static Scanner a=new Scanner(System.in);
	public static void insertData(EmployeeDetails emp)
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
	public static void printAllEmployeeData() throws IOException, ClassNotFoundException
	{
		if(empArray!=null)
		{
			for(int i=0;i<empArray.length;i++)
			{
			
				EmployeeDetails emp=empArray[i];
				if(empArray[i]==null)
				{
					
				}
				else
				{
					System.out.println("Employee ID: "+empArray[i].getemployeeID()+"\n"+"Employee Name: "+empArray[i].getemployeeName()+"\n"+"Employee Package"+empArray[i].getemployeePackage()+"\n"+"Employee Salary: "+empArray[i].getemployeeSalary()+"\n"+"Employee PF: "+empArray[i].getemployeePF()+"\n"+"Employee Loan: "+empArray[i].getLoanAmount()+"\n"+"Employee Tenure"+empArray[i].getTenure()+"\n"+"Employee Emi: "+empArray[i].getEMI()+"\n"+"Employee Take Home salary: "+empArray[i].getTakeHome()+"\n"+"Employee Loan taken Date: "+empArray[i].getStartTime()+"\n"+"Employee Loan End Date: "+empArray[i].getEndTime());
					
				}
				}
		}
		else
		{
			System.out.println("Printing existing data");
			FileInputStream fis=new FileInputStream("D:/gunny.txt");
			ObjectInputStream ois=new ObjectInputStream(fis);
			Object obj=ois.readObject();
			EmployeeDetails[] emparray1=(EmployeeDetails[])obj;
			if(emparray1!=null)
			{
			for(int i=0;i<emparray1.length;i++)
			{
				EmployeeDetails emp=emparray1[i];
				if(emparray1[i]==null)
				{
					
				}
				else
				{
					System.out.println("Employee ID: "+emparray1[i].getemployeeID()+"\n"+"Employee Name: "+emparray1[i].getemployeeName()+"\n"+"Employee Package"+emparray1[i].getemployeePackage()+"\n"+"Employee Salary: "+emparray1[i].getemployeeSalary()+"\n"+"Employee PF: "+emparray1[i].getemployeePF()+"\n"+"Employee Loan: "+emparray1[i].getLoanAmount()+"\n"+"Employee Tenure"+empArray[i].getTenure()+"\n"+"Employee Emi: "+emparray1[i].getEMI()+"\n"+"Employee Take Home salary: "+emparray1[i].getTakeHome()+"\n"+"Employee Loan taken Date: "+emparray1[i].getStartTime()+"\n"+"Employee Loan End Time: "+emparray1[i].getEndTime());

				}
				}
			
			}
			else
			{
				System.out.println("No data available in database");
			
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
					System.out.println("enter Package");
					empArray[i].setemployeePackage(a.nextDouble());		
					//Employee empUD=new Employee();empUD.setemployeeSalary(a.nextDouble());
							//empArray[i]=empUD;
					System.out.println("Data got updated and updated employee details are");
					System.out.println("Employee ID: "+empArray[i].getemployeeID()+"\n"+"Employee Name: "+empArray[i].getemployeeName()+"\n"+"Employee Package"+empArray[i].getemployeePackage()+"\n"+"Employee Salary: "+empArray[i].getemployeeSalary()+"\n"+"Employee PF: "+empArray[i].getemployeePF()+"\n"+"Employee Loan: "+empArray[i].getLoanAmount()+"\n"+"Employee Tenure"+empArray[i].getTenure()+"\n"+"Employee Emi: "+empArray[i].getEMI()+"\n"+"Employee Take Home salary: "+empArray[i].getTakeHome()+"\n"+"Employee Loan taken Date: "+empArray[i].getStartTime()+"\n"+"Employee Loan End Date: "+empArray[i].getEndTime());
					//LoanDuration(empArray[i]);
					break;
				}
			
				System.out.println("Enter valid employee ID");
	
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
				System.out.println("Employee ID: "+empID+ " deleted");
				break;
				
			}
			
			
			System.out.println("Enter valid Employee ID to delete");
		}
		}
		
		else
		{
			System.out.println("No data available in database");
		}
	}
	public static int Nullsearch()
	{
		int count=0;
		for(int i=0;i<=empArray.length-1;i++)
		{
			if(empArray[i]==null)
			{
				count++;
			}
		}
		return count;
		}

		
	
	public static void SearchEmployee(int empID) throws IOException, ClassNotFoundException
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
				System.out.println("Employee ID: "+empArray[i].getemployeeID()+"\n"+"Employee Name: "+empArray[i].getemployeeName()+"\n"+"Employee Package"+empArray[i].getemployeePackage()+"\n"+"Employee Salary: "+empArray[i].getemployeeSalary()+"\n"+"Employee PF: "+empArray[i].getemployeePF()+"\n"+"Employee Loan: "+empArray[i].getLoanAmount()+"\n"+"Employee Tenure"+empArray[i].getTenure()+"\n"+"Employee Emi: "+empArray[i].getEMI()+"\n"+"Employee Take Home salary: "+empArray[i].getTakeHome()+"\n"+"Employee Loan taken Date: "+empArray[i].getStartTime()+"\n"+"Employee Loan End Date: "+empArray[i].getEndTime());

				break;
			}
		
			System.out.println("enter valid employee ID");
		}	
		
	
	}
	else
	{
		System.out.println("Searching from existing data");
		FileInputStream fis=new FileInputStream("D:/gunny.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Object obj=ois.readObject();
		EmployeeDetails[] emparray1=(EmployeeDetails[])obj;
		if(emparray1!=null)
		{
		for(int i=0;i<emparray1.length;i++)
		{
			if(emparray1[i].getemployeeID()==empID)
			{
				System.out.println("Employee ID: "+emparray1[i].getemployeeID()+"\n"+"Employee Name: "+emparray1[i].getemployeeName()+"\n"+"Employee Package"+emparray1[i].getemployeePackage()+"\n"+"Employee Salary: "+emparray1[i].getemployeeSalary()+"\n"+"Employee PF: "+emparray1[i].getemployeePF()+"\n"+"Employee Loan: "+emparray1[i].getLoanAmount()+"\n"+"Employee Tenure"+empArray[i].getTenure()+"\n"+"Employee Emi: "+emparray1[i].getEMI()+"\n"+"Employee Take Home salary: "+emparray1[i].getTakeHome()+"\n"+"Employee Loan taken Date: "+emparray1[i].getStartTime()+"\n"+"Employee Loan End Time: "+emparray1[i].getEndTime());
				break;
			}
			
		}

		
		}
		else
		{
			System.out.println("No data available in database");
		
		}
		
		
		
	}
	}
	public static void getLoan(int empID)
	{
		if(empArray!=null)
		{
			for(int i=0;i<=empArray.length-1;i++)
			{
				if(empArray[i].getemployeeID()==empID)
				{
					Loan ln=new Loan();
					ln.LoanApproval(empArray[i],empArray[i].getemployeeSalary());
			
			}
			

			}
		}
		else
		{
			System.out.println("No data available in database");
			
		}
	}
	
	public static void Serializable() throws IOException
	{
		File file=new File("D:/gunny.txt");
		FileOutputStream fos=new FileOutputStream(file);
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(empArray);
	}
	public static void deserialization() throws IOException, ClassNotFoundException
	{
		FileInputStream fis=new FileInputStream("D:/gunny.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Object obj=ois.readObject();
		EmployeeDetails[] emparray1=(EmployeeDetails[])obj;
		if(emparray1!=null)
		{
		for(int i=0;i<emparray1.length;i++)
		{
			
			EmployeeDetails emp=emparray1[i];
			if(emparray1[i]==null)
			{
				
			}
			else
			{
				System.out.println("Employee ID: "+emparray1[i].getemployeeID()+"\n"+"Employee Name: "+emparray1[i].getemployeeName()+"\n"+"Employee Package"+emparray1[i].getemployeePackage()+"\n"+"Employee Salary: "+emparray1[i].getemployeeSalary()+"\n"+"Employee PF: "+emparray1[i].getemployeePF()+"\n"+"Employee Loan: "+emparray1[i].getLoanAmount()+"\n"+"Employee Tenure"+empArray[i].getTenure()+"\n"+"Employee Emi: "+emparray1[i].getEMI()+"\n"+"Employee Take Home salary: "+emparray1[i].getTakeHome()+"\n"+"Employee Loan taken Date: "+emparray1[i].getStartTime()+"\n"+"Employee Loan End Time: "+emparray1[i].getEndTime());

			}
			}
		
		}
		else
		{
			System.out.println("No data available in database");
		}
		
	}
}
		
	


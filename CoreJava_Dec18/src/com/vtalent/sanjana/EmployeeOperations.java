package com.vtalent.sanjana;


import java.io.*;
import java.util.Scanner;

public class EmployeeOperations 
	{
		 static Employee[] empArray;
		static int size;
	static	Employee emp1;
	Scanner sc=new Scanner(System.in);		
		  public static void insertData(Employee emp1)  
		{
			  if (empArray != null) {
					for (int i = 0; i <= empArray.length - 1; i++) {
						if (empArray[i] == null) {
							empArray[i] = emp1;
							// System.out.println("here");
							break;
						}
					}
					System.out.println("Successfully Inserted." + '\n');
				}	}
	   public void updateData()
	    {
		   System.out.println("Enter Employee Id to be updated");
			double empid1=sc.nextInt();
	    	if(empArray!=null)
			{
				for(int i=0;i<=empArray.length-1;i++)
				{
					emp1=empArray[i];
					 if(empid1==emp1.getEmployeeId()) {
						 System.out.println("Enter Package to be updated");
							double d1=sc.nextDouble(); 
							emp1.setEmployeePackage(d1);
							break;
					 }
					
					}
				}
			}
		
		public   void deleteEmployee(  )
		{
			System.out.println("Enter Employee Id to Delete");
			double empid2=sc.nextInt();

			if(empArray!=null)
			{
				for(int i=0;i<=empArray.length-1;i++)
				{
					emp1=empArray[i];
					if(empid2==emp1.getEmployeeId()) {
					
					{
						empArray[i]=null;
						System.out.println("Employee Removed");
					}
					}}}	
				
		    
			
			
		}
		public   void searchEmployee(  ) throws Exception
		{
			
			if(empArray!=null)
			{
				System.out.println("Enter Employee Id  to be searched");
				double empid3=sc.nextInt();
				for(int i=0;i<=empArray.length-1;i++)
				{
					emp1=empArray[i];
					
					if(empArray[i]==null) {
						
					}
					else {
					if(empid3==empArray[i].getEmployeeId())
					{
						
					//	System.out.println(emp.getEmployeeId()+" "+emp.getEmployeeName()+" "+emp.getEmployeePackage());
					
						System.out.println("EmployeeId:---"
								+ empArray[i].getEmployeeId() + " Name:----"+empArray[i].getEmployeeName() +"  Package:---"
								+ empArray[i].getEmployeePackage()+ " Salary:---"+empArray[i].getEmployeeSalary()+" pf:----"+empArray[i].getEmployeepf());
						break;
					}
					else {
						System.out.println("Enter Valid Id");
					}
					}
					
						}
				}
			else {
				System.out.println("Enter Id to Look up in file");
				int x=sc.nextInt();
				FileInputStream fis=new FileInputStream("E:/sanju1.txt");
				ObjectInputStream ois=new ObjectInputStream(fis);
					Object obj=ois.readObject();
					Employee[] emparray1=(Employee[])obj;
					for(int i=0;i<=emparray1.length-1;i++) {
						if(x==emparray1[i].getEmployeeId()) {
						System.out.println(emparray1[i].getEmployeeId() + " "
								+emparray1[i].getEmployeeName()+" "+emparray1[i].getEmployeePackage()+" "+emparray1[i].getEmployeeSalary()+" "+emparray1[i].getEmployeepf());
						}
						
						}
					}
	
			}
			
		
		public void printAllEmployeeData()throws Exception 
		{
			if(empArray!=null)
			{
				for(int i=0;i<=empArray.length-1;i++)
				{ 
					emp1=empArray[i];
					if(empArray[i]==null) {
						
					}
					else {
					
						System.out.println(empArray[i].getEmployeeId() + " "
								+empArray[i].getEmployeeName()+" "+empArray[i].getEmployeePackage()+" "+empArray[i].getEmployeeSalary()+" "+empArray[i].getEmployeepf());
					
				}
					}
			}
			
			else {
				FileInputStream fis=new FileInputStream("E:/sanju1.txt");
				ObjectInputStream ois=new ObjectInputStream(fis);
					Object obj=ois.readObject();
					Employee[] emparray1=(Employee[])obj;
					for(int i=0;i<=emparray1.length-1;i++) {
						System.out.println(emparray1[i].getEmployeeId() + " "
								+emparray1[i].getEmployeeName()+" "+emparray1[i].getEmployeePackage()+" "+emparray1[i].getEmployeeSalary()+" "+emparray1[i].getEmployeepf());
						}}
		}
	public void loanElgibility()
	{
				
			if(empArray!=null)
			{
				System.out.println("Enter Employee Id  to check Loan Availability");
				double empid3=sc.nextInt();

				for(int i=0;i<=empArray.length-1;i++)
				{
					emp1=empArray[i];
					if(empArray[i]==null) {
						System.out.println("Insert Employee Data First");
					}
					else {
					if(empid3==emp1.getEmployeeId())
					{
						Loan l=new Loan();
						l.loanApproval(emp1.salary);
							break;
					}
					
					}
					
						}
				}
			else {
				System.out.println("Insert Employee Data First");
			}
		
	}
	
	public void deSerialization()throws Exception {
		FileInputStream fis=new FileInputStream("E:/sanju1.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
			Object obj=ois.readObject();
			Employee[] emparray1=(Employee[])obj;
			System.out.println(emparray1[1].getEmployeeId());
	}
	public void serialization()throws Exception {
		File file=new File("E:/sanju1.txt");
		FileOutputStream fos=new FileOutputStream(file);
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(empArray);

	}

}

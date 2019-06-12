package com.vtalent.sanjana;


import java.io.*;
import java.util.Scanner;

public class EmployeeOperations 
	{
		 static Employee[] empArray;
		static int size;
	static	Employee emp1;
	Scanner sc=new Scanner(System.in);		
		static public void insertData(Employee emp) throws Exception
		{
			if(empArray!=null) {
				for(int i=0;i<=empArray.length-1;i++) {
					
					if(empArray[i]==null) {
						
				empArray[i]=emp;
				File file=new File("F:/sanju.txt");
				FileOutputStream fos=new FileOutputStream(file);
				ObjectOutputStream oos=new ObjectOutputStream(fos);
				oos.writeObject(EmployeeOperations.empArray[i]);
							
 				break;
					}
				}
				System.out.println("Successfully Inserted."+'\n');
				}
		}
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
			System.out.println("Enter Employee Id  to be searched");
		double empid3=sc.nextInt();
		FileInputStream fis=new FileInputStream("F:/sanju.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Object obj=ois.readObject();
		Employee[] empArray=(Employee[])obj;
			if(empArray!=null)
			{
				for(int i=0;i<=empArray.length-1;i++)
				{
					//emp1=empArray[i];
					
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
			}
		
		public void printAllEmployeeData() throws Exception
		{
			FileInputStream fis=new FileInputStream("F:/sanju.txt");
			ObjectInputStream ois=new ObjectInputStream(fis);
			Object obj=ois.readObject();
			Employee[] empArray=(Employee[])obj;
			if(empArray!=null)
			{
				//for(int i=0;i<=empArray.length-1;i++)
			//	{ 
					//emp1=empArray[i];
			//		if(empArray[i]==null) {
						
			//		}
				//	else {
						SerializableEx.deSerialization();
					
						//System.out.println(empArray[i].getEmployeeId() + " "
						//		+empArray[i].getEmployeeName()+" "+empArray[i].getEmployeePackage()+" "+empArray[i].getEmployeeSalary()+" "+empArray[i].getEmployeepf());
					
				//}
					//}
			}
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

}

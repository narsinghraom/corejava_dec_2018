package com.vtalent.sanjana;
import java.util.Scanner;

public class EmployeeOperations 
	{
		 static Employee[] empArray;
		static int size;
	static	Employee emp1;
	Scanner sc=new Scanner(System.in);		
		static public void insertData(Employee emp)
		{
			if(empArray!=null) {
				for(int i=0;i<=empArray.length-1;i++) {
					if(empArray[i]==null) {
				empArray[i]=emp;
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
		public   void searchEmployee(  )
		{
			System.out.println("Enter Employee Id  to be searched");
		double empid3=sc.nextInt();
		
			if(empArray!=null)
			{
				for(int i=0;i<=empArray.length-1;i++)
				{
					emp1=empArray[i];
					if(empArray[i]==null) {
						
					}
					else {
					if(empid3==emp1.getEmployeeId())
					{
						
					
						System.out.println("EmployeeId:---"
								+ emp1.getEmployeeId() + " Name:----"+emp1.getEmployeeName() +"  Package:---"
								+ emp1.getEmployeePackage()+ " Salary:---"+emp1.getEmployeeSalary()+" pf:----"+emp1.getEmployeepf());
						break;
					}
					else {
						System.out.println("Enter Valid Id");
					}
					}
					
						}
				}
			}
		
		public void printAllEmployeeData()
		{
			if(empArray!=null)
			{
				for(int i=0;i<=empArray.length-1;i++)
				{ 
					emp1=empArray[i];
					if(empArray[i]==null) {
						
					}
					else {
						
					
						System.out.println(emp1.getEmployeeId() + " "
								+ emp1.getEmployeeName()+" "+emp1.getEmployeePackage()+" "+emp1.getEmployeeSalary()+" "+emp1.getEmployeepf());
					
				}
					}
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

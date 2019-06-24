package com.vtalent.sanjana;

import java.util.*;


public class Loan extends Exception{
Scanner sc=new Scanner(System.in);
Employee emp=new Employee();
	public String toString()
	{
		return "Loan Declined";
	}
	public void loanApproval(double salary,Employee emp)
	{
		try
		{
			if(salary<20000)
			{
				throw new Loan();
			}
			else
			{
				System.out.println("Loan Approved");
				double loanAmount=5*salary;
				emp.setLoanAmount(loanAmount);
				System.out.println("You are eligible for loan of "+emp.getLoanAmount1()+" with 14% of interest for 12 months");
				System.out.println("Enter yes to continue with the loan procedure");
				String opt=sc.next();
					if(opt.equalsIgnoreCase("yes"))
					{
					System.out.println("Please enter Tenure months");
					int tenure=sc.nextInt();
					emp.setEmployeeTenure(tenure);
				double emi= ((loanAmount)+(loanAmount*((0.14*tenure)/12)))/(tenure);
				emp.setEMI(emi);
					System.out.println("EMI will be: "+emp.getEMI1());
					/*double sth=salary-emi;
					emp.setTakeHome(sth);
					System.out.println("Take Home Salary: "+emp.getTakeHome1());*/
					Calendar startdate=Calendar.getInstance();
					emp.setStartTime(startdate.getTime());
					startdate.add(Calendar.MONTH,tenure);
					emp.setEndTime(startdate.getTime());


					System.out.println("your application has been under processing");
					
					}
					
			}
		}
		catch(Loan l)
		{
			System.out.println("loan has declined");
		}
	}
}

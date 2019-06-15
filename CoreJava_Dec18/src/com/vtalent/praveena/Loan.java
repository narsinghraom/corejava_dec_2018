package com.vtalent.praveena;

import java.util.Calendar;
import java.util.Scanner;

	 public class Loan extends Exception{
		 public static Scanner a=new Scanner(System.in);
			public String toString()
			{
				return "Loan has declined"; 
			}
			
			public  void LoanApproval(EmployeeDetails emp,double empSal)
			{
				try
				{
				if(empSal<20000)
				{
				throw new Loan();	
				}
				else
				{
				System.out.println("Eligible for loan");
				double LoanAmount=5*empSal;
				emp.setLoanAmount(LoanAmount);
				System.out.println("You are eligible for loan of "+LoanAmount+" with 14% of interest per Anum");
				System.out.println("Do you want continue with the loan procedure"+"\n"+"1.Yes"+"\n"+"2.No");
				int opt=a.nextInt();
					if(opt==1)
					{
					System.out.println("Please enter Tenure months");
					int Tenure=a.nextInt();
					emp.setemployeeTenure(Tenure);
					double EMI= ((LoanAmount)+(LoanAmount*((0.14*Tenure)/12)))/(Tenure);
					emp.setEMI(EMI);
					Calendar startdate=Calendar.getInstance();
					emp.setStartTime(startdate.getTime());
					startdate.add(Calendar.MONTH,Tenure);
					emp.setEndTime(startdate.getTime());


					System.out.println("your application has been under processing");
					
					}
					else 
					{
						System.out.println("Thank you");
					}
				
				}
				}
				catch(Loan ex)
				{
					System.out.println("loan has declined");
				}
			}
				
		}
	 




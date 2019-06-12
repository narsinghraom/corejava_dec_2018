package com.vtalent.praveena;

	 public class Loan extends Exception{
			public String toString()
			{
				return "Loan has declined"; 
			}
			
			public  void LoanApproval(double empSal)
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
				}
				}
				catch(Loan ex)
				{
					//System.out.println(ex);
				}
			}
				
		}
	 




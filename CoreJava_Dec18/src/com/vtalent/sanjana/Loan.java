package com.vtalent.sanjana;

public class Loan extends Exception{

	public String toString()
	{
		return "Loan Declined";
	}
	public void loanApproval(double salary)
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
			}
		}
		catch(Loan l)
		{
			
		}
	}
}

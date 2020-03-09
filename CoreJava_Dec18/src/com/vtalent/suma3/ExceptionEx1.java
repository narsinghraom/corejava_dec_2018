package com.vtalent.suma3;

public class ExceptionEx1 
{
	int i;
	String str;
	int[] arr=new int[2];
	public void function()
	{
		try
		{
			i=1/arr[0]; // Arithematic Exception
			char ch=str.charAt(0);
			arr[2]=5;
		}
		catch (NullPointerException np)
		{
			System.out.println("Please provide str value");
		}
		catch ( ArithmeticException ae)
		{
			System.out.println("Please provide array values");
		}
		
		catch( Exception e)
		{
			System.out.println("e");
		}
	}
	
	

}

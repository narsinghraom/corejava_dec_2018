package com.vtalent.suma3;

public class ExceptionEx {
	int i;
	String str;
	int[] arr= new int[2];
	public void function()
	{
		i=1/arr[0];
		char ch=str.charAt(0);
		arr[2]=5;
	}
	public static void main() 
	{
		ExceptionEx ee=new ExceptionEx();
		ee.function();
		System.out.println(ee.i);
		
	}
		
	}
	



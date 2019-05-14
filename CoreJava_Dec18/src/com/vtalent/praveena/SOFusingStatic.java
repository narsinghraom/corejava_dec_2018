package com.vtalent.praveena;

public class SOFusingStatic 
	{
		static SOFusingStatic abc=new SOFusingStatic();
		int i;
	
	public static void main(String[]args)
	{
		SOFusingStatic abc1=new SOFusingStatic();
		abc1.i=10;
		System.out.println(abc1.i);
	}

	}


	

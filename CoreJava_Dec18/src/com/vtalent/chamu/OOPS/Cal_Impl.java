package com.vtalent.chamu.OOPS;

public class Cal_Impl extends Calculator
{
	public int mul(int a,int b)
	{
		return a*b;
	}
	public int div(int a,int b)
	{
		return a/b;
	}
	// preference is given to most overriding method
	public int add(int a,int b)
	{
		return a+b+10;
	}
}

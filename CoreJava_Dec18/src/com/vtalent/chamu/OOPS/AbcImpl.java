package com.vtalent.chamu.OOPS;

public class AbcImpl implements Abc
{
	public int function(int i)
	{
		return i*i;
	}
	public int function(int i,int j)
	{
		return i*j;
	}
	public void display()
	{
		System.out.println("display");
	}
}

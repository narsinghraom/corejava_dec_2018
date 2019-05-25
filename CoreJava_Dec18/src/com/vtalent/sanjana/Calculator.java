package com.vtalent.sanjana;

abstract class Sanjana {

	
public int add(int x,int y)
{
	return x+y;
}
public int sub(int x,int y)
{
	return x-y;
} 
public abstract int mul(int x,int y);
public abstract int div(int x,int y);
	}

class Calculator2 extends Sanjana
{
	public int mul(int x,int y)
	{
		return x*y;
	}
	public int div(int x,int y)
	{
		return x/y;
	}
}
class Calculator
{
	public static void main(String[] args)
	{
		Calculator2 cal=new Calculator2();
		System.out.println(cal.add(2,3));
		System.out.println(cal.sub(5,2));
		System.out.println(cal.mul(3,4));
		System.out.println(cal.div(10,5));
	}
}

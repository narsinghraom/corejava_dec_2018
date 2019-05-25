package com.vtalent.sanjana;

public class Overriding {
public static void main(String[] args)
{
	
	Sanju2.fun(5);
	Sanju2.fun(5,5);
	System.out.println(Sanju2.x);
	System.out.println(Sanju2.y);
	

	Sanju1.fun(5);
	Sanju1.fun(5,5);
	System.out.println(Sanju1.x);
	System.out.println(Sanju1.y);
}
}
class Sanju1
{
static	int x,y;
static	public void fun(int x)
	{
		x=Sanju1.x+x;
		y=x+y;
	}
static	public void fun(int x,int y)
	{
		Sanju1.x=x+x;
		Sanju1.y=Sanju1.y+y;
	}
}
class Sanju2 extends Sanju1
{
static	int x;
static	public void fun(int x)
	{
		Sanju2.x=Sanju2.x+x;
	}
}
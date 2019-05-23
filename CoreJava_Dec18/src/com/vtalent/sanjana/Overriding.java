package com.vtalent.sanjana;

public class Overriding {
public static void main(String[] args)
{
	Sanju2 sanju2=new Sanju2();
	sanju2.fun(5);
	sanju2.fun(5,5);
	System.out.println(sanju2.x);
	System.out.println(sanju2.y);
	
	Sanju2 sanju1=new Sanju2();
	sanju1.fun(5);
	sanju1.fun(5,5);
	System.out.println(sanju1.x);
	System.out.println(sanju1.y);
}
}
class Sanju1
{
	int x,y;
	public void fun(int x)
	{
		this.x=x+this.x;
		y=x+y;
	}
	public void fun(int x,int y)
	{
		this.x=this.x+x;
		this.y=this.y+y;
	}
}
class Sanju2 extends Sanju1
{
	int x;
	public void fun(int x)
	{
		this.x=this.x+x;
	}
}
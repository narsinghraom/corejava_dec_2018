package com.vtalent.saritha;

public class Overriding {
	public static void main(String[] args)
	{
		
		S2.fun(5);
		S2.fun(5,5);
		System.out.println(S2.x);
		System.out.println(S2.y);
		

		S1.fun(5);
		S1.fun(5,5);
		System.out.println(S1.x);
		System.out.println(S1.y);
	}
	}
	class S1
	{
	static	int x,y;
	static	public void fun(int x)
		{
			x=S1.x+x;
			y=x+y;
		}
	static	public void fun(int x,int y)
		{
			S1.x=x+x;
			S1.y=S1.y+y;
		}
	}
	class S2 extends S1
	{
	static	int x;
	static	public void fun(int x)
		{
			S2.x=S2.x+x;
		}
	}



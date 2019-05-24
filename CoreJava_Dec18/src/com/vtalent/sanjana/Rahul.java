package com.vtalent.sanjana;

public class Rahul {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Span abc=new San();
abc.fun(5);
AbcImp abc1=new San();
abc1.fun(5,4);
San s=new San();
s.fun();
	}}
	interface Span
	{
		int i=0;
		public static final float pi=3.14f;
		public abstract void fun(int x);
		public void fun(int x,int y);
	}
	abstract class AbcImp implements Span
	{
		
	}
class San extends AbcImp
{
	public void fun(int x)
	{
		System.out.println(x);
	}
	public void fun(int x,int y)
	{
		System.out.println(x+y);
	}
	public void fun()
	{
		System.out.println("*");
	}
}


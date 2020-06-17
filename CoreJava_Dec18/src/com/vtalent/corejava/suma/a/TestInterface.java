package com.vtalent.corejava.suma.a;


interface Abc
{
	public abstract int function(int i);
	public abstract int function(int i, int j);
	public static final float pi=3.14f;
}
class AbcImpl implements Abc
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

public class TestInterface {
	public static void main(String args[]) {
		AbcImpl a=new AbcImpl();
		System.out.println(a.function(3));
		System.out.println(a.function(4,5));
		System.out.println(a.function(5,6));
		a.display();
		
		Abc abc1=new AbcImpl();
		System.out.println(a.function(3,1));
		System.out.println(a.function(4));
		
	}

}

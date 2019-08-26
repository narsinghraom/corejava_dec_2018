package com.vtalent.java.mahesh;

public class ObjectEx 
{
	int i;
	static ObjectEx oe=new ObjectEx();
	public void function(int i)
	{
	oe.i=i+this.i;
	}
	public static void main(String args[])
	{
	ObjectEx oe1=new ObjectEx();
	oe1.function(5);
	System.out.println(oe1.i);
	}
}

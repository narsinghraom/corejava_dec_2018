package com.vtalent.corejava.siva;

class One
{
	int a,b;
	public void method(int a)
	{
		this.a=a+this.a+b;
		b=a+b;
	}
	public int method(int a,int b)
	{
		System.out.println("super class of a and b");
		return b;
	}
}
class Two extends One
{
	int a,b;
	public void method1(int a)
	{
		this.a=this.a+b;
	}
	public void method1(int a,int b)
	{
		System.out.println("subclass of a and b");
		
	}
}

public class PolyTest {
	public static void main(String[] args) {
		One obj=new Two();
		obj.method(5);
		obj.method(5,4);
		
	}

}

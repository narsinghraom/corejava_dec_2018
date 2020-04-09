package com.vtalent.corejava.siva;

abstract class Abs
{
	int abc(int a)
	{
		System.out.println("non return type");
		return 1;
	}
	abstract void cde();
	abstract void fgh();
}
class Oef extends Abs
{
	void cde()
	{
		System.out.println("abstract method calling from super class");
	}
	void fgh()
	{
		System.out.println("abstract method call from super class");
	}
}
public class OneAbstract {
public static void main(String[] args) {
	Oef ob=new Oef();
	ob.abc(5);
	ob.cde();
	ob.fgh();
	
}
}

package com.vtalent.corejava.siva;

class B {
	B()
	{
		System.out.println("hello john");
	}
	B(int x)
	{
		this();
		System.out.println("welcome to india");
	}
}


public class ABCTest1 {
	public static void main(String[] args) {
		B obj=new B(12);
		
	}
}

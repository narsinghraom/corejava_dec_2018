package com.vtalent.suma3;

public class B {
	B b; int i;
	B() {
		b= new B();
		b.i=10;
	}
	public static void main(String args [])
	{
		B b = new B();
		System.out.println(b.i);
	}
	
}

	

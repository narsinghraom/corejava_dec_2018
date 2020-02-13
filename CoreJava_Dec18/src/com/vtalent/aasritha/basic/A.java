package com.vtalent.aasritha.basic;

public class A {
	int i;
	A a=new A();
	public static void main(String[] args) {
		A a=new A();
		a.i=5;
		System.out.println(a.a.i);
	}

}

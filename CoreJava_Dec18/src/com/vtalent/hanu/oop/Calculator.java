package com.vtalent.hanu.oop;

abstract class Calculator {

	public int add(int a,int b) {
		return a+b;
	}
	
	public int sub(int a,int b) {
		return a-b;
	}
	
	public abstract int mul(int a,int b);

	public abstract int div(int a,int b);
}


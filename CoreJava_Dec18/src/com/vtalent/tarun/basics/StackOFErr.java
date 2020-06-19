package com.vtalent.tarun.basics;

public class StackOFErr {
	/*
	 * we cannot have same class variable inside a class, unless it is static;
	 */
	public static void main(String[] args) {
		StackOFErr sto = new StackOFErr();
	}
	StackOFErr(){
		System.out.println("Cool");
	}
//	static <<Uncomment to fix the error or add static keyword to below line ;
	StackOFErr sofe = new StackOFErr();

}

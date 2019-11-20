package com.vtalent.java.venkatesh;

import java.util.Scanner;

class AgeException extends Exception{
	public String toString() {
		System.out.println("age should be>=25");
		return null;
	}
}
public class TestException {
	public static void main(String[] args) throws AgeException {
	Scanner sc=new Scanner(System.in);
	System.out.println("enetr your age to get loan");
	int age=sc.nextInt();
	if(age<25) {
		throw new AgeException();
	}
	else {
		System.out.println("you are elgible");
	}
	}
	}

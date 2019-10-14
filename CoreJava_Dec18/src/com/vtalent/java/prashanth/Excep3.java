package com.vtalent.java.prashanth;

import java.util.Scanner;

public class Excep3 extends Exception {

	public static void main(String[] args) throws Excep3  {
		Scanner s=new Scanner(System.in);
		System.out.println("please enter your age");
		int age=s.nextInt();
		if(age<25) {
			throw new Excep3();
		}
		else
		{
			System.out.println("you are eligible");
		}

	}

	@Override
	public String toString() {
		return "you age is not eligible";
	}

}

package com.vtalent.tarun.basics.mysystemprintln;

import java.util.Scanner;

public class Test {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		Mysystem.out.println("enter the first int value");
		int i=scn.nextInt();
		Mysystem.out.println("enter the second int value");
		int j=scn.nextInt();
		Mysystem.out.println("hello");
		Mysystem.out.println(i+j+"=int value");
		Mysystem.out.println('a'+"=char value");
		Mysystem.out.println(i+j+"=float value");
		Mysystem.out.println(i+j+"=double value");
		
	}
}
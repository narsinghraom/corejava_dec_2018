package com.vtalent.corejava.sunil;

import java.util.Scanner;

public class Sample {
	
	public int function(int a,int b) {
		
		return a+b;
	}
	public static void main(String[]args) {
		int a;
		int b;
		Scanner s=new Scanner(System.in);
		a=s.nextInt();
		b=s.nextInt();
       Sample sample=new Sample();

	System.out.println(sample.function(a, b));
	}

}

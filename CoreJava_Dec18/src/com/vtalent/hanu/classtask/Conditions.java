package com.vtalent.hanu.classtask;

import java.util.Scanner;

public class Conditions {
	
	public static double checkRead() {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter Overs");
		double d=s.nextDouble();
		if (d<=50 && d<=49.5) {
			System.out.println("**");
		}else {
			System.out.println("Overs must below 50");
			System.out.println("below 49.5");
			checkRead();
		}
		
		return d;
	}

}

package com.vtalent.hanu.classtask;

import java.util.Scanner;

public class Conditions {
	
	public static double checkRead() {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter Overs");
		double d=s.nextDouble();
		if (d>50) {
			//if (d>=49.5) {
			System.out.println("Overs must below 50");
			System.out.println("below 49.5");
			checkRead();
		//}
		}
		if (d>=49.6 && d<=49.9) {
			System.out.println(d+" is invalid overs");
			System.out.println("Overs must below 50 and below 49.5");
			System.out.println("Enter Again....");
			checkRead();
		}
		return d;
	}

}

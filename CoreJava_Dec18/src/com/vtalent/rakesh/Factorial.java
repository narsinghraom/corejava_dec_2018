package com.vtalent.rakesh;

import java.util.Scanner;

public class Factorial {

	public void factorial() {
		int i, fact = 1;
		System.out.println("please enter the number");
		Scanner s = new Scanner(System.in);
		int number = s.nextInt();
		number = 5;
		for (i = 1; i <= number; i++) {
			fact = fact * i;
		}
		System.out.println("Factorial of " + number + " is: " + fact);
	}
}

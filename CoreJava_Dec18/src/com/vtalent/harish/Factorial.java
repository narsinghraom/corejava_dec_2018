package com.vtalent.harish;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		int number, fact = 1;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter any number:");
		number = sc.nextInt();
		while (number >= 1) {
			fact = fact * number;
			number--;
		}
		System.out.println("Factorial of a number:\n" + fact);

	}

}
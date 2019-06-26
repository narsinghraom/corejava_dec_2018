package com.vtalent.amreen;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("enter String");
		String S1 = new String(input.nextLine());

		int x = S1.length();
		int factorial = 1;
		for (int i = 1; i <= x; i++) {
			factorial = factorial * i;

		}
		System.out.println("Factorial value is " + factorial);

	}
}

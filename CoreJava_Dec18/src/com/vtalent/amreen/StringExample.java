package com.vtalent.amreen;

import java.util.Scanner;

public class StringExample {
	static String original;
	static String reverse = "";

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out
				.println("please enter the string/number to find palindrome or not");
		original = sc.nextLine();
		int length = original.length();
		for (int i = 0; i <= length - 1; i++) {
			reverse = reverse + original.charAt(i);
		}
		if (original.equals(reverse))
			System.out.println("Entered string/number is a palindrome.");
		else
			System.out.println("Entered string/number isn't a palindrome.");

	}

}

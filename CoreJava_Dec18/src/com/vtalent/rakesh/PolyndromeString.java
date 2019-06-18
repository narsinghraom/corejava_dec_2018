package com.vtalent.rakesh;

import java.util.Scanner;

class PalindromeString {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");

		String str = sc.nextLine();
		String reverseStr = ""; // Objects of String class

		for (int i = str.length() - 1; i >= 0; i--) {
			reverseStr = reverseStr + str.charAt(i);
		}
		if (str.equals(reverseStr)) {
			System.out.println("Entered string is a palindrome.");
		} else {
			System.out.println("Entered string isn't a palindrome.");
		}

	}

}

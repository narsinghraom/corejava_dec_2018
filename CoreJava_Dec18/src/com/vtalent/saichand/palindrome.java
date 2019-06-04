package com.vtalent.saichand;

import java.util.Scanner;

public class palindrome {
	public static void main(String args[]) {
		String a, b = "";
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the string you want to check:");
		a = s.nextLine();
		System.out.println();
		for (int i = a.length() - 1; i >= 0; i--) {
			b = b + a.charAt(i);
		}
		if (a.equalsIgnoreCase(b)) {
			System.out.println("The string is palindrome.");
		} else {
			System.out.println("The string is not palindrome.");
		}
		System.out.println();
	}

}

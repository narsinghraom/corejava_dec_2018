package com.vtalent.tarun.basics;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		String s1, s2;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the String:");
		s1 = s.next();
		s2 = "";
		for (int i = s1.length() - 1; i >= 0; i--) {
			s2 = s2 + s1.charAt(i);
		}
		if (s2.equals(s1) == true) {
			System.out.println("String is a Palidrome");
		} else {
			System.out.println("Its is not a Palindrome");
		}
	}
}

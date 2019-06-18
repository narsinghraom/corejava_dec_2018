package com.vtalent.naresh;

import java.util.Scanner;

public class StringPalindrome {
		static String s1;
		static String r = "";

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out
					.println("please enter the string to know palindrome or not");
			s1 = sc.nextLine();
			int length = s1.length();
			for (int i = s1.length() - 1; i >= 0; i--) {
				r = r + s1.charAt(i);
			}
			if (s1.equals(r))
				System.out.println("Entered string is a palindrome.");
			else
				System.out.println("Entered string isn't a palindrome.");

		}

	}



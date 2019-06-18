package com.vtalent.kirankumar;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter string to be reversed");
		String ab = sc.nextLine();
		String reverse = "";
		char[] rarray = ab.toCharArray();
		for (int i = ab.length() - 1; i >= 0; i--)

		{
			reverse = reverse + rarray[i];

		}
		System.out.println(reverse);
		if (reverse.equals(ab)) {
			System.out.println("the string is palindrome");
		}

		else {
			System.out.println("the string is not palindrome");
		}

	}

}

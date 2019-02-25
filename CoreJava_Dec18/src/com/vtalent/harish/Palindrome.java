package com.vtalent.harish;

import java.util.Scanner;

public class Palindrome {
	public static void main(String args[]) {
		int number, temp, reverse = 0, remainder;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter any number:");
		number = s.nextInt();
		temp = number;
		while (number > 0) {
			remainder = number % 10;
			reverse = reverse * 10 + remainder;
			number = number / 10;
		}
		if (reverse == temp) {
			System.out.println("Given number " + temp + " is Palindrome");
		} else {
			System.out.println("Given number " + temp + " is Not Palindrome");
		}
	}
}
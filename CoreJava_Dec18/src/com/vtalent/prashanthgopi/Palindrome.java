package com.vtalent.prashanthgopi;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = s.nextInt();
		int r, sum = 0;
		int t = num;
		while (num > 0) {
			r = num % 10;
			num = num / 10;
			sum = sum * 10 + r;
		}
		if (t == sum)
			System.out.println("palindrome");
		else
			System.out.println("not a palindrome");

	}
}

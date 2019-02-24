package com.vtalent.harish;

import java.util.Scanner;

public class Sum_of_digits {
	public static void main(String[] args) {
		int number, last_digit, sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number:");
		number = sc.nextInt();
		while (number > 0) {
			last_digit = number % 10;
			sum = sum + last_digit;
			number = number / 10;

		}
		System.out.println("Sum_of_numbers:" + sum);

	}

}

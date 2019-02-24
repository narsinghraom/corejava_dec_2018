package com.vtalent.harish;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		int first = 0, second = 1, number;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number:");
		number = sc.nextInt();
		for (int i = 1; i <= 20; i++) {
			int sum = first + second;
			first = second;
			second = sum;
			System.out.println("Fibonacci series:" + sum);

		}

	}
}

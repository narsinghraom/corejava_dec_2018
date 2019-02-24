package com.vtalent.prashanthgopi;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = s.nextInt();
		int temp = 0;
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				temp = temp + 1;
			}
		}
		if (temp > 0)
			System.out.println(n+ "is prime number");

		else

			System.out.println(n+ "is not prime number");

	}
}

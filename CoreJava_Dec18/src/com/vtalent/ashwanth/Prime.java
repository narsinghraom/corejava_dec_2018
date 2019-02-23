package com.vtalent.ashwanth;

import java.util.*;

public class Prime {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter number to find prime or not");
		int num = s.nextInt();
		boolean isPrime = true;
		for (int i = 2; i <= num; i++) {
			if (num % i == 0) {
				isPrime = false;
				break;
			}
		}
		if (isPrime) {
			System.out.println(num + "is a prime number ");
		} else {
			System.out.println(+num+" not prime number");
		}
	}
}

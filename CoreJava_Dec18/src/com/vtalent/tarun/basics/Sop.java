package com.vtalent.tarun.basics;

//Write a program to find SUM OF PRIME numbers?
import java.util.Scanner;

public class Sop {
	public static boolean isPrime(int x) {
		if (x == 1)
			return false;
		for (int i = 2; i < x; i++) {
			if (x % i == 0) {
				return false;
			}

		}
		return true;
	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the n to print sum of prime Nos.....");
		int n = s.nextInt();
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			if (isPrime(i))
				sum = sum + i;
		}
		System.out.println("=======================");
		System.out.println("Sum of Prime no's in given n: " + sum);

	}
}
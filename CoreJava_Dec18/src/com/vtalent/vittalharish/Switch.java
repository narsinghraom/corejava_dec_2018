package com.vtalent.vittalharish;

import java.util.Scanner;

public class Switch {

	static Scanner scan = new Scanner(System.in);

	public void primenumbers() {
		int num, i, count = 0;
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter a Number : ");
		num = scan.nextInt();

		for (i = 2; i < num; i++) {
			if (num % i == 0) {
				count++;
				break;
			}
		}
		if (count == 0) {
			System.out.println("This is a Prime Number");
		} else {
			System.out.println("This is not a Prime Number");
		}

		while (true) {
			System.out.print("Are You Want to Continue (Y/N) ?");
			String userInput = scan.next();
			if (userInput.equalsIgnoreCase("Y"))
				primenumbers();
			else if (userInput.equalsIgnoreCase("N")) {
				System.out.println("Thank you !!");
				break;
			} else {
				System.out.print("Try Again With (Y/N) only !");
			}

		}

	}

	public void factorial() {

		int n, c, fact = 1;

		System.out.println("Enter an integer to calculate it's factorial");
	/*	Scanner scan = new Scanner(System.in);
*/
		n = scan.nextInt();

		if (n < 0)
			System.out.println("Number should be non-negative.");
		else {
			for (c = 1; c <= n; c++)
				fact = fact * c;

			System.out.println("Factorial of " + n + " is = " + fact);
		}
		while (true) {
			System.out.print("Are You Want to Continue (Y/N) ?");
			String userInput = scan.next();
			if (userInput.equalsIgnoreCase("Y"))
				primenumbers();
			else if (userInput.equalsIgnoreCase("N")) {
				System.out.println("Thank you !!");
				break;
			} else {
				System.out.print("Try Again With (Y/N) only !");
			}

		}
	}

	public void fibonacci() {
		int count, num1 = 0, num2 = 1;
		System.out.println("How may numbers you want in the sequence:");
		//Scanner scanner = new Scanner(System.in);
		count = scan.nextInt();
		System.out.print("Fibonacci Series of " + count + " numbers:");

		int i = 1;
		while (i <= count) {
			System.out.print(num1 + " ");
			int sumOfPrevTwo = num1 + num2;
			num1 = num2;
			num2 = sumOfPrevTwo;
			i++;
		}
		while (true) {
			System.out.print("Are You Want to Continue (Y/N) ?");
			String userInput = scan.next();
			if (userInput.equalsIgnoreCase("Y"))
				primenumbers();
			else if (userInput.equalsIgnoreCase("N")) {
				System.out.println("Thank you !!");
				break;
			} else {
				System.out.print("Try Again With (Y/N) only !");
			}

		}
	}

	public void MinMax() {
		int[] a = { 3, 7, 10, 0, 1 };
		int min = a[0];
		for (int i = 1; i < a.length; i++) {
			if (a[i] < min) {
				min = a[i];
			}
		}
		int max = a[0];
		for (int i = 1; i <= a.length - 1; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}

		System.out.println("Minimum Value:" + min);
		System.out.println("Maximum Value:" + max);

	}
}
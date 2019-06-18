package com.vtalent.kirankumar;

import java.util.Scanner;

public class LogicPrograms {

	static void PrimeCheck() {
		int temp;
		boolean isPrime = true;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter any number:");
		// capture the input in an integer
		int num = scan.nextInt();
		scan.close();
		for (int i = 2; i <= num / 2; i++) {
			temp = num % i;
			if (temp == 0) {
				isPrime = false;
				break;
			}
		}
		// If isPrime is true then the number is prime else not
		if (isPrime)
			System.out.println(num + " is a Prime Number");
		else
			System.out.println(num + " is not a Prime Number");
	}

	static void FactorialDemo() {
		// Scanner object for capturing the user input
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number:");
		// Stored the entered value in variable
		int num = scan.nextInt();
		// Called the user defined function fact
		int factorial = fact(num);
		System.out.println("Factorial of entered number is: " + factorial);
	}

	static int fact(int n) {
		int output;
		if (n == 1) {
			return 1;
		}
		// Recursion: Function calling itself!!
		output = fact(n - 1) * n;
		return output;
	}

	static void Fibonacci() {
		int n1 = 0, n2 = 1, n3, i, count = 15;
		System.out.print(n1 + " " + n2);// printing 0 and 1

		for (i = 2; i < count; ++i)// loop starts from 2 because 0 and 1 are
									// already printed
		{
			n3 = n1 + n2;
			System.out.print(" " + n3);
			n1 = n2;
			n2 = n3;
		}

	}

	static void MinMaxExample() {

		int array[] = new int[] { 10, 11, 88, 2, 12, 120 };

		// Calling getMax() method for getting max value
		int max = getMax(array);
		System.out.println("Maximum Value is: " + max);

		// Calling getMin() method for getting min value
		int min = getMin(array);
		System.out.println("Minimum Value is: " + min);
	}

	// Method for getting the maximum value
	public static int getMax(int[] inputArray) {
		int maxValue = inputArray[0];
		for (int i = 1; i < inputArray.length; i++) {
			if (inputArray[i] > maxValue) {
				maxValue = inputArray[i];
			}
		}
		return maxValue;
	}

	// Method for getting the minimum value
	public static int getMin(int[] inputArray) {
		int minValue = inputArray[0];
		for (int i = 1; i < inputArray.length; i++) {
			if (inputArray[i] < minValue) {
				minValue = inputArray[i];
			}
		}
		return minValue;
	}

	/*
	 * 
	 * public static void insertionSort(int array[]) { int n = array.length; for
	 * (int j = 1; j < n; j++) { int key = array[j]; int i = j-1; while ( (i >
	 * -1) && ( array [i] > key ) ) { array [i+1] = array [i]; i--; } array[i+1]
	 * = key; } }
	 * 
	 * public static void main(String a[]){ int[] arr1 = {9,14,3,2,43,11,58,22};
	 * System.out.println("Before Insertion Sort"); for(int i:arr1){
	 * System.out.print(i+" "); } System.out.println();
	 * 
	 * insertionSort(arr1);//sorting array using insertion sort
	 * 
	 * System.out.println("After Insertion Sort"); for(int i:arr1){
	 * System.out.print(i+" "); } } }
	 * 
	 */

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		System.out.println('\n' + "1. To check given number is prime or not" + '\n'
				+ "2. to find the factorial of given number " + '\n' + "3. To print the fibonacci series" + '\n'
				+ "4. Find the minmax value" + '\n' + "5. To exit");

		int x = sc.nextInt();

		switch (x) {

		case 1:

			PrimeCheck();
			break;
		case 2:
			FactorialDemo();
			break;
		case 3:
			Fibonacci();
			break;

		case 4:
			MinMaxExample();
			break;
		case 5:
			System.out.println("exit");
		}
	}

}

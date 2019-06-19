package com.vtalent.saritha;
import java.util.Scanner;
public class Mainoperations {

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
}

		
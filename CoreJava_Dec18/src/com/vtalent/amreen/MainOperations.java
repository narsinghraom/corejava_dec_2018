package com.vtalent.amreen;

import java.util.Scanner;

public class MainOperations {
	Scanner sc = new Scanner(System.in);
	int[] array;
	int[] tempMergeArr;
	int length;

	public void primeNumber() {
		int numToCheck;
		int reminder;
		boolean isPrime = true;

		System.out.println("enter number to check for prime :");
		numToCheck = sc.nextInt();
		for (int i = 2; i <= numToCheck; i++) {

			reminder = numToCheck % 2;
			if (reminder == 0) {
				isPrime = false;
				break;
			}

			if (isPrime) {
				System.out.println(numToCheck + "is a prime number");

			} else {
				System.out.println(numToCheck + "is a not prime number");
			}
			break;
		}

	}

	public void factorial() {

		int fact = 1;
		int number;// It is the number to calculate factorial
		System.out.println("enter number to find its factorial");
		number = sc.nextInt();
		for (int i = 1; i <= number; i++) {
			fact = fact * i;
		}
		System.out.println("Factorial of " + number + " is: " + fact);
	}

	public void fib() {
		int a = 0, b = 1, c;
		System.out.println("enter position to find fib");
		int position = sc.nextInt();
		if (position == 0) {
			System.out.println("value at position 0 is 0");
		}
		if (position == 1) {
			System.out.println("value at position 1 is 1");
		}

		for (int i = 2; i <= position; i++) {
			c = a + b;
			a = b;
			b = c;
			if (position == i) {
				System.out.println("value is" + c);
			}

		}

	}

	public void findMinMax() {
		int[] array = { 3, 7, 10, 0, 1 };
		int min = array[0];
		for (int i = 0; i <= array.length - 1; i++)

		{
			if (array[i] < min) {
				min = array[i];
			}
		}
		int max = array[0];
		for (int i = 0; i <= array.length - 1; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		System.out.println("minimum value is" + min);
		System.out.println("maximum value is " + max);

	}

	public void insertionSort() {
		int[] array = { 3, 7, 10, 0, 1 };
		int temp, j;
		for (int i = 1; i < array.length; i++) {
			temp = array[i];
			j = i;
			while (j > 0 && array[j - 1] > temp) {
				array[j] = array[j - 1];
				j = j - 1;
			}
			array[j] = temp;

		}
		for (int i = 0; i < array.length; i++) {
			System.out.println("sorted list is " + array[i]);
		}

	}

	// rest of the methods are for merge sort

	public void sort(int inputArr[]) {
		/*
		 * int[] array; int[] tempMergeArr; int length;
		 */
		array = inputArr;
		length = inputArr.length;
		// temporary array created
		tempMergeArr = new int[length];
		// we are dividing array here
		divideArray(0, length - 1);

	}

	public void divideArray(int lowerIndex, int higherIndex) {
		if (lowerIndex < higherIndex) {
			// it will take out middle
			// in our case mile value will be 7
			int middle = lowerIndex + (higherIndex - lowerIndex) / 2;
			// using recursion technique and storing values in stack
			// this will sort left side of array
			divideArray(lowerIndex, middle);
			// this will sort right side array
			divideArray(middle + 1, higherIndex);
			// after sorting left and right we will start merging them
			// using different method for merging
			mergeArray(lowerIndex, middle, higherIndex);

		}

	}

	public void mergeArray(int lowerIndex, int middle, int higherIndex) {
		for (int i = lowerIndex; i <= higherIndex; i++) {
			// all avlues are stored in temparray
			tempMergeArr[i] = array[i];
		}
		// we are taking i,j,k because we dont want to change the values of
		// lower, middle+1,lower to change(here i value will be 0, j will
		// be(middle+1=0+1= 1,
		// k will be 0
		int i = lowerIndex;
		int j = middle + 1;
		int k = lowerIndex;
		while (i <= middle && j <= higherIndex)

		{
			// i is lower index, j is middle+1
			if (tempMergeArr[i] <= tempMergeArr[j]) {
				array[k] = tempMergeArr[i];
				i++;
			} else {
				array[k] = tempMergeArr[j];
				j++;
			}
			k++;
		}
		while (i <= middle) {
			array[k] = tempMergeArr[i];
			k++;
			i++;

		}

	}
}

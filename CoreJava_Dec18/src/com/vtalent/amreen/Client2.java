package com.vtalent.amreen;

import java.util.Scanner;

public class Client2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MainOperations mo = new MainOperations();
		for (int j = 0; j <= 100; j++) {
			System.out.println("select an option from below: "
					+ "\n1.Find prime number" + "\n2.Find factorial"
					+ "\n3.Find Fibonacci"
					+ "\n4.Find min and max values from 3,7,10,0,1"
					+ "\n5.InsertionSort" + "\n6.MergeSort");

			int options = sc.nextInt();

			switch (options) {
			case 1:
				mo.primeNumber();
				break;
			case 2:
				mo.factorial();
				break;
			case 3:
				mo.fib();
				break;
			case 4:
				mo.findMinMax();
				break;
			case 5:
				mo.insertionSort();
				break;
			case 6:
				/*
				 * int[] array; int[] tempMergeArr; int length;
				 */
				int[] inputArr = { 3, 7, 10, 0, 1 };
				mo.sort(inputArr);
				for (int i : inputArr) {
					System.out.println(i + "");
				}
			}

		}
	}
}

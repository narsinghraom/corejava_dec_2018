package com.vtalent.amreen;

import java.util.Scanner;

public class Client2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MainOperations mo = new MainOperations();
		for (int i = 0; i <= 100; i++) {
			System.out.println("select an option from below: "
					+ "\n1.Find prime number" + "\n2.Find factorial"
					+ "\n3.Find Fibonacci"
					+ "\n4.Find min and max values from 3,7,10,0,1"
					+ "\n5.InsertionSort");

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
			case 4:
				mo.findMinMax();
			case 5:
				mo.insertionSort();

			}

		}
	}
}

package com.vtalent.rakesh;

import java.util.Scanner;

public class Task {
	public static void main(String args[]) {

		PrimeNumber p = new PrimeNumber();
		Factorial f = new Factorial();
		Fibonacci fib = new Fibonacci();
		ArrayMaxMin m = new ArrayMaxMin();
		InsertionSort i = new InsertionSort();
		Scanner s = new Scanner(System.in);

		for (;;) {
			System.out.println(
					"1.To find prime number" + '\n' + "2.To find factorialnumber" + '\n' + "3.To find fibonacci series "
							+ '\n' + "4.To find arraymaxandmin" + '\n' + "5.To find insertion sort");

			int a = s.nextInt();

			if (a == 1) {
				p.primeNumber();
			} else if (a == 3) {
				fib.fibonacci();
			}

			else if (a == 4) {
				int[] inputarray = { 0, 1, 2, 3, 4 };
				m.arrayMaxMin(inputarray);
				// System.out.println("still under process..."+'\n');
			} else if (a == 2) {
				f.factorial();
			} else if (a == 5) {

				i.insertionSort();
			}

			else if (a == 6) {
				break;
			}

			else {
				System.out.println("Enter Valid Search" + '\n');
			}
		}

	}

}

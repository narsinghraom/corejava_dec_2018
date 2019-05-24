package com.vtalent.rakesh;

import java.util.Scanner;

public class Task {
	public static void main(String args[]) {

		System.out.println("1.To find prime number" + '\n' + "2.To find factorialnumber" + '\n'
				+ "3.To find fibonacci series " + '\n' + "4.To find arraymaxandmin");

		PrimeNumber p = new PrimeNumber();
		Factorial f = new Factorial();
		Fibonacci fib = new Fibonacci();
		ArrayMaxMin a = new ArrayMaxMin();
		Scanner s = new Scanner(System.in);

		int i = s.nextInt();
		switch (i) {
		case 1:
			p.primeNumber();
			break;
		case 2:
			f.factorial();
			break;
		case 3:
			fib.fibonacci();
			break;
		case 4:
			int array[] = new int[] { 10, 11, 88, 2, 12, 120 };
			a.arrayMaxMin(array);
			break;
		default:
			System.out.println("give proper input");
		}
	}

}

package com.vtalent.venkatesh;

import java.util.Scanner;

public class Fibonacci {
     public static void fibonacci() {

		System.out.println("enter the number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), t1 = 0, t2 = 1;
		System.out.print("First " + n + " terms: ");

		for (int i = 1; i <= n; ++i) {
			System.out.print(t1 + " + ");

			int sum = t1 + t2;
			t1 = t2;
			t2 = sum;
		}
	}

	public static void main(String[] args) {
		fibonacci();
	}
}

package com.vtalent.corejava.alekya.basicprgrms;

import java.util.Scanner;

public class Fibonacci {
     public static void fibonacci() {

		System.out.println("enter the number");
		Scanner sca = new Scanner(System.in);
		int num = sca.nextInt(), t1 = 0, t2 = 1;
		System.out.print("First " + num + " terms: ");

		for (int i = 1; i <= num; ++i) {
			System.out.print(t1);

			int sum = t1 + t2;
			t1 = t2;
			t2 = sum;
		}
	}

	public static void main(String[] args) {
		fibonacci();
	}
}



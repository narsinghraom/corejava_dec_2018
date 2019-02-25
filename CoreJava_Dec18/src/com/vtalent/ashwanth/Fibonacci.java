package com.vtalent.ashwanth;

import java.util.*;

public class Fibonacci {
	public static void main(String[] args) {
		int k = 0, a, b;
		Scanner s = new Scanner(System.in);
		System.out.println("enter a:");
		a = s.nextInt();
		System.out.println("enter b:");
		b = s.nextInt();
		System.out.println("see below");
		while (k <= 50) {
			k = a + b;
			System.out.println(k + "");
			System.out.println("flow");
			a = b;
			b = k;

		}
	}
}

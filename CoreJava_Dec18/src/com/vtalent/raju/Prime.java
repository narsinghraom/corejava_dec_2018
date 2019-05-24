package com.vtalent.raju;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {

		int k;
		int count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		k = sc.nextInt();
		for (int i = 0; i <=k; i++) {
			if (k % i == 0)

			{
				count++;

			}

		}
		if (count == 2) {
			System.out.println(k + "is a Prime Number ");

		} else {
			System.out.println(k + "is  Not a Prime Number ");
		}
	}
}

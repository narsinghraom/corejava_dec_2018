package com.vtalent.tarun.basics;

import java.util.Scanner;

public class PrintTable {
	private static final Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter a number :");

		int t = scn.nextInt();

		for (int i = 1; i <= 12; i++) {
			System.out.println(t + " " + "x" + " " + i + " " + "=" + " " + t * i);
		}
	}

}

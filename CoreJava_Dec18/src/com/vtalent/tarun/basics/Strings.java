/*
 Task
Given an integer, , perform the following conditional actions:

--If  is odd, print Weird
--If  is even and in the inclusive range of  to , print Not Weird
--If  is even and in the inclusive range of  to , print Weird
--If  is even and greater than , print Not Weird
--Complete the stub code provided in your editor to print whether or not  is weird.

**Input Format

A single line containing a positive integer, .

Constraints

**Output Format

Print Weird if the number is weird; otherwise, print Not Weird.
*/
package com.vtalent.tarun.basics;

import java.util.Scanner;

public class Strings {

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("1 out:");
		int N = scanner.nextInt();

		if (N % 2 != 0)
			System.out.println("Weird");
		else if (N >= 2 && N <= 5) {
			System.out.println("Not Weird");
		} else if (N >= 6 && N <= 20) {
			System.out.println("Weird");
		} else if (N > 20) {
			System.out.println("Not Weird");
		}
	}
}
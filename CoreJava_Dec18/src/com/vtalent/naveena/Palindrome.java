package com.vtalent.naveena;

import java.util.Scanner;

class Palindrome {
	public static void main(String[] args) {
		int a, no, b, temp = 0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any num: ");
		no = s.nextInt();
		b = no;
		while (no!= 0) {
			a = no % 10;

			temp = temp * 10 + a;
			no = no / 10;
		}
		if (temp == b) {
			System.out.println("Palindrome");
		} else {
			System.out.println("not Palindrome");
		}
	}
}
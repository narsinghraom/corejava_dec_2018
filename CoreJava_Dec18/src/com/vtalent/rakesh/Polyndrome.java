package com.vtalent.rakesh;

import java.util.Scanner;

public class Polyndrome {
	public static void main(String[] args) {
		String original;
		String q = "";
		System.out.println("enter any String");
		Scanner sc = new Scanner(System.in);
		original = sc.next();
		int lenght = original.length();
		for (char i = 0; i < lenght; i--) {

			char reverse = original.charAt(i);
			System.out.print(reverse);
			String q1 = String.valueOf(reverse);
			q = q1;
		}
		if (original.equals(q)) {
			System.out.print("it is a polyndrome");
		} else {
			System.out.print("it is not a polyndrome");
		}
	}

}
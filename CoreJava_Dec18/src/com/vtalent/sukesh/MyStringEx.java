package com.vtalent.sukesh;

import java.util.Scanner;

public class MyStringEx {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("entet String: ");
		String s = sc.nextLine();

		/*
		 * * String S1 = new String(); for (int i = s.length() - 1; i >= 0; i--)
		 * { S1 = S1 + s.charAt(i); // System.out.println(S1); }
		 * System.out.println(S1); if (s.equalsIgnoreCase(S1)) {
		 * System.out.println("Palindram"); } else {
		 * System.out.println("Not Palindram"); }
		 */

		char[] c = new char[s.length()];
		int j = 0;
		for (int i = s.length() - 1; i >= 0; i--) {

			c[j] = s.charAt(i);

			j++;
		}
		// String s2 = c.toString();
		String s1 = new String(c);
		System.out.println(s1);
		// System.out.println(s2);
		System.out.println(s.length());
		if (s.equalsIgnoreCase(s1)) {
			System.out.println("Palindram");
		} else {
			System.out.println("Not PAlindram");
		}

	}

}

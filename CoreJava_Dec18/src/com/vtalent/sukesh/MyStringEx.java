package com.vtalent.sukesh;

import java.util.Scanner;

public class MyStringEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("entet String: ");
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String S1 = new String();
		for (int i = s.length() - 1; i >= 0; i--) {
			S1 = S1 + s.charAt(i);
			// System.out.println(S1);
		}
		System.out.println(S1);
		if (s.equalsIgnoreCase(S1)) {
			System.out.println("Palindram");
		} else {
			System.out.println("Not Palindram");
		}

	}

}

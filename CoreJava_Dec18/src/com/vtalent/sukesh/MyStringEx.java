package com.vtalent.sukesh;

import java.util.Scanner;

public class MyStringEx {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("entet String: ");
		String Ss = sc.nextLine();

		char[] Cc = new char[Ss.length()];
		int j = 0;
		for (int i = Ss.length() - 1; i >= 0; i--) {

			Cc[j] = Ss.charAt(i);

			j++;
		}
		String Ss1 = new String(Cc);
		System.out.println(Ss1);

		System.out.println(Ss.length());
		if (Ss.equalsIgnoreCase(Ss1)) {
			System.out.println("Palindram");
		} else {
			System.out.println("Not PAlindram");
		}

	}

}

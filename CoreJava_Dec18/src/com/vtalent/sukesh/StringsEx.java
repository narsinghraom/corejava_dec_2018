package com.vtalent.sukesh;

import java.util.Scanner;

public class StringsEx {
	static Scanner sc;

	public static void main(String[] args) {

		System.out.println("Enter String:");
		sc = new Scanner(System.in);
		String Ss = sc.nextLine();
		for (int i = 0; i <= Ss.length() - 1; i++) {
			if (Ss.charAt(i) != ' ') {
				System.out.print(Ss.charAt(i));
			}

		}

	}

}

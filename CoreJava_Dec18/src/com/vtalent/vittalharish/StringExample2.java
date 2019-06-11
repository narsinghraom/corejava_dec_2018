package com.vtalent.vittalharish;

import java.util.Scanner;

public class StringExample2 {
	public static void main(String[] args) {
		System.out.println("Enter String:");
		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();
		for (int i = 0; i <= S.length() - 1; i++) {
			if (S.charAt(i) != ' ') {
				System.out.print(S.charAt(i));
			}

		}

	}

}

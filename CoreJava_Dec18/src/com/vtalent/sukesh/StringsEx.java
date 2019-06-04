package com.vtalent.sukesh;

import java.util.Scanner;

public class StringsEx {

	public static void main(String[] args) throws NullPointerException {
		// TODO Auto-generated method stub
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

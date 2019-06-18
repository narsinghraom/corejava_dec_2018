package com.vtalent.rakesh;

import java.util.Scanner;

public class StringSimilarLetters {

	public static void main(String[] args) {

		System.out.println("Enter any string ");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		s = s.toLowerCase();
		char[] C = s.toCharArray();
		for (int i = 0; i < C.length; i++) {
			int x = 0;
			int x1 = 0;
			for (int j = 0; j <= i; j++) {
				if (C[i] == C[j]) {
					x1++;
				}
			}
			if (x1 == 1 && C[i] != ' ') {
				for (int k = 0; k < C.length; k++) {
					if (C[i] == C[k]) {
						x++;
					}
				}
				if (x > 1) {
					System.out.println(C[i] + " " + x + "Times");
				}

			}
		}
	}
}

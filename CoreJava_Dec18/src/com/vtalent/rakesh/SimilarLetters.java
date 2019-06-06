package com.vtalent.rakesh;

import java.util.Scanner;

public class SimilarLetters {

	public static void main(String[] args) {

		System.out.println("Enter any string ");
		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();
		S = S.toLowerCase();
		char[] C = S.toCharArray();
		for (int i = 0; i < C.length; i++) {
			int Count = 0;
			int count1 = 0;
			for (int j = 0; j <= i; j++) {
				if (C[i] == C[j]) {
					count1++;
				}
			}
			if (count1 == 1 && C[i] != ' ') {
				for (int k = 0; k < C.length; k++) {
					if (C[i] == C[k]) {
						Count++;
					}
				}
				if (Count > 1) {
					System.out.println(C[i] + " " + Count + "Times");
				}

			}
		}
	}
}

package com.vtalent.sukesh;

import java.util.Scanner;

public class StringEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * String S1 = "ABCD"; String S2 = "DEFA";
		 */
		System.out.println("Enter Two String:");
		Scanner sc = new Scanner(System.in);
		String S1 = sc.nextLine();
		String S2 = sc.nextLine();
		String S3 = S1 + S2;
		S3 = S3.toUpperCase();
		System.out.println(S3);
		char[] C1 = S1.toCharArray();
		char[] C2 = S2.toCharArray();
		/*
		 * for (int i = 0; i < C.length; i++) { // System.out.print(C[i]); int
		 * Count = 0; for (int j = 0; j < C.length; j++) { if (C[i] == C[j]) {
		 * Count++; } } if (Count == 1) { System.out.print(C[i]); }
		 * 
		 * }
		 */

		for (int i = 0; i < S1.length(); i++) {
			for (int j = 0; j < S2.length(); j++) {
				if (S1.charAt(i) == S2.charAt(j)) {
					S1 = S1.replace(C1[i], ' ');
					S1 = S2.replace(C2[j], ' ');

				}
			}
		}
		System.out.println(S1 + "" + S2);
	}
}

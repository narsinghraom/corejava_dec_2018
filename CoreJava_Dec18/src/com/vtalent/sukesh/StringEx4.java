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
		//System.out.println(S3);
		char[] C = S3.toCharArray();
		for (int i = 0; i < C.length; i++) {
			// System.out.print(C[i]);
			int Count = 0;
			for (int j = 0; j < C.length; j++) {
				if (C[i] == C[j]) {
					Count++;
				}
			}
			if (Count == 1) {
				System.out.print(C[i]);
			}

		}
	}
}

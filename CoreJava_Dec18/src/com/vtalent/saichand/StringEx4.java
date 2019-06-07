package com.vtalent.saichand;

import java.util.Scanner;

public class StringEx4 {
	public static void main(String[] args) {
		System.out.println("Enter Two String:");
		Scanner sc = new Scanner(System.in);
		String S111 = sc.nextLine();
		String S21 = sc.nextLine();
		String S3 = S111 + S21;
		S3 = S3.toUpperCase();
		System.out.println(S3);
		char[] C = S3.toCharArray();
		for (int i = 0; i < C.length; i++) {
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

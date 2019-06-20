package com.vtalent.sukesh;

import java.util.Scanner;

public class StringEx4 {

	static Scanner sc;

	public static void main(String[] args) {

		System.out.println("Enter Two String:");
		sc = new Scanner(System.in);
		String Ss1 = sc.nextLine();
		String Ss2 = sc.nextLine();
		String Ss3 = Ss1 + Ss2;
		Ss3 = Ss3.toUpperCase();
		System.out.println(Ss3);
		char[] Cc = Ss3.toCharArray();

		for (int i = 0; i < Cc.length; i++) {
			int Count = 0;
			for (int j = 0; j < Cc.length; j++) {
				if (Cc[i] == Cc[j]) {
					Count++;
				}
			}
			if (Count == 1) {
				System.out.print(Cc[i]);
			}

		}

	}
}

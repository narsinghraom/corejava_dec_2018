package com.vtalent.sukesh;

import java.util.Scanner;

public class StringEx1 {
	static Scanner sc;

	public static void main(String[] args) {
		System.out.println("Enter any string ");
		sc = new Scanner(System.in);
		String Ss = sc.nextLine();
		Ss = Ss.toLowerCase();
		char[] Cc = Ss.toCharArray();
		for (int i = 0; i < Cc.length; i++) {
			int Cc1 = 0;
			int Cc2 = 0;
			for (int j = 0; j <= i; j++) {
				if (Cc[i] == Cc[j]) {
					Cc2++;
				}
			}
			if (Cc2 == 1 && Cc[i] != ' ') {
				for (int k = 0; k < Cc.length; k++) {
					if (Cc[i] == Cc[k]) {
						Cc1++;
					}
				}
				if (Cc1 > 1) {
					System.out.println(Cc[i] + " " + Cc1 + "Times");
				}

			}
		}
	}
}

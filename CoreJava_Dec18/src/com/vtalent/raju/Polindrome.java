package com.vtalent.raju;

import java.util.Scanner;

public class Polindrome {
	
			public static void main(String[] args) {
			while (true) {
				String original;
				String rev = "";
				Scanner sc = new Scanner(System.in);
				System.out.println("\n\nEnter a String ");
				original = sc.nextLine();
				int len = original.length();
				char[] ch = original.toCharArray();
				for (int i = len - 1; i >= 0; i--) {
					rev = rev + ch[i];

				}
				System.out.print(rev);

				if (original.equals(rev)) {
					System.out.print("\nPalendrome");

				} else {
					System.out.print("\nnot Palendrome");
				}
			}

		}
	}

}

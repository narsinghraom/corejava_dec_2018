package com.vtalent.saritha;

import java.util.Scanner;

public class Duplicatestring {

		public static void main(String[] args) {
			System.out.println("Enter the string ");
			Scanner sc = new Scanner(System.in);
			String Dup = sc.nextLine();
			Dup = Dup.toLowerCase();
			char[] d = Dup.toCharArray();
			for (int i = 0; i < d.length; i++) {
				int C = 0,c=0;
				for (int j = 0; j <= i; j++) {
					if (d[i] == d[j]) {
						c++;
					}
				}
				if (c == 1 && d[i] != ' ') {
					for (int k = 0; k < d.length; k++) {
						if (d[i] == d[k]) {
							C++;
						}
					}
					if (C > 1) {
						System.out.println(d[i] + " " + C+ "two times repeated ");
					}

				}
			}

		}


}

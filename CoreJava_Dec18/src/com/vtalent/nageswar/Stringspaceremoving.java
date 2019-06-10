package com.vtalent.nageswar;

import java.util.Scanner;

public class Stringspaceremoving {

	public static void main(String[] args) {

		while (true) {
			Scanner sc = new Scanner(System.in);

			System.out.println("enter the string : ");
			String s1 = sc.nextLine().toLowerCase();
			// String s1 = "hello welcome";
			char[] ch = s1.toCharArray();

			for (int i = 0; i < s1.length(); i++) {
				if ((ch[i] != ' ') && (ch[i] != '\t')) {

					System.out.print(ch[i]);
				}

			}
			System.out.println("\n");

		}

	}
}
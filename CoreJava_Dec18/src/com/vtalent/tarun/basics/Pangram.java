package com.vtalent.tarun.basics;

import java.util.*;

public class Pangram {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a String to check Pangram or not:");
		String x = s.nextLine();

		boolean[] alphaList = new boolean[26];
		int index = 0;
		int flag = 1;
		for (int i = 0; i < x.length(); i++) {
			if (x.charAt(i) >= 'A' && x.charAt(i) <= 'Z') {
				index = x.charAt(i) - 'A';
			} else if (x.charAt(i) >= 'a' && x.charAt(i) <= 'z') {
				index = x.charAt(i) - 'a';
			}
			alphaList[index] = true;
		}
		for (int i = 0; i <= 25; i++) {
			if (alphaList[i] == false)
				flag = 0;
		}
		System.out.print("String: " + x);
		if (flag == 1)
			System.out.print("\nThe above String is a pangram.");
		else
			System.out.print("\nThe above String is not a pangram.");
	}
}

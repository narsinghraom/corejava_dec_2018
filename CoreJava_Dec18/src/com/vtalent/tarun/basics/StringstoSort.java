package com.vtalent.tarun.basics;

public class StringstoSort {

	public static void main(String[] args) {
		String[] s = { "tarun", "kumar", "atk", "tamil", "telugu", "hindi" };
		String temp;
		for (int i = 0; i < s.length; i++) {
			for (int j = i + 1; j < s.length; j++) {
				if (s[j].compareTo(s[i]) < 0) {
					temp = s[i];
					s[i] = s[j];
					s[j] = temp;
				}
			}
		}
		for (int i1 = 0; i1 < s.length; i1++) {
			System.out.print(s[i1] + " ");
		}
	}
}

package com.vtalent.rakesh;

public class StringEmpty {
	public static void main(String[] args) {

		String s = "rakesh rakesh doing";

		char[] ch = s.toCharArray();

		for (int i = 0; i <= s.length() - 1; i++) {

			if (ch[i] == ' ') {

				ch[i] = ch[i + 1];
			}
		}
		for (int k = 0; k <= ch.length - 1; k++) {
			System.out.print(ch[k]);
		}

	}
}
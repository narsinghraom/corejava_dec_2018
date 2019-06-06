package com.vtalent.rakesh;

public class StringRepeatWords {
	public static void main(String[] args) {

		String s = "rakesh rakesh doing";
		String s1 = s.toLowerCase();

		char[] ch = new char[s.length()];

		for (int i = 0; i <= s1.length() - 1; i++) {

			if (ch[i] == '\0') {
				ch[i] = ch[i + 1];
			}

		}
		for (int i = 0; i <= ch.length; i++) {
			System.out.println(ch[i]);
		}
	}
}
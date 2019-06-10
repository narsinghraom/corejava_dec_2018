package com.vtalent.srihari;

public class StringRepeatedCount {
	public static void main(String[] args) {
		String str = "llll";
		char[] ch = str.toCharArray();
		int l = ch.length;
		int i = 0, j = 0, count = 0;
		for (i = 0; i < l; ++i) {
			count = 0;
			for (j = 0; j < l; ++j) {
				if (j < i && ch[i] == ch[j])
					break;
				if (ch[j] == ch[i]) {
					count++;

				}
				if (j == l - 1) {
					// System.out.println("the character " + ch[i] + " is present " + count +
					// "times");
				}
				if (count > 1) {
					System.out.println(ch[i] + " " + count + "Times");
				}

			}

		}
	}
}
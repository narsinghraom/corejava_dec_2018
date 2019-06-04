package com.vtalent.rakesh;

public class SimilarLetters {
	public static void main(String[] args) {

		String src = "vtalenttfrtvrtvrvrvrinfo";

		char[] srcChar = src.toLowerCase().toCharArray();

		int len = srcChar.length;
		int j = 0;
		boolean flag = false;
		char ch;

		int k = 0;

		for (int i = 0; i < len; i++) {

			for (j = 0; j < len; j++) {

				if (srcChar[i] == srcChar[j]) {
					k++;
				}
			}
			if (k > 1) {
				if (srcChar[i] > 1) {
					System.out.println("This character " + srcChar[i] + " has repeated " + k + " time");
				} else {
					System.out.println("There are no characters repeated in the given string");
				}
			}
			k = 0;
		}
	}
}

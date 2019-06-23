package com.vtalent.rakesh;

public class StringRepeatWords {
	public static void repeatedWords() {

		String s = "Vtalent  info systems systems info";

		String q = s.toLowerCase();
		String repeatedwords[] = s.split(" ");
		System.out.println(q);
		for (int i = 0; i <= repeatedwords.length - 1; i++) {

			for (int j = i + 1; j <= repeatedwords.length - 1; j++) {
				if (repeatedwords[i].equals(repeatedwords[j])) {

					System.out.println("repeated word is :" + repeatedwords[i]);
				}
			}
		}
	}

	public static void main(String[] args) {
		repeatedWords();

	}
}
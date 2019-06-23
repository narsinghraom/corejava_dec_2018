package com.vtalent.rakesh;

public class RepeatedWords {
	public static void repeatedWords() {

		String str = "Vtalent info systems ";

		String q = str.toLowerCase();
		System.out.println(q);
		String words[] = str.split(" ");

		for (int i = 0; i <= words.length - 1; i++) {

			for (int j = i + 1; j <= words.length - 1; j++) {
				if (words[i].equals(words[j])) {

					System.out.println(words[i]);
				}
			}

		}
	}

	public static void main(String[] args) {
		repeatedWords();
	}
}

package com.vtalent.nageswar;

import java.util.Scanner;

public class DuplicateLetters {

	public void findDuplicates() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter string");
		String str = sc.nextLine();

		char[] array = str.toCharArray();
		int count = 1;
		int length = array.length;
		char[] temp = new char[length];

		for (int i = 0; i < length; i++) {

			if (array[i] != temp[i]) {
				for (int j = i + 1; j <= length - 1; j++) {

					// char temp = 'x';
					if (array[i] == array[j]) {

						count++;

					}

					temp[i] = array[i];

				}
				if (count > 1) {
					if (array[i] > 1) {
						System.out.println("character " + array[i]
								+ " has repeated " + count + " times");

					}
					count = 1;
				}
			}
		}
	}

	public static void main(String[] args) {
		DuplicateLetters rv = new DuplicateLetters();
		rv.findDuplicates();

	}
}

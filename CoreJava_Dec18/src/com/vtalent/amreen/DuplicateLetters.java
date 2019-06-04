package com.vtalent.amreen;

import java.util.Scanner;

public class DuplicateLetters {
	public void findDuplicates() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter string");
		String str = sc.nextLine();

		char[] array = str.toCharArray();
		int count = 0;
		int length = array.length;
		char temp = '\0';

		for (int i = 0; i < length; i++) {
			if (array[i] != temp) {
				for (int j = 0; j < length; j++) {

					// char temp = 'x';
					if (array[i] == array[j]) {
						// temp = array[j];

						count++;

					}
					temp = array[j];

				}
				if (count > 1) {

					System.out.println("character " + array[i]
							+ " has repeated " + count + " times");

				}
				count = 0;
			}
		}

	}

	public static void main(String[] args) {
		DuplicateLetters rv = new DuplicateLetters();
		rv.findDuplicates();

	}
}

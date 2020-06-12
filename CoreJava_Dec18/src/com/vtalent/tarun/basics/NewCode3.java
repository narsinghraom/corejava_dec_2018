package com.vtalent.tarun.basics;

import java.util.*;

public class NewCode3 {

	public static void main(String[] args) {
		System.out.println("Hello World");
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = s.nextInt();
		int t = 0;
		for (int i = 1; i <= n; i++) {
			for (int j = 2; j < i - 1; j++) {
				if (i % j == 0) {
					t += 1;
				}
			}
			if (t == 0) {
				System.out.print(i +" ");
			}
			else {
				t = 0;
			}

		}
		s.close();
	}
}

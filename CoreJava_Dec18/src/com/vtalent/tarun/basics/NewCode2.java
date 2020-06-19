package com.vtalent.tarun.basics;

import java.util.*;

public class NewCode2 {
	public static void main(String args[]) {
		String str = new String("Welcome to ATKExports&Imports.com");
		System.out.print("Welcome to ");
		System.out.println(str.substring(11) + "\n");

		int[] a = { 2, 4, 12, 5, 8, 1, 9, 16, 25, 45, 86, 92, 9, 52, 45, 24, 24, 62, 54, 98, 92, 92 };
		Arrays.sort(a);
		int n = a.length;
		int j = 0;
		for (int i = 0; i < n - 1; i++) {
			if (a[i] != a[i + 1]) {
				a[j++] = a[i];
			}
		}
		a[j++] = a[n - 1];
		n = j;
		for (int k = 0; k < n; k++) {
			System.out.print(a[k] + " ");
		}
		System.out.println();
		System.out.println("Second max number in array is: "+a[n - 2]);
	}
}
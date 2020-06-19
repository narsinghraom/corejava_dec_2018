package com.vtalent.tarun.basics;

import java.util.*;


public class DeleteElementFromArray {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] a = { 5, 20, 30, 60, 85, 43, 26 };
		System.out.println(Arrays.toString(a));
		System.out.println("Enter the element value to like to delete from above Array: ");
		int n = s.nextInt();
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (n == a[i]) {
				for (int j = i; j < a.length - 1; ++j) {
					a[j] = a[j + 1];
				}
				count += 1;
				break;
			}
		}
		if (count != 1) {
			System.out.println("No Such value found!!");
		} else {
			System.err.println("***Voila!! Element deleted from Array Succesfully***");
			for (int i = 0; i < a.length - 1; ++i) {
				System.out.print(a[i] + " ");
			}
		}
	}
}

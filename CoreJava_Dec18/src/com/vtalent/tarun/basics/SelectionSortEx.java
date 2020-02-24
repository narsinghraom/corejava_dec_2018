package com.vtalent.tarun.basics;

import java.util.Scanner;

public class SelectionSortEx {
	public static void main(String args[]) {
		int i, j, temp;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter array Size : ");
		int size = s.nextInt();
		int a[] = new int[size];
		System.out.print("Enter array Elements : ");
		for (i = 0; i < size; i++) {
			a[i] = s.nextInt();
		}
		System.out.print("Sorting array using Selection Sort Technique..\n");
		for (i = 0; i < size; i++) {
			for (j = i + 1; j < size; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}

		System.out.print("Now the array after Sorting is :\n");
		for (i = 0; i < size; i++) {
			System.out.print(a[i] + "  ");
		}
	}
}
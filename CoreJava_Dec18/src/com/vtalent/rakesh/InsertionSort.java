package com.vtalent.rakesh;

public class InsertionSort {

	public static void insertionSort() {
		int[] array = { 9, 14, 3, 2, 43, 11, 58, 22 };
		System.out.println("Before Insertion Sort");
		for (int i : array) {
			System.out.print(i + " ");
		}
		System.out.println();
		int n = array.length;
		for (int j = 1; j < n; j++) {
			int key = array[j];
			int i = j - 1;
			while ((i > -1) && (array[i] > key)) {
				array[i + 1] = array[i];
				i--;
			}
			array[i + 1] = key;
		}
		System.out.println("After Insertion Sort");
		for (int i : array) {
			System.out.print(i + " ");
		}
	}
}

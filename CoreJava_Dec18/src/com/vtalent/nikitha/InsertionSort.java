package com.vtalent.nikitha;

public class InsertionSort {

	public static void main(String[] args) {
		int[] arr = { 21, 86, 76, 95, 45, 34 };
		for (int i = 1; i < arr.length; i++) {
			int key = arr[i];
			int j = i - 1;
			while ((j > -1) && (arr[j] > key)) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = key;
		}
		for (int k = 0; k <= arr.length - 1; k++) {
			System.out.println(arr[k]);

		}
	}

}

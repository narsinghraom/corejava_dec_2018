package com.vtalent.nikitha;

public class BubbleSort {

	public static void main(String[] args) {
		int[] arr = { 23, 82, 74, 65, 32 };
		int temp;
		for (int i = 1; i <= arr.length - 1; i++) {
			for (int j = 0; j <= arr.length - 2; j++) {
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}

		}
		for (int k = 0; k <= arr.length - 1; k++) {
			System.out.println(arr[k]);
		}

	}

}

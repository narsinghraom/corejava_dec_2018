package com.vtalent.naveena;

public class InsertionArray {

	public static void insertionArray(int array[]) {
		int n = array.length;
		for (int j = 2; j < n; j++) {
			int key = array[j];
			int i = j - 1;
			while ((i >= 0) && (array[i] > key)) {
				array[i + 1] = array[i];
				i--;
			}
			array[i + 1] = key;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Array[] = { 9, 14, 6, 3, 8, 7, 4 };
		System.out.println("Before Array Sorting:  ");
		for (int i = 0; i <= Array.length - 1; i++) {
			System.out.print(Array[i] + " ");
		}

		insertionArray(Array);

		System.out.println("After Array Sorting:  ");
		for (int i = 0; i <= Array.length - 1; i++) {
			System.out.print(Array[i] + " ");
		}

	}

}

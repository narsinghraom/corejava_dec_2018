package sitha.vtalent;

public class Bubblesort {

	public static void main(String[] args) {
		int intAr[] = { 32, 56, 3, 88, 21, 65 };
		System.out.println("Before sorting");
		for (int i = 0; i < intAr.length; i++) {
			System.out.print(" " + intAr[i] + " ");
		}
		bubbleSort(intAr);

		System.out.println("After sorting");
		for (int i = 0; i < intAr.length; i++) {
			System.out.print(" " + intAr[i] + " ");
		}
	}

	public static void bubbleSort(int[] intAr) {
		int temp = 0;
		for (int i = 0; i < intAr.length; i++) {
			for (int j = 1; j < (intAr.length) - i; j++) {
				if (intAr[j - 1] > intAr[j]) {
					temp = intAr[j - 1];
					intAr[j - 1] = intAr[j];
					intAr[j] = temp;
				}
			}
		}
	}

}

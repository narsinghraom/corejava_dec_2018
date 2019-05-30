package com.vtalent.rakesh;

public class ArrayMaxMin {

	public void arrayMaxMin(int[] inputArray) {

		int maxValue = inputArray[0];
		for (int i = 1; i < inputArray.length; i++) {
			if (inputArray[i] > maxValue) {
				maxValue = inputArray[i];
			}

			int minValue = inputArray[0];
			for (int j = 1; j < inputArray.length; j++) {
				if (inputArray[j] < minValue) {
					minValue = inputArray[j];
				}
			}
			System.out.println("MaxValue" + maxValue);
			System.out.println("MinValue" + minValue);
		}

	}
}
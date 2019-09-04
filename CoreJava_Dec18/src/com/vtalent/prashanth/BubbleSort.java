package com.vtalent.prashanth;

public class BubbleSort {

	public static void main(String[] args) {
		int a[] = {36,19,29,12,5};
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				if(a[i]<a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println("Printing sorted list...");
		for(int i=0;i<5;i++) {
			System.out.println(a[i]);
		}

	}

}

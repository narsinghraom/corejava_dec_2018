package com.vtalent.prashanth;

import java.util.Scanner;

public class MinMaxValue {
	public int largest(int[] array) {
		int a = array[0];
		for(int i=0;i<array.length;i++) {
			if(array[i]>a) {
				a = array[i];
			}
		}
		return a;
	}
	public int smallest(int[] array) {
		int b = array[0];
		for(int i=0;i<array.length;i++) {
			if(array[i]<b) {
				b = array[i];
			}
		}
		return b;
	}
	
	public static void main(String[] args) {
		Scanner sa = new Scanner(System.in);
		System.out.println("Enter an Array size: ");
		int x = sa.nextInt();
		int[] array = new int[x];
		System.out.println("Enter " + x +" array values: ");
		for(int i=0;i<array.length;i++) {
			array[i] = sa.nextInt();
		}
		MinMaxValue mm = new MinMaxValue();
		System.out.println("Maximum Value: "+mm.largest(array));
		System.out.println("Minimum Value: "+mm.smallest(array));
	
	}
}
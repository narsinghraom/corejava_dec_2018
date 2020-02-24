package com.vtalent.tarun.basics;

import java.util.*;
 
public class PrintArrayFromUser {

	public static void main(String[] args) {
		int n;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter no. of elements in array: ");
		n = s.nextInt();
		int[] a = new int[n];
		System.out.println("Enter all the elements into array:");
		for (int i = 0; i < n; i++) {
			a[i] = s.nextInt();

		}
		System.out.println("Given array: ");
		for (int i : a) {

			System.out.print(i + " ");
		}
		System.out.println();
		Arrays.sort(a);
		
		  
        System.out.printf("Modified arr[] : %s", 
                          Arrays.toString(a)); 
	}
}
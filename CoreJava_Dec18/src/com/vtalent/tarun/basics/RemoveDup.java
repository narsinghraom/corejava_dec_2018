package com.vtalent.tarun.basics;

import java.util.*;

public class RemoveDup {

	public static void main(String[] args) {
		//For Sorted Array
		int [] a = {8,76,73,5,18,56,3,2,18,5,56,8};
		//Reversing Array
		System.out.println("Reversed Given array is: ");
		for (int i = a.length-1; i>=0;--i) {
			System.out.print(a[i]+" ");
		}
		System.out.println("\n ==========================");
		HashSet<Integer> hs = new HashSet<>();
		for (int i = 0; i<a.length;i++) {
			hs.add(a[i]);
		}
		
		for(int n:hs) {
			System.out.print(n +" ");
		}
		System.out.println();
		System.out.println("========================");
		//What are duplicates in array:
		for(int i = 0; i<a.length; i++) {
			for (int j =i+1; j<a.length;j++) {
				if(a[i] == a[j]) {
					System.out.println(a[j]);
				}
			}
		}
		/*
		 * int [] b = new int[a.length];
		 * int j =0; for (int i = 0; i<a.length-1;++i) {
		 * if (a[i] != a[i+1]) {
		 * b[j] = a[i];
		 *  j++; 
		 *  }
		 *   }
		 *    b[j] = a[a.length-1]; 
		 *    for (int i= 0; i<b.length; i++) 
		 *    { System.out.print(b[i] +" ");
		 *     } System.out.print("\n" +Arrays.toString(b));
		 */
	}
}

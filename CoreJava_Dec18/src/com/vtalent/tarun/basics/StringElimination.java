package com.vtalent.tarun.basics;

import java.util.Scanner;

public class StringElimination {
	static Scanner str = new Scanner(System.in);

	public static void main(String[] args) {
		String str1, str2;
		System.out.println("Enter the 1st String : ");
		str1 = str.nextLine();
		System.out.println("Enter the 2nd String : ");
		str2 = str.nextLine();
		
		 str1 = str1.toLowerCase();
		 str2 = str2.toLowerCase();
		StringBuilder sb1 = new StringBuilder(str1); //it allows only one thread to operate
		StringBuilder sb2 = new StringBuilder(str2);
		
		int m=sb1.length();
		int n= sb2.length();
		for(int i=0; i<m ; i++) {
			for(int j=0; j<n ; j++) {
				 if (sb1.charAt(i) == sb2.charAt(j)) {
				sb1.replace(i, i+1, "");
				sb2.replace(j, j+1, "");
				 }
			}
		}
		System.out.println("sb1" + sb1);
		System.out.println("sb2" + sb2);
		System.out.println(sb1.append(sb2));
	}
}

		

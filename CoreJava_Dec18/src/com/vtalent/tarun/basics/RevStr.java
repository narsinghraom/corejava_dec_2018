package com.vtalent.tarun.basics;

import java.util.Arrays;
import java.util.Collections;

public class RevStr {

	public static void main(String[] args) {
		String str = "TaruN";
		/*
		 * StringBuffer sb = new StringBuffer(str); StringBuffer rev = sb.reverse();
		 * String r = rev.toString();
		 */
		//above three lines of code in one line: 
		 String r = new StringBuffer(str).reverse().toString();
		 		if (r.equalsIgnoreCase(str)) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
		System.out.println("=======================");
		char c[]= str.toCharArray();
		int [] a = {100,14,46,47,94,94,52,86,36,95,89};
		for(int v : a) {
			System.out.print(v +" ");
		}
		System.out.println();
		 Arrays.sort(a);
		 System.out.println(Arrays.toString(a));
		 int secmax = a[a.length-2];
		 System.out.println("Second Max element in Array: " +secmax);

	  

	        // Sorts arr[] in descending order 

	        Arrays.sort(c);
	        System.out.printf("Modified arr[] : \n%s\n\n",Arrays.toString(c));
		
	
	}

}

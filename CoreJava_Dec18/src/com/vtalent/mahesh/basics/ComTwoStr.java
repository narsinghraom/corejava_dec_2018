package com.vtalent.mahesh.basics;

import java.util.Scanner;

public class ComTwoStr {

		public static int stringCompare(String str1, String str2) 
		{ 

			int l1 = str1.length(); 
			int l2 = str2.length(); 
			int lmin = Math.min(l1, l2); 

			for (int i = 0; i < lmin; i++) { 
				int str1_ch = (int)str1.charAt(i); 
				int str2_ch = (int)str2.charAt(i); 

				if (str1_ch != str2_ch) { 
					//System.out.println("Enter string 1");
					return str1_ch - str2_ch; 
				} 
			} 

		
			if (l1 != l2) { 
				return l1 - l2; 
			} 

			else { 
				return 0; 
			} 
		} 

		public static void main(String args[]) 
		{ 
			
			
 
			
			Scanner sc = new Scanner(System.in); 
			System.out.println("Enter string 1");
			        String string1 = sc.nextLine();
			        System.out.println("Enter string 2");
			        String string2 = sc.nextLine();
  

			
		}
	} 

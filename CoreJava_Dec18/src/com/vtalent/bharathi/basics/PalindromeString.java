package com.vtalent.bharathi.basics;

import java.util.Scanner;

public class PalindromeString {
	
	public static void main(String[] args) {
		System.out.println("enter the string");
		Scanner input = new Scanner(System.in);
		String str = input.next();
		 if(ispalindrome(str)) {
			 System.out.println("string is palindrome");
		 }else {System.out.println("not a palindrome");}
		
	}
		
		static boolean ispalindrome(String str) {
			int i =0; int j= str.length()-1;
			
			while(i<j) {
				if(str.charAt(i) != str.charAt(j)) {
					return false;
				}
				i++;
				j--;
				
		
			}
			return true;
		}
}

		

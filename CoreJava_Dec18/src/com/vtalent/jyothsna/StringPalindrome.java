package com.vtalent.jyothsna;

import java.util.Scanner;

public class StringPalindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter string you want check");
		        String str = sc.nextLine();
		
	StringBuffer newStr =new StringBuffer();
	for(int i = str.length()-1; i >= 0 ; i--) {
	newStr = newStr.append(str.charAt(i));
	}
	if(str.equalsIgnoreCase(newStr.toString())) {
	System.out.println("String is palindrome");
	} else {
	System.out.println("String is not palindrome");
	}
	}
	}


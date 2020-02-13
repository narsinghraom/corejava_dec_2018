package com.vtalent.jyothsna;

import java.util.Scanner;

public class StringPalindrome {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter string you want check");
		        String str = sc.nextLine();
		
	String n ="";
	for(int i = 0; i <str.length() ; i++) {
	n = str.charAt(i)+n;
	System.out.println(n);
	}
	if(str.equalsIgnoreCase(n.toString())) {
	System.out.println("String is palindrome");
	} else {
	System.out.println("String is not palindrome");
	}
	}
	}


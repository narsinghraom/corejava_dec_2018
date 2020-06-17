package com.vtalent.corejava.sunild;


import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		String pattern, reverse = ""; // Objects of String class  
	      Scanner number = new Scanner(System.in);   
	      System.out.println("Enter Format to check if it is a palindrome");  
	      pattern = number.nextLine();   
	      int length = pattern.length();   
	      for ( int i = length - 1; i >= 0; i-- )  
	         reverse = reverse + pattern.charAt(i);  
	      if (pattern.equals(reverse))  
	         System.out.println("Format  is a palindrome.");  
	      else  
	         System.out.println("Format isn't a palindrome.");   

	}

}

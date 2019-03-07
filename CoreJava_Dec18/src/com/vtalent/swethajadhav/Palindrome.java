package com.vtalent.swethajadhav;

import java.util.*; 

public class Palindrome {
	
  public static void main(String[] arg)
  {
     String original, reverse = ""; // Objects of String class
     Scanner s = new Scanner(System.in);
    
     System.out.println("Enter a string to check if it is a palindrome");
     original = s.nextLine();
    
     int length = original.length();
    
     for (int i = length - 1; i >= 0; i--)
        reverse = reverse + original.charAt(i);
        
     if (original.equals(reverse))
        System.out.println("The string is a palindrome.");
     else
        System.out.println("The string isn't a palindrome.");
        
  }
}      


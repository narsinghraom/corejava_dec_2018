package com.vtalent.vijaya.basic;

import java.util.Scanner;

class Palindrome
{
   public static void main(String args[])
   {
      String reverse="";
      System.out.println("enter the string");
      Scanner sc=new Scanner(System.in);
      String original=sc.nextLine();
      for(int i=original.length()-1;i>=0;i--) {
    	  reverse=reverse+original.charAt(i);
      }
      if(original.equals(reverse)) {
    	  System.out.println("given string is a palindrome");
      }else {
    	  System.out.println("given string is not palindrome");
      }
   }
}

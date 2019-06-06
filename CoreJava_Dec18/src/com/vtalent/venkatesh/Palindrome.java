package com.vtalent.venkatesh;

import java.util.Scanner;

public class Palindrome {

     static Scanner sc = new Scanner(System.in);

     public static void main(String[] args) {
	  System.out.println("Entet String to check: ");
	  String s = sc.nextLine();
	  char[] c = new char[s.length()];
	  int j = 0;
	  for (int i = s.length() - 1; i >= 0; i--) {

	       c[j] = s.charAt(i);

	       j++;
	  }
	  String s1 = new String(c);
	  System.out.println(s1);
	  // System.out.println(s.length());
	  if (s.equalsIgnoreCase(s1)) {
	       System.out.println("Palindram");
	  } else {
	       System.out.println("Not PAlindram");
	  }

     }

}
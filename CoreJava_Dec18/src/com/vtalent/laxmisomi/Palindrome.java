package com.vtalent.laxmisomi;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		
	 String s1,s2="";
	 Scanner sc=new Scanner(System.in);
	 System.out.println("enter string to check if it is palindrome or not");
	 s1=sc.nextLine();
	 int length=s1.length();
	 for(int i=length-1; i>=0; i--) 
		 s2=s2+s1.charAt(i);
		 if(s1.equals(s2)) {
			 System.out.println("it is palindrome");
			 
			 
		 }
		 else {
			 System.out.println("not a palindrome");
			 
			 
		 }
	 }
	 
		
	 
			 
	 

}

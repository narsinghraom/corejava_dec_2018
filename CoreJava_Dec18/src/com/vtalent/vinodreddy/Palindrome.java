package com.vtalent.vinodreddy;

import java.util.Scanner;

public class Palindrome {
	
	static Scanner s =new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("enter the string value ");
		String value =s.nextLine();
		
		/*StringBuffer sb=new StringBuffer(value);
		sb.reverse();
		System.out.println(sb);*/
		
		
		String r="";
		for(int i=value.length()-1;i>=0;i--) {
			r=r+value.charAt(i);
		}
		
		if(value.equals(r)) {
			System.out.println("string is palindrome.");
		}else {
			System.out.println("string is not palindrome.");
		}
	}
	

}

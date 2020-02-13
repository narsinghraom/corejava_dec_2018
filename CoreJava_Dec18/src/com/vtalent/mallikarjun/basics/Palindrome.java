package com.vtalent.mallikarjun.basics;

import java.util.Scanner;

public class Palindrome {
public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	System.out.println("enter string ");
	String str=scn.next();
	String rev="";
	for(int i=str.length()-1;i>=0;i--) {
		rev=rev+str.charAt(i);
	}
		System.out.println("reverse of the string :"+rev);
		
	if(str.equals(rev)) {
		System.out.println("Given String is Palindrome");
	}else {
		System.out.println("Given String is not Palindrome");
	}
}
}

package com.vtalent.sampath;
import java .util.Scanner;

public class Palindromeee {
	
	public static void main(String[] args) {

		while (true) {
		Scanner Sc=new Scanner(System.in);
		System.out.println("\n enter a string =");
		String s1=Sc.nextLine();
		String reverse="";
		char[] ch= s1.toCharArray();
		//String s2="";
for(int i=s1.length()-1; i>=0; i--) {
	
	reverse=reverse+ch[i];
	//s2=s2+s1.charAt(i);
		}
System.out.println("Reverse of String="+ reverse);
		if(reverse.equals(s1)) {
			System.out.println("string is palindrome");
			}
		else {
			System.out.println("the string is not palindrome");}
		}

	}}
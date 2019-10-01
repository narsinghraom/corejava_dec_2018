package com.vtalent.java.haritha;
import java.util.*;
public class Palindrome {
	public static void main(String args[]) {
		String revnum="";
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string you want to check: ");
		String n=sc.nextLine();
		int l=n.length();
		for(int i=l-1;i>=0;i--)
		revnum=revnum+n.charAt(i);
		if(n.equals(revnum)) {
			System.out.println("enter the string is palindrome:"+revnum);
		}else{
				System.out.println("enter the string not palindrome:"+revnum);
			}
			
		}
		
	}




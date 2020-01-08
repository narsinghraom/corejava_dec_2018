package com.vtalent.jhansi.basics;
import java.util.Scanner;

public class StrPalendrome {
	public static void main(String[] args) {
		String s1,s2;
	    Scanner input=new Scanner(System.in);
		System.out.println("enter string");
		s1=input.next();
		s2="";
		for(int i=s1.length()-1;i>=0;i--)
		{
			s2=s2+s1.charAt(i);
		}
		if(s1.equals(s2)==true)
{
	System.out.println("given string is palindrome");
}
		else
		{
			System.out.println("given string is not palindrome");
		}
	}

}

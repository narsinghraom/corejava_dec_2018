package com.vtalent.praveena;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[]args)
	{
	Scanner input=new Scanner(System.in);
	String S1=new String(input.next());
	System.out.println("Given Sring is "+S1);
	String S2=new String();//String S2="";
	//adding given string into S2 in reverse order
	for(int i=S1.length()-1;i>=0;i--)
	{
	S2=S2+S1.charAt(i);	
	}
	System.out.println("after reversing String is "+S2);
	if(S1.equals(S2))
	{
	 System.out.println("given String "+S1+" is Plaindrome");
	}
	else
	{
		System.out.println("Given String "+S2+" is not a Palindrome");
	}
}
}

package com.vtalent.sneha;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		String str=sc.nextLine();
		String reverseStr="";
		
		for(int i=str.length()-1;i>=0;i--)
		{
			reverseStr=reverseStr+str.charAt(i);
		}
		if(str.equals(reverseStr)){
			System.out.println("palindrome");
		}
			else
			{
				System.out.println("not palindrome");
		}
	}
	}
		
	

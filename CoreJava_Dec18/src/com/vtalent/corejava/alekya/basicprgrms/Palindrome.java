package com.vtalent.corejava.alekya.basicprgrms;

import java.util.Scanner;

public class Palindrome {

     static Scanner sc = new Scanner(System.in);

     public static void main(String[] args) {
	  System.out.println("Enter number to check: ");
	  
	  int n = sc.nextInt(), temp=0,r,sum=0;
		temp=n;
		while(n>0)
		{
			r=n%10;
			sum=sum*10+r;
			n=n/10;
		}
		if(temp==sum)
		{
			System.out.println(temp+ " is a polindrome");
		}
		else
		{
			System.out.println("Given number is not a polindrome");
		}

	}
}

	  
	  
	  
	  
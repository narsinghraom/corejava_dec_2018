package com.vtalent.prashanthgopi;

public class Palindrome {

	 private static void mian(String args[])
	    {
			int num=121,r,sum=0;
			int t=num;
			while(num>0)
			{
				r=num%10;
				num=num/10;
				sum=sum*10+r;
			}
			if(t==sum)
				System.out.println("palindrome");
			else
				System.out.println("not a palindrome");
				
		}
}

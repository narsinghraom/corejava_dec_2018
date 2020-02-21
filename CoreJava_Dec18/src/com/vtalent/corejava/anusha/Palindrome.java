package com.vtalent.corejava.anusha;

public class Palindrome {
	
	public static void main(String[] args) {
		
		int temp;
	
		int n=12321, sum=0, rem;
		temp=n;
		
		while(n>0)
		{
			rem=n%10;
			sum=(sum*10)+rem;
			n=n/10;
		}
		
		if(temp==sum)
		{
			System.out.println(temp+" is a Palindrome Number");
		}
		else
		{
			System.out.println(temp+" is not Palindrome Number");
		}
	}

}

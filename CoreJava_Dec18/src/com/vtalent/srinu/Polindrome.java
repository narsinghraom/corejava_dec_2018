package com.vtalent.srinu;

public class Polindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=151,temp=0,r,sum=0;
		temp=n;
		while(n>0)
		{
			r=n%10;
			sum=sum*10+r;
			n=n/10;
		}
		if(temp==sum)
		{
			System.out.println("giver number is polindrome");
		}
		else
		{
			System.out.println("giver number is not polindrome");
		}

	}

}

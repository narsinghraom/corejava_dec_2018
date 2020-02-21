package com.vtalent.corejava.siva;

public class Palindrom {
	public static void main(String[] args) {
		int n=12321,r,temp,sum=0;
		temp=n;
		while(n>0)
		{
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
		}
		if(temp==sum)
		{
			System.out.println(temp+ " is a palindrom");
		}
		else
		{
			System.out.println(temp+ " is not a palindrom");
		}
	}

}

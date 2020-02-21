package com.vtalent.corejava.siva;

public class fibonacci {
	public static void main(String[] args) {
		int a=0,b=1,n=5,c;
		for(int i=1;i<=n;i++)
		{
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}
		
	}

}

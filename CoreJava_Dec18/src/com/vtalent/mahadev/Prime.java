package com.vtalent.mahadev;
import java.util.Scanner;
 class Prime {
	public static void main(String[] args) {
	int n,i,c=0;
	Scanner s=new Scanner(System.in);
	{
		System.out.println("enter a number");
		n=s.nextInt();
	}
	for(i=2;i<=n-1;i++)
	{
		if(n%i==0){
			c=c+1;
		}
		if(c==0){
			System.out.println(" a prime");
		}
		else{
			System.out.println("not prime number");
		}
	}
	}
 }
 
	
	
	
	

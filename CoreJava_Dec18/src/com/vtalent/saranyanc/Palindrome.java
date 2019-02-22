package com.vtalent.saranyanc;

public class Palindrome {
	int n,rem,rev=0,temp;
	public void function(int n){
		temp=n;
		
		while(n!=0)
		{
			rem=n%10;
			rev=(rev*10)+rem;
			n=n/10;
		}
		
		
		if(rev==temp)
		{System.out.println("palindrome");
		
		}
		else
		{
			
			System.out.println("not");
		}
		}
			
	
	public static void main(String[] arga){
		Palindrome p= new Palindrome();
		p.function(1212);
		
	}

}

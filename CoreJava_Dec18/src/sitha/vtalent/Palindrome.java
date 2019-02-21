package sitha.vtalent;

import java.util.*;

public class Palindrome {
	public static void main(String[] args)
{
	int n,b,r,temp=0;
	Scanner a=new Scanner(System.in);
	System.out.println("Enter a number");
	n=a.nextInt();
	b=n;
	while(n!=0){
		r=n%10;
		temp=(temp*10)+r;
		n=n/10;		
		
	}
	if(b==temp)
	System.out.println("number is  " + b +  " palindrome");
	else
		System.out.println("number is  " + b +   "not a palindrome");
		
		}
}

 
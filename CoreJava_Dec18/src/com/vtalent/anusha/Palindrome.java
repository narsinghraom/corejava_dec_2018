package com.vtalent.anusha;

public class Palindrome {
	public static void main(String[] args) {
	int no=121;
	int temp=no,rem,rev=0;
	{
	//while(temp>0)
		while(temp!=0)
	{
		rem=temp%10;
		rev=rev*10+rem;
		temp=temp/10;
	}
if(no==rev)
{
	System.out.println("the number is palindrome");
}
else
{
	System.out.println("the number is not a palindrome");
	
}
	}
}
}

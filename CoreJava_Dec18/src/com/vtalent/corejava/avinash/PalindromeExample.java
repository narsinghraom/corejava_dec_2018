package com.vtalent.corejava.avinash;

public class PalindromeExample {
	int  temp,result,sum;
	public static void main(String args[]) {
	int n=674;
	PalindromeExample hii=new PalindromeExample();
	hii.temp=n;
	while(n>0)
	{
		hii.result=n%10;
		hii.sum=(hii.sum*10)+hii.result;
		n=n/10;
	                                           
	}
	if(hii.temp==hii.sum)
		System.out.println("palindrome number");
	else
		System.out.println("not palindrome");
}
}

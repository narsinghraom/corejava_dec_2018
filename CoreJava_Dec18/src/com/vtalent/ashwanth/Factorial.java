package com.vtalent.ashwanth;
import java.util.*;
public class Factorial {
public static void main(String[] args) {
	int num,fact=1;
	Scanner s=new Scanner(System.in);
	System.out.println("Enter number :");
	num=s.nextInt();
	if(num<=0)
	{
		System.out.println("num should greater than 1 to find fact");
	}
	else
	{
		for(int i=1;i<=num;i++)
		{
			fact=fact*i; 
		}
		System.out.println("fact "+num+"="+fact);
	}
	
}
}

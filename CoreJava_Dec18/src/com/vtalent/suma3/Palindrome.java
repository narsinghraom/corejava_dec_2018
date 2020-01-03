package com.vtalent.suma3;

import java.util.Scanner;

	public class Palindrome
	{
		public static void main(String[] args) {
			int r,sum=0,temp;
			Scanner scan=new Scanner(System.in);
			System.out.println("Please enter the number : ");
			int num=scan.nextInt();
			scan.close();
			temp=num;
			while(num>0)
			{
				r=num%10;
				sum=sum*10+r;
				num=num/10;
			}
			if(temp==sum)
				System.out.println("Given number is palindrome");
			else
				System.out.println("Given number is not palindrome");
		}

	}



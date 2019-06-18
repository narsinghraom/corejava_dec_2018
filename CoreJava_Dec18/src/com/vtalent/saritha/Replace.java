package com.vtalent.saritha;

import java.util.Scanner;

public class Replace {


		public static void main(String[] args) {
			// TODO Auto-generated method stub
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter first String");
	String s1=sc.nextLine();
	System.out.println("Enter Second String");
	String s2=sc.nextLine();
	for(int j=0;j<s1.length();j++)
	{
		for(int i=0;i<s2.length();i++)
		{
			if(s1.charAt(j)==s2.charAt(i))
			{
				s1=s1.replace(s1.charAt(j),' ');
				s2=s2.replace(s2.charAt(i),' ');
			}

		}
	}
	String s3=s1.concat(s2);
	System.out.println(s3.replace(" ", ""));
		}

	}



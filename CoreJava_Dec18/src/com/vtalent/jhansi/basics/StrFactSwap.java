package com.vtalent.jhansi.basics;
import java.util.Scanner;

public class StrFactSwap {
	static Scanner scan=new Scanner(System.in);
	public static void swap(String str,int l, int r)
	{  
		for(int i=l;i<=r;i++)
		{
			swap(str,l,r);
			permute(str,l+1,r);
			swap(str,l,r);
		}
	}
	public static void main(String[] args) {
		
		System.out.println("please enter string");
		String str1=scan.next();
		 int l=0;
		 int r=str1.length();
		 swap(str1,l,r);
	}

}

package com.vtalent.jhansi.basics;
import java.util.Scanner;

public class Strchar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("please enter the string");
		String str1=scan.next();
		
		for(int i=0;i<str1.length();i++)
		{
			System.out.println(str1.charAt(i));
		}
		
	}

}

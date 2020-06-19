package com.vtalent.teja.basic;

import java.util.Scanner;
public class StrElimination {
	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		String str1,str2;
		System.out.println("please enter string 1");
		str1=scan.next();
		System.out.println("please enter string 2");
		str2=scan.next();
		char[] c1=str1.toCharArray();
		char[] c2=str2.toCharArray();
		System.out.println("c1");
		for(int i=0;i<c1.length;i++) {
			System.out.println("c1[i] " + c1[i]);
		}
		System.out.println("c2");
		for(int i=0;i<c2.length;i++) {
			System.out.println("c2[i] " + c2[i]);
		}
		for(int i=0;i<c1.length;i++) {
			for(int j=0;j<c2.length;j++) {
				if(c1[i]==c2[j])
				{
					c1[i]=' ';
					c2[j]=' ';
				}
				break;
			}
		}
		str1=String.valueOf(c1);
		str2=String.valueOf(c2);
		System.out.println("str1 " + str1);
		System.out.println("str2 " + str2);
		String str3=str1 + str2;
		System.out.println("str3 " + str3);
		str3=str3.replaceAll(" ","");
		System.out.println("the required eliminated string is "+ str3 );
				}
	
	}
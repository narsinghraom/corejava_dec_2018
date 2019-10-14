package com.vtalent.java.haritha;
import java.util.*;

public class Stringex {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string");
		String s=sc.next();
		char c=s.charAt(4);
		System.out.println("character at index:" +c);
		int r=s.codePointAt(1);
		System.out.println("character(unicode point)="+r);
		int r1=s.codePointBefore(4);
		System.out.println("character(unicode point)="+r1);
		int cd=s.codePointCount(1,2);
		System.out.println("codepointcount="+cd);
		System.out.println("enter string1");
		String s1=sc.next();
		System.out.println("enter string2");
		String s2=sc.next();
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.offsetByCodePoints(3,4));
		System.out.println(s1.equals(s2));
		}
	
	

	}



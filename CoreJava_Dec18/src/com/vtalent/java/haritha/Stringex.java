package com.vtalent.java.haritha;
import java.util.*;

public class Stringex {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string");
		String s=sc.next();
		char c=s.charAt(5);
		System.out.println("character at index:" +c);
		int r=s.codePointAt(1);
		System.out.println("character(unicode point)="+r);
		int r1=s.codePointBefore(2);
		System.out.println("character(unicode point)="+r1);
		int cd=s.codePointCount(0,3);
		System.out.println("codepointcount="+cd);
		System.out.println("enter string1");
		String s1=sc.next();
		System.out.println("enter string2");
		String s2=sc.next();
		int r3=s1.compareTo(s2);
		
		  if(r3>0) { 
			  System.out.println("string1 is greater than string2");
			  } else
		  if(r3==0){
			  System.out.println("string1 is equal to string2"); 
			  } else {
		  System.out.println("string1 is lesser than string2"); }
		 
		
		}
	
	

	}



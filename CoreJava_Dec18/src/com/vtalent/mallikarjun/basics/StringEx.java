package com.vtalent.mallikarjun.basics;

import java.util.Scanner;

public class StringEx {
public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	System.out.println("enter 1st string value");
	String str1=scn.nextLine();
	System.out.println("enter 2nd string value");
	String str2=scn.nextLine();
	
//	char[] s1=str1.toCharArray();
//	char[] s2=str2.toCharArray();
	 StringBuilder sb1 = new StringBuilder(str1);
     StringBuilder sb2 = new StringBuilder(str2);
	for(int i=0;i<sb1.length();i++) {
		for(int j=0;j<sb2.length();j++) {
			if(sb1.charAt(i)==sb2.charAt(j))
            {
				sb1.delete(i, i+1); 
                sb2.delete(j,j+1);
                
               }
		}
	}
	System.out.println(sb1+" "+sb2);
	StringBuilder s3=new StringBuilder();
	//s3=sb1+sb2;
	System.out.println(sb1.append(sb2));
}
}

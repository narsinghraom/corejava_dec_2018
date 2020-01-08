package com.vtalent.mallikarjun.basics;

import java.util.Scanner;

public class CountWords {
public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	System.out.println("Enter String");
	String str=scn.nextLine();
	//str=str.toLowerCase();
	char[] ch=str.toCharArray();
	int count=1;
	for(int i=0;i<str.length();i++) {
		for(int j=i+1;j<str.length();j++) {
			if(ch[i]==ch[j]) {
				count=count+1;
				ch[j]=0;
			}
		}
		if(ch[i]!=0 && ch[i]!=' ') {
			System.out.println(ch[i]+"------"+count);
			count=1;
		}
	}
}
}

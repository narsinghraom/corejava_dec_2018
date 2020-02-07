package com.vtalent.mallikarjun.basics;

public class StringNumbers {
public static void main(String[] args) {
	String str1="you are about to AAAAA delete 300 tasks please confirm";
	char[] ch=str1.toCharArray();
	for(int i=0;i<str1.length();i++) {
		//System.out.print(ch[i]);
		if(ch[i]>='a' && ch[i]<='z') {
			System.out.print(ch[i]);
		}
	}
}
}

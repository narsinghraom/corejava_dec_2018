package com.vtalent.mallikarjun.basics;

public class StringLength {
public static void main(String[] args) {
	String s="Helloree";
	int count = 0;
	for(int i=0;i<s.length();i++) {
		s.charAt(i);
		count++;
	}
	System.out.println("length of the String ="+count);
}
}

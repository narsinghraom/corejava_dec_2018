package com.vtalent.jhansi.basics;
//Count the spaces in a given string(String s="This is java Class and here we have got many friends"
public class SpaceCount {
public static void main(String[] args) {
	String s="This is java Class and here we have got many friends";
	int l1,l2,count;
	l1=s.length();
	s=s.replaceAll(" ","");
	l2=s.length();
	count=l1-l2;
	System.out.println("the spaces in a given string is  "+ count);
}
}

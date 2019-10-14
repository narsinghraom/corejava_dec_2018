package com.vtalent.java.venkatesh;

import java.util.Scanner;

public class MoreThanOneCharecter {
	static final int Size = 300;
    public static void main(String[] args) {
    	Scanner s =new Scanner(System.in);
		System.out.println("enter the string ");
		String n = s.next();
		int count[] = new int[Size]; 
		int l = n.length();
	    for (int i = 0; i < l; i++) {
	    	count[n.charAt(i)]++;}
	   	char ch[] = new char[n.length()];
	   	for (int i=0;i<ch.length;i++) {
	   	    ch[i] = n.charAt(i);
	   	    int find = 0;
	   	    for(int j=0;j<ch.length;j++) {
	   	    	if (n.charAt(i) == ch[j]) {
	   	            find++;
	   	    }}
	   	   	if (find == 1) {
	   	   	    System.out.println(n.charAt(i) + " is:" + count[n.charAt(i)] );
				}}
		}
    }
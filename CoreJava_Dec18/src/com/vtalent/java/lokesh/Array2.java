package com.vtalent.java.lokesh;

import java.util.Scanner;

public class Array2 {
static final int size= 300;
public static void main(String[] args) {
	Scanner f = new Scanner(System.in);
	System.out.println("enter the String");
	String name=f.nextLine();
	int count[] = new int[size];
	int len = name.length();
	for(int i=0;i<len;i++) {
	count[name.charAt(i)]++;}
    char ch[] = new char[name.length()];
    for (int i=0;i<ch.length;i++) {
    	ch[i]=name.charAt(i);
    	int find=0;
    	for (int j=0;j<ch.length;j++) {
    		if(name.charAt(i)==ch[j]) {
    			find++;	
    		}
    	}
	if(find==1) {
		System.out.println(name.charAt(i)+" is:"+count[name.charAt(i)]);
		}
    }
}
}
	


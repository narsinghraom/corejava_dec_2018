package com.vtalent.jhansi.basics;
//WAP to separate numbers and characters from a given string(String str="I got 456 out of 600 in 7th Standard in 2008";)
public class NumCharCount {
public static void main(String[] args) {
	String str="I got 456 out of 600 in 7th Standard in 2008";
	str=str.toLowerCase();
	char[] ch=str.toCharArray();
	for(int i=0;i<str.length();i++) {
		if(ch[i]>='a' && ch[i]<='z') {
			System.out.print(ch[i]);
		}
	}
	System.out.println();
	for(int i=0;i<str.length();i++) {
		if(ch[i]>='0' && ch[i]<='9') {
			System.out.print(ch[i]);
		}
	}

}
}

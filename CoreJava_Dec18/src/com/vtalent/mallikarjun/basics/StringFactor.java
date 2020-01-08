package com.vtalent.mallikarjun.basics;

import java.util.Scanner;

public class StringFactor {
	public static void StringFactor(String prefix,String s) {

		if(s.length()==0) {
			System.out.print(prefix+" ");
			return;
		}
		for(int i=0;i<s.length();i++) {
			StringFactor(prefix+s.charAt(i),s.substring(0, i)+s.substring(i+1));
		}
	}
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("please enter the string");
		String str=scn.nextLine();
		StringFactor("",str);
	}
	}




package com.vtalent.swamy;

import java.util.Scanner;

public class DuplicatesInStrings {

	public static void main(String[] args) {
		int count=0; char ch = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter name");
		String s = sc.next();
		char [] c=s.toLowerCase().toCharArray();
		for(int i=0;i<=c.length-1;i++) {
			for(int j=1;j<=c.length;j++) {
				if(c[i]==c[j]) {
				 ch=c[j];
				count++;
				
				}
			}
		}
		System.out.println("Duplicates "+ch+ +count+" times");
	}
}

		
	


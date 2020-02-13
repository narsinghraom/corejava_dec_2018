package com.vtalent.jhansi.basics;
import java.util.Scanner;
public class CharRepeated {
	static Scanner input=new Scanner(System.in);
		public static void main(String[] args) {
		String s1;
		System.out.println("please enter string");
		s1=input.next();
		char[] c;
		c=s1.toCharArray();
		int count=0;
		for(int i=0;i<c.length;++i) {
			count=0;
			for(int j=0;j<c.length;++j) {
				if(j<i && c[i]==c[j]) {
					break;
				}
				if(c[i]==c[j]) {
					count++;
				}
				if(j==c.length-1)
				{
					System.out.println("the character " + c[i] + " occurs " + count + " times ");
				}
			}
		}
		
	}
		
}
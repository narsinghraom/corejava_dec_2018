package com.vtalent.saritha;

import java.util.Scanner;

public class Stringtask0 {
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		  int cnt = 1;
		  char[] ch = s1.toCharArray();
		  System.out.println("Duplicate letters are:");
		  for (int i = 0; i < s1.length(); i++) {
		   for (int j = i + 1; j < s1.length(); j++) {
		    if (ch[i] == ch[j]) {
		     System.out.println(ch[j]);
		     cnt++;
		    }
		    System.out.println(s1.trim());
		   }
		  }
	}
}




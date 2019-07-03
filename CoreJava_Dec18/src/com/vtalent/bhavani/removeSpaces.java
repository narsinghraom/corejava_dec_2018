package com.vtalent.bhavani;

import java.util.Scanner;

public class removeSpaces {
	
		 public static void removeSpaces() {
			 System.out.println("Enter string");
			  Scanner sc = new Scanner(System.in);
			  String str = sc.nextLine();
			  System.out.println(str.replaceAll("\\s", ""));
		     }
		 public static void main(String[] args) {
			 removeSpaces() ;
		}
}

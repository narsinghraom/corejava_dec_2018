package com.vtalent.java.srikarreddy;

import java.util.Scanner;

public class StringParagraph {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a paragraph");
		String srd=s.nextLine();
		System.out.println("Enter a String want to delete");
		String fd=s.nextLine();
		srd=srd.replaceAll(fd, "");
		System.out.println("after deleting string from paragraph: "+srd);
		 
		
	}

}

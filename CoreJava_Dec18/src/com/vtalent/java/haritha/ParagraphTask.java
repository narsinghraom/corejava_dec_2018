package com.vtalent.java.haritha;
import java.util.Scanner;
class ParagraphTask {

	public static void main(String[] args) {
		
		System.out.println("please enter paragraph:");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		System.out.println("enter the word to be deleted from the string:");
		String w=sc.nextLine();
		s=s.replaceAll(w,"");
		System.out.println("paragraph after trimming:\n"+s);

	}

}

package com.vtalent.mamathasri1;
import java.util.Scanner;
public class Paragraph {
	public static void main(String args[]) {
		String s,word;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a string");
		s=scan.nextLine();
		System.out.println("Enter a word to be delete from the String:");
		word=scan.nextLine();
		s=s.replaceAll(word, "");
		System.out.println("Paragraph afetr trimming is:\n"+s);
		
	}

}

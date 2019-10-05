package com.vtalent.java.mahesh;

import java.util.Scanner;

public class ParagraphTask {
	 public static void main(String args[]) 
	    {  
		       String s, word;
		       Scanner scan = new Scanner(System.in);
		       System.out.print("Enter a String : ");
		       s = scan.nextLine();
		       System.out.print("Enter a Word to be Delete from the String : ");
		       word = scan.nextLine();
		       s = s.replaceAll(word, "");
		       System.out.print("Paragragh after trimming is:\n"+s);       
	    }
}

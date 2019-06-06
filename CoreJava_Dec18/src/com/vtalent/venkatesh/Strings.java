package com.vtalent.venkatesh;

import java.util.Scanner;

class A {
     public void remove() {
	  Scanner sc = new Scanner(System.in);
	  String str = sc.nextLine();
	  System.out.println(str.replaceAll("\\s", ""));
     }

     public void repeatedLetters(){
	  String S = "Vtalentt info System";
		S = S.toLowerCase();
		String[] S1 = S.split(" ");
		for (int i = 0; i < S1.length; i++) {
			String S2 = S1[i];
			// System.out.println(S2);
			char[] C = S2.toCharArray();
			for (int j = 0; j < C.length; j++) {
				int Count = 0;
				for (int k = 0; k < C.length; k++) {
					if (C[j] == C[k]) {
						Count++;
					}
				}
				if (Count == 1) {
					System.out.print(C[j]);
				}
			}
			System.out.println("");
		}
	}
     
     
     public void repeatedWords() {

	
	  String str = "Vtalent info systems info";
	  System.out.println("Vtalent info systems info");
	  str.toLowerCase();
	  String words[] = str.split(" ");
	  int count = 0;
	  for (int i = 0; i <= words.length - 1; i++) {

	       for (int j = i + 1; j <= words.length - 1; j++) {
		    if (words[i].equals(words[j])) {
			
			 System.out.println(words[i]);
		    }
	       }

	      
	  }
     }
     
     public void concat(){
	 
		System.out.println("Enter Two Strings:");
		Scanner sc = new Scanner(System.in);
		String S1 = sc.nextLine();
		String S2 = sc.nextLine();
		String S3 = S1 + S2;
		S3 = S3.toUpperCase();
		System.out.println(S3);
		char[] C = S3.toCharArray();
		for (int i = 0; i < C.length; i++) {
			// System.out.print(C[i]);
			int Count = 0;
			for (int j = 0; j < C.length; j++) {
				if (C[i] == C[j]) {
					Count++;
				}
			}
			if (Count == 1) {
				System.out.print(C[i]);
			}

		}
	}
     
  }

public class Strings extends A {
     public static void main(String[] args) {

	  System.out.println("vtalent info system");
	  System.out.println("enter 1 to remove spaces" + "\n"
		    + "enter 2 to remove repeated letters" + "\n"
		    + "enter 3 to check repeated words");

	  Scanner sc = new Scanner(System.in);

	  int i = sc.nextInt();

	  A obj = new A();
	  switch (i)
	       {
		    case 1:
			 obj.remove();
			 break;
		    case 2:
			 obj.repeatedLetters();
			 break;
		    case 3:
			 obj.repeatedWords();
			 break;
		    case 4:
			 obj.concat();
	       }

	  // System.out.println(str.length());
	  // System.out.println(str.charAt(2));
	  // System.out.println(str.codePointAt(3));
	  // System.out.println(str.replaceAll(s, str));

     }

}

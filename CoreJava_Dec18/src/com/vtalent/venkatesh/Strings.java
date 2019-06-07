package com.vtalent.venkatesh;

import java.util.Scanner;

class A {
     public void remove() {
	  System.out.println("Enter string");
	  Scanner sc = new Scanner(System.in);
	  String str = sc.nextLine();
	  System.out.println(str.replaceAll("\\s", ""));
     }

     public void repeatedLetters(){
	  System.out.println("Enter any string ");
		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();
		S = S.toLowerCase();
		char[] C = S.toCharArray();
		for (int i = 0; i < C.length; i++) {
			int Count = 0;
			int count1 = 0;
			for (int j = 0; j <= i; j++) {
				if (C[i] == C[j]) {
					count1++;
				}
			}
			if (count1 == 1 && C[i] != ' ') {
				for (int k = 0; k < C.length; k++) {
					if (C[i] == C[k]) {
						Count++;
					}
				}
				if (Count > 1) {
					System.out.println(C[i] + " " + Count + "Times");
				}

			}
		}
	}
	
     
     
     public void repeatedWords() {

	
	  String S = "Vtalent info System info info System";
		String[] S1 = S.split("\\s");
		for (int i = 0; i < S1.length; i++) {
			int Count = 0;
			int Count1 = 0;
			for (int j = 0; j <= i; j++) {
				if (S1[i].equalsIgnoreCase(S1[j])) {
					Count1++;
				}
			}
			if (Count1 == 1) {
				for (int k = 0; k < S1.length; k++) {

					if (S1[i].equalsIgnoreCase(S1[k])) {
						Count++;
					}
				}
				if (Count != 1) {
					System.out.println(S1[i] + " " + Count);

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
		    + "enter 3 to check repeated words"+"\n" + "Enter 4 To Concat Strings");

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

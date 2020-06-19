package com.vtalent.tarun.basics;
import java.util.Scanner;

public class CommonElement {
	static Scanner sr = new Scanner(System.in);
	public  void removeCommonCharacter(String str1, String str2) {
		System.out.println("Given String 1:" + str1);
		System.out.println("Given String 2:" + str2);
		String commonChars = null;
		String str3 = null;
		
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();		
		for (int i = 0; i < str1.length(); i++) {
			for (int j = 0; j < str2.length(); j++) {
				if (str1.charAt(i) == str2.charAt(j)) {
					commonChars += str1.charAt(i);
				//do-while(); 
				}
			}
		}
		for (int i = 0; i < commonChars.length(); i++) {
			String charToRemove = commonChars.charAt(i) + "";
			str1 = str1.replace(charToRemove, "");
			str2 = str2.replace(charToRemove, "");
			str3= str1+str2;
			str3 = str3.trim();
			str3 = str3.toUpperCase();
		}
		System.out.println("After removing common characters: " + str3);
		//System.out.println("After removing common character " + str2);
	}

	public static void main(String[] args) {
		String str1, str2;
		System.out.println("Enter 1st one:");
		str1 = sr.nextLine();
		System.out.println("Enter 2nd one:");
		str2 = sr.nextLine();
		CommonElement t = new CommonElement();
		t.removeCommonCharacter(str1, str2);
	}
}
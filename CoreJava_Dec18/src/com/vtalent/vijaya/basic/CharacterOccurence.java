package com.vtalent.vijaya.basic;

import java.util.Scanner;

class CharacterOccurence
{
	private static int CharacterOccurence(String str, char ch) {
		int counter = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ch) {
				counter++;
			}
		}

		return counter;
	}

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String str = "ABAACBDD";
		//System.out.println("enter the character to count");
	    //String str=sc.nextLine();
		char ch = 'C';

		System.out.println("Character " + ch + " occurs " + CharacterOccurence(str, ch) + " times.");
	}
}
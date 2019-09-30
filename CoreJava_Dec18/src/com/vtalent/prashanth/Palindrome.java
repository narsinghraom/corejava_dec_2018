package com.vtalent.prashanth;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		for(;;) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a string: ");
			String str = sc.nextLine();
			String rev = "";
			for(int i=str.length()-1; i >= 0 ;i--) {
				rev = rev + str.charAt(i);
			}
			if(str.equals(rev)) {
				System.out.println("Entered String is Palindrome. " +rev);
			}else {
				System.out.println("Entered String is not Palindrome. " +rev);
			}
		}
	}

}

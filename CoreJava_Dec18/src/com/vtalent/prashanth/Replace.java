package com.vtalent.prashanth;

import java.util.Scanner;

public class Replace {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Paragraph: ");
		String st = sc.nextLine();
		System.out.println("Enter a String from Pragraph: ");
		String st1 = sc.nextLine();
		System.out.println("In place of "+st1 +" Replacing String: ");
		String st2 = sc.nextLine();
		
		String s = st.replaceAll(st1, st2);
		System.out.println("Final Paragraph is: "+s);

	}

}

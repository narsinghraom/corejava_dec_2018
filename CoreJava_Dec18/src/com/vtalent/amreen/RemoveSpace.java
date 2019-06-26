package com.vtalent.amreen;

import java.util.Scanner;

public class RemoveSpace {

	public static void main(String[] args) {
		System.out.println("Enter Statement to remove extra space");
		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();

		S = S.replaceAll("\\s", "");
		System.out.println(S);

	}

}

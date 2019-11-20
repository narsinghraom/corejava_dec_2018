package com.vtalent.prashanth;

import java.util.Scanner;

public class MultipleLetters {
	static final int size = 300;

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String st = s.nextLine();
		int count[] = new int[size];
		for(int i=0;i<st.length();i++) {
			count[st.charAt(i)]++;
		}
		char ch[] = new char[st.length()];
		for(int j=0;j<ch.length;j++) {
			ch[j] = st.charAt(j);
			int find = 0;
			for(int k=0;k<ch.length;k++) {
				if(st.charAt(j) == ch[k]) {
					find++;
				}
			}
			if(find == 1) {
				System.out.println(st.charAt(j) + "is: " + count[st.charAt(j)]);
			}
		}
	}
		
}

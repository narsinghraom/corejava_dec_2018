package com.vtalent.jhansi.basics;

import java.util.Arrays;

//Count the words in a given sentence(String s="This is Automation project Class";)
public class WordCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "This is Automation project Class";
		s = s.toLowerCase();
		String[] str = s.split(" ");
		int count = 0;
		System.out.println(Arrays.toString(str));
		for (int i = 0; i < str.length; i++) {
			count++;
		}
		System.out.println(count);
	}
}

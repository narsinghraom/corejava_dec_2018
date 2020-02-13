package com.vtalent.tarun.basics;

//Print the string char by Char (String str1="page 14 of 99";)

import java.util.regex.*;

public class Question2 {

	public static void main(String[] args) {
		String s = "page 14 of 99";

		Pattern p = Pattern.compile("\\d+");
		Matcher m = p.matcher(s);
		int temp = 0;
		while (m.find()) {
			String str = m.group();
			temp = temp + Integer.parseInt(str);
		}

		System.out.println("char: " + temp);
	}
}
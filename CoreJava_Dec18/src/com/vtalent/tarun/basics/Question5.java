package com.vtalent.tarun.basics;

public class Question5 {

	public static void main(String[] args) {

		String s = "Hello";
		String s1 = "World";

		s = s + s1;
		s1 = s.substring(0, s.length() - s1.length());
		s = s.substring(s1.length());
		System.out.println(s + "   " + s1);
	}
}

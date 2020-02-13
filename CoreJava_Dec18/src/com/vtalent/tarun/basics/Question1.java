package com.vtalent.tarun.basics;

public class Question1 {

	public static void main(String[] args) {
		
		 String source = "U iz pro"; 
		  String[] sourceAry = source.split(" "); // Split by space 
		  for (String value : sourceAry) { 
		  if (value.length() == 1) {
		  System.out.println(value); // This prints single words
		  }}
		String str = "U iz pro";
		char[] ch = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			System.out.print(ch[i]);} 
		
		String s = "U iz pro";
		char chr;
		for (int i=0;i<s.length();++i) {
			chr= s.charAt(i);
			System.out.print (chr);
		}
	} 
}
package com.vtalent.tarun.basics;

//import java.util.regex.Matcher;
//import java.util.regex.Pattern;

//WAP to separate numbers and characters from a given string(String str="I got 456 out of 600 in 7th Standard in 2008";)
public class Question10 {

	/*
	 * public static void main(String[] args) { 
	 * String str="I got 456 out of 600 in 7th Standard in 2008"; 
	 * Pattern p = Pattern.compile("[\\d]+"); 
	 * Matcher m =p.matcher("I got 456 out of 600 in 7th Standard in 2008"); while(m.find()) {
	 * System.out.println(m.group()); }
	 */
	/*static void splitString(String str) {
		StringBuffer alpha = new StringBuffer(), num = new StringBuffer();

		for (int i = 0; i < str.length(); i++) {
			if (Character.isDigit(str.charAt(i)))
				num.append(str.charAt(i));
			else if (Character.isAlphabetic(str.charAt(i)))
				alpha.append(str.charAt(i));

		}

		System.out.println("Seperated Numbers: " +num);
		System.out.println("Seperated Characters: " +alpha);

	}*/

	public static void main(String args[]) {
		String str = "I got 456 out of 600 in 7th Standard in 2008";
		//splitString(str);
		
		String st1=str.replaceAll("[^A-Za-z]", "");
		String st2=str.replaceAll("[^0-9]", "");
		System.out.println("Alpha = "+st1);
		System.out.println("Int = "+st2);
		
	}
}
package com.vtalent.bhavani;

public class StringReplace {
	
	public static void main(String[] args) {
		

	String s1=new String("       welcome to vtalent      ");
	String s2=new String("Welcome to vtalent");
	System.out.println(s1.charAt(2));
	System.out.println(s1.concat("bhanu"));
	System.out.println(s1.equals(s2));
	System.out.println(s1.equalsIgnoreCase(s2));
	System.out.println(s1.isEmpty());
	System.out.println(s1.length());
	System.out.println(s1.replace(s1, s2));
	System.out.println(s1.substring(6));
	System.out.println(s1.trim());
	System.out.println(s1.indexOf('c'));
	}
	}

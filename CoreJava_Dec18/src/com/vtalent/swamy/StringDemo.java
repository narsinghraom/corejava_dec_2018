package com.vtalent.swamy;

public class StringDemo {

	public static void main(String[] args) {
		String s="swamy";
	System.out.println(s.charAt(3));
		s=s.concat("Ravuri");
		System.out.println(s);
		System.out.println(s.equals("SWAMYRAVURI"));
		System.out.println(s.equalsIgnoreCase("SWAMYRAVURI"));
		System.out.println(s.substring(5));
		System.out.println(s.substring(3, 11));
		System.out.println(s.length());
		System.out.println(s.indexOf('s'));
		System.out.println(s.lastIndexOf('i'));
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
	}

}

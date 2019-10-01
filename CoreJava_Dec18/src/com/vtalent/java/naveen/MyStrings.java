package com.vtalent.java.naveen;

public class MyStrings {

	/*
	 * equals method in string class compare value of the object. we have ==
	 * condition to check the object referances bcz of to different memory
	 * locations. in the string class is extending object class by default
	 */

	public static void main(String[] args) {
String sn="      ";
System.out.println("hascode "+sn.hashCode());
		String s = "  Venkata Satya Naveen ";
		String s3="Naveen";
		String s1 = new String("Naveen");
		System.err.println("char at" + "  " + s.charAt(2));
		System.out.println("compare to" + "  " + s.compareTo(s1));
		System.err.println("hascode" + s.hashCode());
		System.out.println();
		char[] na = { 'h', 'e', 'l', 'l' };
		String sa = new String(na);
		System.out.println(sa);
		System.out.println();
		System.out.println(" index of" + " " + s.indexOf("a"));
		System.out.println("length" + " " + s.length());
		System.err.println("trim" + "" + s.trim());
		System.out.println("uppercase" + "  " + s.toUpperCase());
		System.err.println("lowercase" + "  " + s.toLowerCase());
		System.out.println("empty" + "  " + s1.isEmpty());
System.err.println("contains"+"  "+s.contains(s3));
System.out.println("end with"+" "+s1.endsWith("en"));
	}

}

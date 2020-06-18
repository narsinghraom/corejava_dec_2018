package com.vtalent.corejava.alekya1;

public class ContentEquals {
	public static void main(String args[]){  
		String s = new String ("How are you");
		String s1 =new String("How are you");
		String s2= "How are you";
		String s3= "How are you";
		System.out.println(s.contentEquals("How are"));
		System.out.println(s1.contentEquals("are you"));
		System.out.println(s2.contentEquals("How are you"));
		System.out.println(s3.contentEquals("are you How"));
		System.out.println(s.contentEquals("FOO"));
		System.out.println(s1.equals(s));
		System.out.println(s==s1);
		System.out.println(s2==s3);
		System.out.println(s2.equals(s3));
		System.out.println(s1.equals(s3));
		System.out.println(s==s3);
	
		
}
	}

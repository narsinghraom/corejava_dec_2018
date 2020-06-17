package com.vtalent.corejava.alekya1;

public class Examp {
	public static void main(String args[]){  
		String s1 =("Java Programming");
		String s2 =("Java Programming language");
		String s =new String("Java");  
		
		System.out.println(s1.regionMatches(0,s,0,4));  
		System.out.println(s1.regionMatches(0,s2,0,4)); 
		System.out.println(s.regionMatches(0,s2,0,4));  
	}

}

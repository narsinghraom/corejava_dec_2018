package com.vtalent.corejava.alekya1;

public class Replac {
	public static void main(String args[]){  
		String s1 ="My name is Alekya your name is ALEKYA aaa BBB";
		
		
		String replaceString=s1.replaceAll("is","was");
		String repal=s1.replaceFirst("a","x");
		System.out.println(replaceString);
		System.out.println(repal);
		
		
	}

}

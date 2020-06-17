package com.vtalent.corejava.alekya1;

public class TestString {
	  
		public static void main(String args[]){  
		String s1="ALEKYA";  
		String s2="alekya for alekya";  
		String s3="ALEKYA for ALEKYA";  
		String s4=new String("ALEKYA FOR ALEKYA");
		String s5="AYKELA"; 
		System.out.println(s1.equalsIgnoreCase(s5)); 
		System.out.println(s2.equalsIgnoreCase(s3));
		System.out.println(s3.equalsIgnoreCase(s4));
		System.out.println(s2.equalsIgnoreCase(s4)); 
		System.out.println(s1.equalsIgnoreCase(s2));
		
		} 

}

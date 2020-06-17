package com.vtalent.corejava.alekya1;

public class InternExamp {
	public static void main(String args[]){  
		String s1 =("Myself Alekya");
		String s2 =s1.intern();
		String s3 =new String("Myself Alekya");
		String s4=s3.intern();
		
		System.out.println(s1==s2);  
		System.out.println(s1==s3); 
		System.out.println(s2==s4);
		System.out.println(s3==s4);  
		System.out.println(s1==s4);  
}
}

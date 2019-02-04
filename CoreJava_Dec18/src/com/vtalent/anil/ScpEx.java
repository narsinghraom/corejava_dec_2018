package com.vtalent.anil;

public class ScpEx {

	public static void main(String[] args) 
	{
		String s="ashwini";
		String s1="reddy";
		String s3=s+s1;
		String s4="ashwinireddy";
		System.out.println(s3==s4);
		
		
		final String s5="java";
		final String s6="class";
		String s7=s5+s6; 
		String s8="javaclass";
		System.out.println(s7==s8);
		
		
		String s9="java";
		String s10=s9+"class";
		String s11="javaclass";
		System.out.println(s10==s11);
		
		
		final String s12="ashwini";
		String s13=s12+"reddy";
		String s14="ashwinireddy";
		System.out.println(s13==s14);
		

	}

}

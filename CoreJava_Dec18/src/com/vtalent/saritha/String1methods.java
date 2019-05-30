package com.vtalent.saritha;

public class String1methods {  
		public static void main(String args[]){  
		String s1="java";
		String s2="saritha";
		String s3="RUDHVI";
		String s4="";//creating string by java string literal  
		char ch[]={'s','t','r','i','n','g','s'};  
		String s5=new String(ch);//converting char array to string  
		String s6=new String("example");//creating java string by new keyword  
		System.out.println("s1 string length is:"+s1.length());
		System.out.println("s2 string length is:"+s2.length());
		System.out.println(ch);
		System.out.println("one of the substring of s1:"+s1.substring(0,3));
		System.out.println("one of the substring of s2:"+s1.substring(1));
		System.out.println(s1.contains("ava"));
		System.out.println(s2.contains("sari"));
		System.out.println("is s1=s3:by considering case"+s1.equals(s3));  
		System.out.println("is s1=s3 by ignoring case :"+s1.equalsIgnoreCase(s3));
		System.out.println("is string s4 empty"+s4.isEmpty());
		String s7=s2.concat(s1);
		System.out.println("full name:"+s7);
		String replaceString=s5.replace('r','1');
		System.out.println("replacing a with 0:"+replaceString);
		String upper=s5.toUpperCase();
		System.out.println(upper);
		System.out.println(s3);
		}
}

	



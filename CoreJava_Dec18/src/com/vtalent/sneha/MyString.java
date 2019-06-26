package com.vtalent.sneha;

public class MyString {
public static void main(String args[]){
		String s1="sneha";
		String s2="singam";
		String s3="SNEHA";
		String s4="";
		char ch=s1.charAt(4);
		System.out.println("s1 string length is: "+s1.length());
		System.out.println("s2 string length is: "+s2.length()); 
		System.out.println(ch); 
		System.out.println("one of the substring of s1:"+s1.substring(0,3));  
		System.out.println("one of the substring of s2:" +s1.substring(1));  
		System.out.println(s1.contains("neha"));  
		System.out.println(s2.contains("sing")); 
		/* String dob =String.join("/","6","Feb","1995");    
	        System.out.print(dob);  */
		System.out.println("Is s1=s3: by considering case"+s1.equals(s3));
		System.out.println("Is s1=s3 by ignoring case:"+s1.equalsIgnoreCase(s3));
		System.out.println("Is string s4 empty:"+s4.isEmpty());
		 String s5=s2.concat(s1);
		 System.out.println("full name:" +s5);
		 String replaceString=s5.replace('a','0');
		 System.out.println("replacing a with 0:"+replaceString); 
		 String upper=s5.toUpperCase();  
		 System.out.println(upper);  
		 
		
		 
	
		
		
		
		}
}

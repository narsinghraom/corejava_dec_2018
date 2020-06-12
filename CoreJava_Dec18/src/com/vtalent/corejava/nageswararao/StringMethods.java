package com.vtalent.corejava.nageswararao;

public class StringMethods {
	public static void main(String args[]){ 
		String s1="hello";
		String s2="hello"; 
		String s3="how are you"; 
		String s4="INDIAN FLAG";
		String s5=new String("");
		String s6=new String("what is covid");
		System.out.println("string length is: "+s1.length());  
		System.out.println("string length is: "+s2.length()); 
		
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareTo(s3)); 
		System.out.println(s1.compareTo(s4));
		
		System.out.println(s1.isEmpty());
		System.out.println(s2.isEmpty());
		
		System.out.println(s1.trim()+"how are you");
		
		System.out.println(s4.toLowerCase());
		
		System.out.println(s1.toUpperCase());
		
		System.out.println(s3.replace('w','l'));
		
		System.out.println(s4.contains("FLAG"));
		System.out.println(s4.contains("hello"));
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s4));
		System.out.println(s2.equalsIgnoreCase(s3));
		System.out.println(s2.equalsIgnoreCase(s1));
		
		System.out.println(s1.charAt(3));
		
		System.out.println(s2.toString());
		
		char[] ch=s6.toCharArray();
		
		for(int i=0;i<ch.length;i++)
		{
		System.out.print(ch[i]);
		}
		
		byte[] b=s1.getBytes(); 
		for(int i=0;i<b.length;i++){ 
		System.out.println(b[i]);
		}
		
		System.out.println(s1.isEmpty());
		System.out.println(s5.isEmpty());
		
		System.out.println(s3.endsWith("you"));
		System.out.println(s1.endsWith("o"));
		System.out.println(s2.endsWith("h"));
		
		System.out.println(s1.concat(s6));
		
		System.out.println(s1.contains("he"));
		System.out.println(s1.contains("hi"));
		
		System.out.println(s1.contentEquals("hello"));
		System.out.println(s1.contentEquals("hi"));
		
		System.out.println(s5.copyValueOf(ch, 5, 8));
		
		System.out.println(s1.hashCode());
		
		System.out.println(s1.indexOf("o"));
		
		System.out.println(s1.join(s3, args));
		
		
			}
}

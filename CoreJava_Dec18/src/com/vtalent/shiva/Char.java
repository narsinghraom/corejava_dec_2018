package com.vtalent.shiva;
public class Char {
	
		
	
	public void charAt() {
		String s="shiva";
		char a1=s.charAt(0);
		char a2=s.charAt(1);
		char a3=s.charAt(2);
		char a4=s.charAt(3);
		char a5=s.charAt(4);
		 			
		System.out.println("charactor at 0 index is:"+a1);
		System.out.println("charactor at 1 index is:"+a2);
		System.out.println("charactor at 2 index is:"+a3);
		System.out.println("charactor at 3 index is:"+a4);
		System.out.println("charactor at 4 index is:"+a5);	 
	}
	

	public void codePoint() {
		String s="shiva";
		System.out.println("Given String:" + s);
		int obj1 = s.codePointAt(0);
		int obj2 = s.codePointAt(4);
		System.out.println("charactor is =" + obj1);
		System.out.println("charactor is =" + obj2);
		
	}
	public void codePointBefore() {
		String s="prashanth";
		System.out.println("Given String:" + s);
		int obj1 = s.codePointAt(1);
		int obj2 = s.codePointAt(4);
		System.out.println("charactor is =" + obj1);
		System.out.println("charactor is =" + obj2);
	}
	public void codePointCount() {
		String s = "String is of type class";
		System.out.println("String =" + s);
		int retval = s.codePointCount(0,8);
		System.out.println("codepoint count =" + retval);
	}
	public void 	compareToIgnoreCase() {
		String st = "Lokesh is my friend";
		String st1 = "LOKESH IS MY friend";
		System.out.println("String =" + st);
		int value = st.compareToIgnoreCase(st1);
		System.out.println("st compareToIgnoreCase st1 =" + value);
	}
	public static void main(String[] args) {
		Char c=new Char();
		c.charAt();
		c.codePoint();
		c.codePointBefore();
		c.codePointCount();
		c.compareToIgnoreCase();
	}
	
		
	}
	

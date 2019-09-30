package com.vtalent.shiva;

public class CodePointCount {
	public void codepoint() {
		
	
String st=("String is of type class");
System.out.println("String =" + st);
int retval = st.codePointCount(1, 6);
System.out.println("codepoint count =" + retval);
}
}
class Point extends CodePointCount{
	public void compareto() {
		String st = "hi prashanth";
		String st1 = "hlo vtalent";
		String st2 = " hlo bro";
		int obj = st.compareTo(st1) ;
		System.out.println("st & st1 compare:" + obj);
		int obj2 =st1.compareTo(st2);
		System.out.println("st1 & st2 compare:" + obj2);
	}
	public static void main(String[] args) {
		Point p=new Point();
		p.codepoint();
		p.compareto();
	}
}
package com.vtalent.corejava.suma.a;

public class TestString {
public static void main(String[] args){
	/*String s1="Suma";
	char ch[]={'s','t','r','i','n','g'};
	String s6=new String(ch);//converting char array to string
	String s2="suma";
	String s3=new  String("Suma");
	s3=new String("Alekya");
	String s4="Alekya";
	String s5=new String("Alekya");
	System.out.println(s1.equalsIgnoreCase(s2));//true
	System.out.println(s1.equals(s2));//false
	System.out.println(s1.equals(s3));//false
	System.out.println(s1.equals(s4));//false
	System.out.println(s6);//string
	s1.concat("Gurram");
	System.out.println(s1);//prints only suma bcoz in the memory suma is not changedi.e.,not changable but a new object with sumagurram is created
String s=s1.concat("Gurram");


System.out.println(s);//SumaGurram bcoz we are adding sumagurram and string in s but still suma object will not change i.e., remains as suma\
*/
	String s="";
	String s1="hi. How are you doing";
	System.out.println(s.isEmpty());//true bcoz nothing is present, if we leave a space there then it returns false
	System.out.println(s1.isEmpty());//false
	System.out.println(s1.contains("How"));//true
	System.out.println(s1.contains("fine"));//false bcoz fine is not present in s1
	char[] ch=s1.toCharArray();//converts the string into a character array
	for(int i=0;i<ch.length;i++){
		System.out.println(ch[i]);/*h
		i
		.
		 
		H
		o
		w
		 
		a
		r
		e
		 
		y
		o
		u
		 
		d
		o
		i
		n
		g
*/
	}
}
}


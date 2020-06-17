package com.vtalent.corejava.suma.a;

public class StringMethods {
	public static void main(String[] args){
/*String s="Suma";
String s1="Suma";
String s2=new String("Suma");
String s3="   Gurram";
System.out.println(s==s1);//true bcoz both ref to same reference
System.out.println(s==s2);//false bcoz s2 refer to instance created in heap
	System.out.println(s.compareTo(s1));//0
	System.out.println(s.compareTo(s3));//12 bcoz s>s3
	System.out.println(s3.compareTo(s1));//-12 bcoz s3<s1
s=10+20+"Suma"+"Gurram"  +30;//concat
	System.out.println(s);	//30SumaGurram30
	System.out.println(s.substring(7));//urram30 coz u is the 8th letter i.e. it prints after 7th letter(G)
	System.out.println(s.substring(2,9));//SumaGur coz it prints from 3rd to 9th letter 
	System.out.println(s.toUpperCase());//30SUMAGURRAM30
	System.out.println(s.toLowerCase());//30sumagurram30
	System.out.println(s);//30SumaGurram30
	System.out.println(s3);//   Gurram
	System.out.println(s3.trim());//removes space before/after string
	System.out.println(s3.startsWith("ra"));//false
	System.out.println(s3.startsWith("   Gu"));//true
	System.out.println(s3.endsWith("m"));//true
	System.out.println(s.charAt(0));//3
	System.out.println(s.charAt(5));//a i.e., prints "a" bcoz on 5th position a is present
	System.out.println(s.length());//14
	System.out.println(s);
	}
double a=5.0;
int b=3;
String s=String.valueOf(a);//converts given type into string
String s1=String.valueOf(b);
System.out.println(s+8);//5.08 not adds but displays the value
System.out.println(s1+1);//31
String s2="A is an  ant. A is air";
System.out.println(s2);//A is an  ant. A is air
String s3=s2.replace("A", "aaa");//replacing "aaa" in place of "A"
System.out.println(s3);// aaa is an  ant. aaa is air

String s2="A is an  ant. A is air";
System.out.println("index is "+s2.indexOf('s'));//3 bcoz s is present in 3rd position
System.out.println(s2.charAt(3));//s
String s3=s2.replaceAll("A", "aaa");//replacing "aaa" in place of "A"
String s=s2.replaceFirst("A", "aaa");//replacing the first position "aaa" in place of "A"
System.out.println(s);// aaa is an  ant. A is air
String s1="A IS AN ANT. A IS AIR";

System.out.println(s1.compareToIgnoreCase(s2));//65

String s="A is an ant.A is air";//
String s1="is";
char ch='a';
char ch1='r';
//String s3=String.format("My string is:", s1);
//System.out.println(s3);
//String s3="Suma";
int i=s.lastIndexOf(ch);
int j=s.lastIndexOf(ch1);
int k=s.lastIndexOf(s1);
System.out.println(i);//17 bcoz last 'a' letter in "s" is present in 17th position
System.out.println(j);//19bcoz last 'r' letter in "s" is present in 19th position
System.out.println(k);//14 bcoz last 'is' word is present in 14th position


String s=new String("hello");
System.out.println("hash code: " + s.hashCode());// hash code: 99162322 i.e., displaying hashcode of 's' value

		String s=new String("Hi How you").intern();//is used to get the string from the memory if it is already present


String s1= "Hi How you";
System.out.println("  :" +(s==s1));//false if s contains only hi
System.out.println("  : "+ (s==s1));//true
	System.out.println(s.matches(s1));//true
	System.out.println(s.matches("(.*)How(.*)"));//true bcoz how is present in s and we mentioned "(.*)" bcoz it indicates hi and you
	System.out.println(s.matches("(.*) are (.*)"));//false bcoz are is not present

		//String s="Hi This is suma";
		String s=String.join("|", "Hi", "This", "is", "suma");
		System.out.println(s);
		*/
	char[] data={'a','b','c','d','e','f','g','h','i','j','k'};
	String s="text";
	String s1="String";
	s=s.copyValueOf(data);
	System.out.println("result: " +s);//abcdefghijk
	s1=s1.copyValueOf(data,5,3);
	System.out.println("result:" +s1);//fgh
	}
	
	}

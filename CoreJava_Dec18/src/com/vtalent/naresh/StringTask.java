package com.vtalent.naresh;
import java.util.Scanner;

public class StringTask {
	static Scanner sc=new Scanner(System.in);
	static int c=0;
 static 	String ss;
  static	String s5="";
  static String st="";
  	String s1="Have a nice day and a wonderful nice too";
  	static char ch;
  	static char []cha;

public static void removeWhiteSpace() {
			String s1="i am new to java ocean";
			String [] s2=s1.split("\\s");
		/*
		 * for(int i=0;i<=s2.length-1;i++) { System.out.print(s2[i]); }
		 */
			for(String s3:s2) {
			System.out.print(s3);
			}
}


public static void combiningStrings(){
	System.out.println("Enter String one");
	String s1=sc.nextLine();
	System.out.println("Enter String two");
	String s2=sc.nextLine();
	for(int i=0;i<=s1.length()-1;i++) {
		for(int j=0;j<=s2.length()-1;j++) {
			if(s1.charAt(i)==s2.charAt(j)) {
			s1=	s1.replace(s1.charAt(i), ' ');
			s2=	s2.replace(s2.charAt(j), ' ');
			}
		}
	}
String	s3=s1+s2;
	System.out.print(s3.replace(" ", ""));
}	

	

public static void printRepeatedWords() {
  	int c=0;
  	//String ss;
  	String s5="";
  	System.out.println("Enter a String to find Repeated word");
  	String s1=sc.nextLine();
  String []s2=s1.split("\\s");
  
for(int j=0;j<=s2.length-1;j++) {
  	for(int i=0;i<=s2.length-1;i++) {
  		if(s2[j].contentEquals(s2[i])) {
  			  ss=s2[i];
  			c++; 
  		}
  	}
  	if(c>1) {
  		if(s5.contains(ss)) {
  			//System.out.println(ss+"-"+c+" times");
  			//s5=ss;
  		}
  		else {
  			System.out.println(ss+"-"+c+" times");
  			s5=s5+ss;
  		}
  	}
  		  	c=0;
  		}
  	//System.out.println(s5);
}
 		
public static void printRepeatedLetters() {
	String s1="helloworld";
	//char []cha=s1.toCharArray();
	
	for(int i=0;i<=s1.length()-1;i++) {
		for(int j=0;j<=s1.length()-1;j++) {
			if(s1.charAt(i)==s1.charAt(j)) {
				ch=s1.charAt(i);
				c++;
			}
			
		}
		if(c>=2) {
			System.out.println(ch+"-"+c+" times");	
				}
	
		c=0;		
			}
			
		
				}

public static void removingRepeatedLetters() {
	System.out.println("Enter a string");
	String s1=sc.nextLine().toLowerCase();
	String s2="";
	char [] ch=s1.toCharArray();
	for(int i=0;i<s1.length();i++) {
			if(!s2.contains(ch[i]+"")) {
				s2=s2+ch[i];
			}
	}
	System.out.println(s2);
}		
		
public static void main(String [] args) {
	
		//removeWhiteSpace();
		//combiningStrings();
		printRepeatedWords();
	//	printRepeatedLetters();
	//removingRepeatedLetters();
			}
	}
	


package com.vtalent.naresh;

public class StringEx {
	public static void main(String[] args) {

		String s1="Oliver"; // It will Store in String Constant Pool(part of Heap Memory)
		String s2="Oliver Queen";
		String s3= new String("Barry");
		String s4=new String("Barry Allen");
		
		String s11="Oliver";
		String s33=new String("Barry");
		
		if(s1.equals(s11)) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
	
	
	if(s3==s33) {
		System.out.println("True");
	}
	else {
		System.out.println("flase");
	}
	
	
	
	
	
//char charAt(int index)
 char ch=	s3.charAt(2);
	//System.out.println(ch);

 //int length();
 	//System.out.println(s4.length());
 
char[]  ch1= new char[s1.length()];
	for(int i=s1.length(); i<s1.length();i--) {
				System.out.println(ch1[i]);
			//if(ch1!=null) {
				//if(ch1[i])
			}
	}
 	
	
	
	
	}


package com.vtalent.saritha;

public class Teststring {
	public static void main(String []args){
		String s1=new String("hai");
		String s2=new String ("hello");
		String s3=new String("bye");
		s3=s2;
		s1=s3;
	//	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println();
		System.out.println(s1=s2);
		System.out.println(s2=s3);
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
	}
}


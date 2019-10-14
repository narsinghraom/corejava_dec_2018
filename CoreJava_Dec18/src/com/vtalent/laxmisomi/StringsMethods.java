package com.vtalent.laxmisomi;

public class StringsMethods {

	public static void main(String ars[])
	{
		String s1="abc";
		String s2= new String("abc");
		String s3="abc";
		
		
		if (s1.equals(s2)) {
			System.out.println("true"); }
		else {
			System.out.println("false");}
		
		
		
		if (s3.equals(s2)) {
			System.out.println("true"); }
		else {
			System.out.println("false"); }
		
		
		if(s1.equals(s3)) {
			System.out.println("true"); }
		else {
			
			System.out.println("false"); }
			
			
			
		if(s1==s3) {
			System.out.println("true"); }
			
		else {
			
			System.out.println("false"); }
				
		
		if(s1==s2) {
			System.out.println("true"); }
		else {
			
			System.out.println("false"); }
			
				
	
		if(s2==s3) {
			System.out.println("true"); }
			else {
			
			System.out.println("false"); }
			
				
		
	}
	
	
}

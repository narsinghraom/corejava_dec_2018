package com.vtalent.mahesh.basics;

import java.util.Scanner;
public class CharCount {
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		String s="mahesh";
		int c=0;
		
		   for(int i=0;i<=s.length()-1;i++) 
		   { 
			   for(int j=1;j<=s.length()-1;j++) 
			   {				  
				   if(s.charAt(i)==s.charAt(j)) {
						  c++;
						  System.out.println(s.charAt(i));
				   }
			   System.out.println(s.charAt(i)+""+c);
				   
				
			   }
			   c+=0;   
		   }
	}

}










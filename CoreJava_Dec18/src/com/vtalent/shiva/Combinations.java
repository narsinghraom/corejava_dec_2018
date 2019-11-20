package com.vtalent.shiva;

import java.util.Scanner;

public class Combinations {
	
	public void comb(String start,String end) {
		if(end.length()<=1) {
			
			System.out.println(start+end);
			
		}else {
			for(int i=0;i<end.length();i++) {
				String n=end.substring(0, i) + end.substring(i+1);
				comb(start + end.charAt(i),n);
				
			}
		}
	}
	public static void main(String[] args) {
		Scanner e=new Scanner(System.in);
		Combinations c=new Combinations();
		System.out.println("enter the string");
		String s =e.nextLine();
		c.comb("", s);
		
		
	}
	
}

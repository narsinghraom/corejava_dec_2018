package com.vtalent.vijaya.basic;

public class CountCharacter {
	public static void main(String[] args) {
		String str="java is Programing language";
		int count=0;
		for(int i=0;i<str.length();i++)
		{

			if(str.charAt(i)!=' ')
				count++;
			
		}
		System.out.println("total no of characters in a string-"+count);
	}
	

}

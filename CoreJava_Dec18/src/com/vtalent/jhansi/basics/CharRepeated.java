package com.vtalent.jhansi.basics;
import java.util.Scanner;

public class CharRepeated {
	public static void main(String[] args) {
		String s1;
		int count=1;
		System.out.println("please enter string");
		Scanner input=new Scanner(System.in);
		s1=input.next();
		for(int i=0;i<s1.length()-1;i++)
		{
			
			for(int j=1;j<i;j++)
			{
				if(s1.charAt(i)==s1.charAt(j))
				{
					System.out.println(count);
				count++;
				}
			}
			System.out.println(s1.charAt(i)+" occurs "+ count +" times");
			//count=1;
		
		}
		
	}

}

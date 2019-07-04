package com.vtalent.saritha;

import java.util.Scanner;

public class HashcodeEx {
	
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter age");
		int a=sc.nextInt();
		if(a>17){
			System.setProperty("flag1","true");
			boolean b2=Boolean.getBoolean("flag1");
			int val1=Boolean.hashCode(b2);
			if (val1==1231){
				System.out.println("hash code is match");
				System.out.println("you are an adult.\n you are eligible to vote");
			}
			else{
				int val2=18-a;
				System.out.println("you are not adult");
				//System.out.println();
				
				
				
			}
			
			
			
			
		}
		
		
	}

}

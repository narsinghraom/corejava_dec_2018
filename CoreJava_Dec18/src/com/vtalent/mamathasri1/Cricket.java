

package com.vtalent.mamathasri1;
import java.util.Scanner;
public class Cricket {
	public static void main(String args[]) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the first team name");
		String a=in.next();
		System.out.println("Enter the second team name");
		String b=in.next();
		System.out.println("Welcome to ODI between\t"+a+"\tvs\t"+b);
		System.out.println("Is it Raining y/n:");
		String n=in.next();
		if(n.equals("y")) {
			System.out.println("Is it Raining for 2 hours y/n:");
			String p=in.next();
			if(p.equals("y")){
				System.out.println("Is it Raining for 3 hours y/n:");
				String k=in.next();
				if(k.equals("n")) {
					System.out.println("Overs Reduced by 40:");
				}
				else if (k.equals("y"));
				System.out.println("match is delayied due to rain");
				System.exit(0);
				
				}
				
				
			}
			
		}
		
		
	}
	
	




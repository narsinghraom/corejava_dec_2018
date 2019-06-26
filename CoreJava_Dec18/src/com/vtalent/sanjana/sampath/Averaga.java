package com.vtalent.sampath;

import java.util.Scanner;


public class Averaga {
	public static void main(String args[]){
		Scanner input=new Scanner (System.in);
		int income;
		int total=0;
		int averageIncome;
		int x=0;
		while (x<10) {
		x++;
		System.out.println("Enter your income of day" +x+":");
		income=input.nextInt();
		total=total+income;
		
		}
		averageIncome =total/10;
		System.out.println();
		System.out.println("your total income is"+total);
		System.out.println("your daily average income is:"+averageIncome);
		
	}

}

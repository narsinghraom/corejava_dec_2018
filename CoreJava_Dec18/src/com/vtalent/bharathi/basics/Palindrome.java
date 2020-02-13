package com.vtalent.bharathi.basics;
import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		int sum =0;
		int rem;
		System.out.println("enter the number");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		int temp = num;
		while(num>0) {
			rem = num%10;
			sum = sum*10 + rem;
			num = num/10;
		}
		if(temp == sum) {
			System.out.println("given number is palindrome");
		}else {System.out.println("not a palindrome");}
	}
	}



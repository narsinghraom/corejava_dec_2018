package com.vtalent.bingi;
import java.util.Scanner;

public class Factorial {
	
public static void main(String args[]) {
	while (true)
	{
	Scanner Sc=new Scanner(System.in);
	int n=Sc.nextInt();
	int fact=1;
	for(int i=2;i<=n;i++) {
		fact=fact*i;
	}
	System.out.println("factorial"+fact);
	}
}}
	

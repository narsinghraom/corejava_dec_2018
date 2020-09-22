package com.vtalent.corejava.alekya.basicprgrms;
import java.util.Scanner;

public class Factorial {
	public static void  factorial()
	{
		int i,fact=1;
		System.out.println("please enter the number");
		Scanner scan = new Scanner(System.in);
		int numb = scan.nextInt();
		for (i = 1; i <= numb; i++) {
			fact = fact * i;
		}
		System.out.println("Factorial of " + numb + " is: " + fact);
	}

	public static void main(String[] args) {
		factorial();

	}
}

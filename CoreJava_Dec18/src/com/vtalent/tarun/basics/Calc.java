package com.vtalent.tarun.basics;

import java.util.*;

public class Calc {

	public static void main(String[] args) {
		String yn;
		do {
			System.out.println("$$$$$ Welcome to Java made Calculator :) $$$$$");
			System.out.println();
			Scanner s = new Scanner(System.in);
			System.out.println("Enter 1st num: ");
			int n1 = s.nextInt();
			System.out.println("Enter 2nd num: ");
			int n2 = s.nextInt();
			int result;
			System.out.println("Please Select a Symbol to calculate (+, - , *, /,%)");
			String sym = s.next();
			switch (sym) {
			case "+":
				result = n1 + n2;
				System.out.println("Addition of given numbers = " + result);
				break;
			case "-":
				result = n1 - n2;
				System.out.println("Subtraction of given numbers = " + result);
				break;
			case "*":
				result = n1 * n2;
				System.out.println("Multiplication of given numbers = " + result);
				break;
			case "/":
				result = n1 / n2;
				System.out.println("Division of given numbers = " + result);
				break;
			case "%":
				result = n1 % n2;
				System.out.println("Modulus of given numbers = " + result);
				break;
			default:
				System.out.println("Invalid input of Symbol, Please try again!!");
				break;
			}
			System.out.println("Do you want to continue, Press y for Yes or n for No");
			yn = s.next();

		} while (yn.equals("y") || yn.equals("Y"));
	}

}

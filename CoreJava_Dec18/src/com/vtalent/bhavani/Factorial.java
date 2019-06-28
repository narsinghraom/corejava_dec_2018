package com.vtalent.bhavani;
import java.util.Scanner;

	public class Factorial {
	     public static void factorial() {
			int i, fact = 1;
			System.out.println("please enter the number");
			Scanner sc = new Scanner(System.in);
			int number = sc.nextInt();

			for (i = 1; i <= number; i++) {
				fact = fact * i;
			}
			System.out.println("Factorial of " + number + " is: " + fact);
		}

		public static void main(String[] args) {
			factorial();

		}
	
}

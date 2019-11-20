package com.vtalent.prashanth;

import java.util.Scanner;

class AgeException extends Exception{
	public String toString() {
		System.out.println("You Are not Eligible to Get Loan, Age Should be >= 25.");
		return null;
	}
}

public class ExcepitionTest {

	public static void main(String[] args) throws AgeException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Age To Get Loan: ");
		int age = sc.nextInt();
		if(age < 25) {
			throw new AgeException();
		}else {
			System.out.println("You Are Eligible to Get Loan");
		}

	}

}

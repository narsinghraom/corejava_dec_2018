package com.vtalent.Bhavani;
import java.lang.Exception; 
import java.util.Scanner;

public class Loan extends Exception {
	@SuppressWarnings("resource")
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long sal = sc.nextLong();
		
		if (sal > 30000) {
			throw new LoanEligiable("You are Eligible for loan");
		}
		

		else if (sal < 30000) {
		System.out.println("you are not eligible for loan");
		} 

	}

}

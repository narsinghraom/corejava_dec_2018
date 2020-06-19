package com.vtalent.tarun.basics;

public class UAException extends Exception { //UA = UnderAge

	UAException() {
		super("You are noob"); //why super is bcoz for default exception handler
	}

	UAException(String message) {
		super(message);
	}
}

class Voting {
	public static void main(String[] args) {
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.println("Enter your age:");
		int age = s.nextInt();
		try {
			if (age < 18) {
				throw new UAException();
			} else {
				System.out.println("You iz pro");
			}
		} catch (UAException e) {
			e.printStackTrace();
		}
	}
}

package com.vtalent.tarun.basics;

public class UAException extends Exception {

	UAException() {
		super("You are noob"); //why super is bcoz for default exception handler
	}

	UAException(String message) {
		super(message);
	}
}

class Voting {
	public static void main(String[] args) {
		int age = 24;
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

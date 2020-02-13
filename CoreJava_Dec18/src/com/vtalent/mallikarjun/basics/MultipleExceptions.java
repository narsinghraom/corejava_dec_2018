package com.vtalent.mallikarjun.basics;

public class MultipleExceptions {
	static class LoanException extends Exception{
		public String toString() {
			return "you get the loan upto one lake";
		}
	}
	static class ExperienceException extends Exception{
		public String toString() {
			return "you should have minimum two years of experience";
		}
	}
}

package com.vtalent.java.srikarreddy;

import java.util.Scanner;

class AgeException extends Exception{
	public String toString() {
		System.out.println("you are not eligble,1Age should be>=25");
		return null;
	} 
}
public class ExceptionTest {
	public static void main(String[] args) throws AgeException {
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter your age to get loan");
		int age=sc.nextInt();
		if(age<25) {
			throw new AgeException();
		}
		else {
			System.out.println("you are eligble");
		}
	}

}

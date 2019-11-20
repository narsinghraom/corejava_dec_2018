package com.vtalent.java.haritha;

public class Throwtest {
	static void validate(int age){
	     if(age<18)
	      throw new ArithmeticException("not valid");
	     else
	      System.out.println("welcome to vote");
	   }
	   
	   public static void main(String args[]){
	      validate(11);
	      System.out.println("rest of the code...");
	  }
}

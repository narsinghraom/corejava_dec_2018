package com.vtalent.suma3;
import java.util.Scanner;

	public class Kals {

	   public static void main(String[] args) {
	      Scanner input = new Scanner(System.in);
          double principal = 0;
	      double rate = 0;
	      double time = 0;

	      double compoundInterest = 0;
	   
	      int i;
	      for (i=0;i<3;i++) 
	      {
	      System.out.print("Enter the Principal amount : "); 
	      principal = input.nextDouble();

	      System.out.print("Enter the Rate : "); 
	      rate = input.nextDouble();

	      System.out.print("Enter the Time : "); 
	      time = input.nextDouble();

	      compoundInterest = principal * Math.pow((1 + rate/100),time); 
	  
	      System.out.println("");
	      //System.out.println("The Compound Interest is : "
	    // + compoundInterest);
	      System.out.println("The End of the year prinicipal amount is:" + compoundInterest);
	  
	   }

	}
	}



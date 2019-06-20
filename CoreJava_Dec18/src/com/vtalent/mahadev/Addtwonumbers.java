package com.vtalent.mahadev;
import java.util.Scanner;

public class Addtwonumbers {
	 public static void main(String[] args)
	   {
	      int x;
	      int y;
	      int z;
	 Scanner in;
	      System.out.println("Enter two integers to calculate their sum");
	    in = new Scanner(System.in);
	     
	      x = in.nextInt();
	      y = in.nextInt();
	      z = x + y;
	     
	      System.out.println("Sum of the integers = " + z);
	   }
}

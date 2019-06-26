package com.vtalent.sneha;

public class Wow {
	 public static void go(short n) 
	 {
		 System.out.println("short");
		 }
	 public static void go(short n)
	 {
		 System.out.println("SHORT");
		 }
	 public static void go(long n) 
	 {
		 System.out.println(" LONG");
		 }
	 public static void main(String [] args) {
	   short y = 6;
	   int z = 7;
	   go(y);
	   go(z);
	 }
	}

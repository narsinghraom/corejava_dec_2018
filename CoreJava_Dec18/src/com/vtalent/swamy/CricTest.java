package com.vtalent.swamy;

import java.util.Scanner;

public class CricTest {
	static Scanner sc = new Scanner(System.in);
	public  int teamA() throws Exception {
		
		String st=sc.nextLine();	 
	if(st.equals("yes")) {
		CricTest.delay();
	}
	else 
	 	System.out.println("Enter the overs played by team A");
		int s2=CricTest.playing();
	
	return s2;

		
	}
	 public int teamB() throws Exception{
		
			String st=sc.nextLine();
		if(st.equals("yes")) {
			CricTest.delay();
		}
		else 
			System.out.println("Enter the overs played by team B");
			int  s1= CricTest.playing();

		return s1;
		
	}
	public static void delay() throws Exception {

		System.out.println("Is Raining after 2 hours Y/N");
		String s = sc.nextLine();
		if (s.equals("y")) {
			CricException.exception2(s);
		} else if (s.equals("n")) {
			playing();
		} else {

		}
	}
  
	public static int playing() throws Exception {
		
		System.out.println("enter overs");
		double d = sc.nextDouble();
		if (d <= 50) {
			double a = Math.abs(d - Math.floor(d));
			if (a > 0.5 && a <= 0.6) {
				d = Math.round(d);
			}
		} else {
			System.out.println("enter lessthen 50.1");
			CricException.oversException();
		}

		System.out.println("Enter the Runrate ");
		double f = sc.nextDouble();
		if (f <= 36) {
		} else {

			CricException.runrateException();
		}
		int w = wickets(f);
		
		int  totalscore = (int) (d * f);
		System.out.println("Total Score by Team Score " + "=" + totalscore + "/" + w);
		return totalscore;
		
	}

	public static int wickets(double f) {
		if (f <= 2) {
			return 2;
		} else if (f <= 4) {
			return 6;
		} else if (f <= 6) {
			return 8;
		} else
			return 10;
	}

}

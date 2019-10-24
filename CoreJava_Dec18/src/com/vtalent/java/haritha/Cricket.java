package com.vtalent.java.haritha;
import java.util.Scanner;
import java.io.*;
public class Cricket {
	Scanner sc=new Scanner(System.in);
	static String s;
	static String s1;
	static float Total;
	static float Total1;
	static boolean fourtyOversFlag= false;
	
	static class CricketOversException extends Exception{
	CricketOversException(String s){	
			super(s);
		}
	}
 static class TestCustom{
		public static void overs(float o)throws CricketOversException{
		if(o>50) {
			 throw new CricketOversException("overs should be lessthan 50");
		 }
			
			 else {
				 double op=Math.abs(o-Math.floor(o)); 
				 if(op>0.5&&op<=0.6) { 
				 o=Math.round(o);
			 System.out.println(o); 
			 }
			
		 if(op>0.6) {
				throw new CricketOversException("An over should have only 6 balls");
			}
			}
		}

	
public static void rain(float r)throws CricketOversException{
	if(r>40) {
		 throw new CricketOversException("overs should be lessthan 40");
	 }
}
public static void Tie()throws CricketOversException{
    throw new CricketOversException("Match Tie");
}
 }

 public void FirstInnings() throws CricketOversException {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter the Team A name:");
		String s=sc.next();
		System.out.println("Enter the Team B name:");
		String s1=sc.next();
		System.out.println("Welcome to OneDyInnings\t"+ s+"\tvs\t"+s1);
		System.out.println("First Innings by"+" "+s);
		System.out.println("enter the overs played by "+s);
		float x=sc.nextFloat();
		TestCustom.overs(x);
		if(fourtyOversFlag== true) {
		TestCustom.rain(x);
		}
		System.out.println("enter the Runrate played by "+s	);
		float r=sc.nextFloat();
		int Total=(int) (x*r);
		System.out.println("Total score of the First Team"+Total);
 }
 public void SecondInnings() throws CricketOversException {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Second Innings by"+" "+s1);
		System.out.println("enter the overs played by "+s1);
		float x1=sc.nextFloat();
		TestCustom.overs(x1);
		System.out.println("enter the Runrate played by"+s1	);
		float r1=sc.nextFloat();
		int Total1=(int) (x1*r1);
		System.out.println("Total score of the Second Team"+Total1);
		TestCustom.overs(x1);
		if(fourtyOversFlag== true) {
		TestCustom.rain(x1);
		}
  }
		 
		public static void main(String args[]) throws Exception {
		int m=0;
		Cricket c=new Cricket();
		 Scanner sc=new Scanner(System.in);
		System.out.println("Is It Raining yes/no:");
		String s2=sc.next();
		if(s2.equals("yes")) {
			System.out.println("Is it Raining after 2 hours"+" "+"yes/no");
			String s3=sc.next();
			if(s3.equals("yes")){
	         System.out.println("Is it Raining after 3 hours"+" "+"yes/no");
				String s4=sc.next();
				
				if(s4.equals("no")) {
				System.out.println("overs reduced by 40");
				fourtyOversFlag=true;
				c.FirstInnings();
				m++;
				if(m==1) {
				c.SecondInnings();
			    }
				}
				else if(s4.equals("yes")) {
					System.out.println("Match is Adundant Due to Heavy rain");
					System.exit(0);
				}
			}	
		}
		c.FirstInnings();
		m++;
		if(m==1) {
		c.SecondInnings();
	    }
		if(Total==Total1) {
			TestCustom.Tie();
		}else if(Total>Total1) {
			System.out.println(s+" "+"Won the match");
		}else if(Total1>Total) {
			System.out.println(s1+" "+"Won the match");
		}

} 
	}
/*
 * if(0vers==50&&runrate<=4.5) { System.out.println("wickets should be 10"); }
 * if(Overs==50&&runrate<=6.5){ System.out.println("wickets should be 7 to 9");
 * }
 */
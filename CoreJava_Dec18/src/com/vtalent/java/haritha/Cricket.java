package com.vtalent.java.haritha;
import java.util.Random;
import java.util.Scanner;
import java.io.*;
public class Cricket {
	static Scanner sc=new Scanner(System.in);
	static String s;
	static String s1;
	static float Total,x,x1,r1;
	static float Total1;
	static int m=0;
	static boolean fourtyOversFlag= false;
	static int wickets;
	Random r=new Random();
	static class CricketOversException extends Exception{
	CricketOversException(String s){	
			super(s);
		}
	}
 static class TestCustom{
		public static void overs(float o)throws CricketOversException{
		if(o>50) {
			try {
			 throw new CricketOversException("overs should be lessthan 50");
		 }catch(CricketOversException e){
			 System.out.println(e);
		 }
			System.out.println("please enter overs again:");
			Exceptionhandle();
		}
		 else {
			 double op=Math.abs(o-Math.floor(o)); 
			 if(op>0.5&&op<=0.6) { 
			 o=Math.round(o);
		 System.out.println(o); 
		 }	
		 if(op>0.6) {
			 try {
				throw new CricketOversException("An over should have only 6 balls");
			}catch(CricketOversException e1) {
				System.out.println(e1);
			}
			 System.out.println("please enter valid overs:");
			 Exceptionhandle();
			}
			 }
		}
public static void rain(float r)throws CricketOversException{
	if(r>40) {
		try {
		 throw new CricketOversException("overs should be lessthan 40");
	 }catch(CricketOversException e2) {
		 System.out.println(e2);
	 }
		System.out.println("please enter overs again:");
		Exceptionhandle();
}
}
public static void runs() throws CricketOversException {
	try {
	throw new CricketOversException("runs should not exceed 6 runs morethan first innings score:");
}
catch(CricketOversException e4) {
		System.out.println(e4);
	}
	System.out.println("enter runrate once again:");
	float rr=sc.nextFloat();
	r1=rr;
}
public static void Tie()throws CricketOversException{
	try {
    throw new CricketOversException("Match Tie");
}catch(CricketOversException e3) {
	System.out.println(e3);
}
 }
 }
 static public void Exceptionhandle() {
	 float h=sc.nextFloat();
	 if(m==0) {
		 x=h;
	 }else if(m==1) {
		 x1=h;
	 }
 }
public void Rain()throws CricketOversException{
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
				if(m==0) {
				FirstInnings();
				}
				else if(m==1) {
					Total=(int)((75*Total)/100);
					System.out.println("First team score due to rain based on DLS method is:"+(int)Total);
				SecondInnings();
			    }
				}
				else if(s4.equals("yes")) {
					System.out.println("Match is Adundant Due to Heavy rain");
					System.exit(0);
				}
			}	
		}
}
 public void FirstInnings() throws CricketOversException {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter the Team A name:");
	    s=sc.next();
		System.out.println("Enter the Team B name:");
	    s1=sc.next();
		System.out.println("Welcome to OneDyInnings\t"+ s+"\tvs\t"+s1);
		System.out.println("First Innings by"+" "+s);
		System.out.println("enter the overs played by "+s);
		x=sc.nextFloat();
		TestCustom.overs(x);
		if(fourtyOversFlag== true) {
		TestCustom.rain(x);
		}
		if(x<50) {
			wickets=10;
		}
		else if(x==50) {
			wickets=r.nextInt(9);
		}
		System.out.println("enter the Runrate played by "+s	);
		float r=sc.nextFloat();
		Total=(int) (x*r);
		System.out.println("Total score of the First Team"+(int)Total+"/"+wickets);
		m++;
		Rain();
 }
 public void SecondInnings() throws CricketOversException {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Second Innings by"+" "+s1);
		System.out.println("enter the overs played by "+s1);
		 x1=sc.nextFloat();
		TestCustom.overs(x1);
		if(fourtyOversFlag== true) {
			TestCustom.rain(x1);
			}
		System.out.println("enter the Runrate played by"+s1	);
		System.out.println("run rate should not exceed more than two decimal points of:"+(Total/x1));
		r1=sc.nextFloat();
		Total1=(int) (x1*r1);
		if(x1<50&&Total<Total1) {
			wickets=10;
		}else if(x<=50&&Total1<(Total+6)&&Total>Total1) {
			wickets=r.nextInt(9);
		}
		if(Total1>(Total+6)) {
			TestCustom.runs();
		}
		System.out.println("Total score of the Second Team"+(int)Total1+"/"+wickets);
		m++;
  }
 public static void main(String args[]) throws CricketOversException {
		Cricket c=new Cricket();
		c.Rain();
		if(m==0) {
		c.FirstInnings();
		}
		if(m==1) {
		c.SecondInnings();
	    }
 if(Total>Total1) {
			System.out.println(s+" "+"Won the match");
		}else if(Total1>Total) {
			System.out.println(s1+" "+"Won the match");
		} else if(Total==Total1) {
			TestCustom.Tie();
}
 }
}
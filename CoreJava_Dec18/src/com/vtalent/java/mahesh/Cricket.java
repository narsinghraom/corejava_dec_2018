package com.vtalent.java.mahesh;

import java.util.Scanner;

import java.util.Random;

public class Cricket {
	static Scanner in=new Scanner(System.in);
	static String a,b;
	static float e,h;
	static int z;
	Random r=new Random();
	static boolean innings=false;
	static boolean fortyoversflag=false;
	 static class Over extends Exception{
		Over(String s){
		super(s);
		}	
	}
	 static class OverException{
		 public static void ov(float o) throws Over{
		 if(o>50){
			throw new Over("Not valid number of overs");
			}
		 else{
			 double ap = Math.abs(o - Math.floor(o));
			    if (ap > 0.5&&ap<=0.6){
			        o= Math.round(o);
			        System.out.println(o);
			    }
			  if (ap>0.6){
			throw new Over("An over should have only 6 balls"); 
		 }
		 }
	 }
		 public static void ri(float o) throws Over{
			if(o>40){
				throw new Over("Overs reduced to 40 due to rain");
			} 
		 }
		 public static void tie()throws Over{
			 throw new Over("Match is a tie");
		 }
		 public static void runs()throws Over{
			 throw new Over("Runs Should not exceed 6 more than from first team score");
		 }
	 }
	 public void rain() throws Over{
		 Scanner in=new Scanner(System.in);
			System.out.println("Is It Raining yes/no:");
			String n=in.next();
			if(n.equals("yes")){
			System.out.println("Is It Raining for 2 hours yes/no:");
			String p=in.next();
				if(p.equals("yes")){
					System.out.println("Is It Raining for 3 hours yes/no:");
					String k=in.next();
					if(k.equals("no")){
						fortyoversflag=true;
						if(innings==false)
						{
						FirstInnings();
						}else if(innings==true)
						{
							e=(int)((75*e)/100);
							System.out.println("First teams score due to rain is:"+(int)e);
							SecondInnings();
						}
					}else if(k.equals("Yes")){
						System.out.println("Match is Abundant due to heavy rain");
						System.exit(0);
					}
				}
			}
	 }
	public void FirstInnings() throws Over{
		System.out.println("enter the first team name");
		a=in.next();
		System.out.println("enter the second team name");
		b=in.next();
		System.out.println("Welcome to ODI between\t "+a+"\tvs\t"+b);
		System.out.println("First Innings by"+"  "+a);
		System.out.println("Ente the number of overs:");
		float f=in.nextFloat();
		OverException.ov(f);
		if(fortyoversflag==true){
			OverException.ri(f);
		}
		System.out.println("Enter the run rate:");
		float d=in.nextFloat();
		e=(int) (f*d);
		if(f<50){
			z=10;
		}
		else if(f==50){
			 z=r.nextInt(9);
		}
		System.out.println("The score of\t"+ a +"\tteam is:"+(int)e+"/"+z);
		innings=true;
		rain();
	}
	public void SecondInnings() throws Over{
		System.out.println("Second Innings by"+"  "+b);
		System.out.println("Enter the number of overs:");
		float x=in.nextFloat();
		OverException.ov(x);
		if(fortyoversflag==true){
			OverException.ri(x);
			}
	System.out.println("Enter the run rate:");
	System.out.println("Run rate should not exceed more than 2 decimal points of"+(e/x));
	float g=in.nextFloat();
	h=(int) (x*g);
	if(x<=50&&h<e){
		z=10;
	}
	else if(x<50&&(h<(e+6)&&h>e)){
		z=r.nextInt(9);
	}
	System.out.println("The score of\t"+ b +"\tteam is:"+(int)h+"/"+z);
	}
	public static void main(String args[]) throws Over{
		int l=0;		
		Cricket c=new Cricket();
			c.rain();
			if(innings==false)
			{
			c.FirstInnings();
			}else if(innings==true)
			{
				c.SecondInnings();
			}
		if(e>h){
			System.out.println(a+"  "+"Won the match by"+" "+(e-h)+" "+"runs");
		}else if(h>e&&h<=(e+6)){
			System.out.println(b+"  "+"Won the match by"+" "+(h-e)+" "+"runs");
		}
			else if(h>(e+6)){
				OverException.runs();
			}
		 if(e==h){
			OverException.tie();
		}
		
	}
}

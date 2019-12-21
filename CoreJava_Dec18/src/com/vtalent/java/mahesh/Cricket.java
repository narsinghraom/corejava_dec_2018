package com.vtalent.java.mahesh;

import java.util.Scanner;

import java.util.Random;

public class Cricket {
	static Scanner in=new Scanner(System.in);
	static String a,b;
	static float e,h,o,f,x,g;
	static int z;
	Random r=new Random();
	static int l=0;
	static boolean fortyoversflag=false;
	
	
	 static class Over extends Exception{
		Over(String s){
		super(s);
		}	
	}
	 
	 
	 static class OverException{
		 public static void ov(float o) throws Over{
		 if(o>50){
			 try{
			throw new Over("Not valid number of overs");
			}catch(Over e){
				System.out.println(e);
			}System.out.println("Please enter the overs once again:");
			 Exceptionhandle();
		 }
		 else{
			 	double ap = Math.abs(o - Math.floor(o));
			    if (ap>0.5&&ap<=0.6){
			        o= Math.round(o);
			        System.out.println(o);
			    }
		else  if (ap>0.6){
				  try{
					  throw new Over("An over should have only 6 balls"); 
				  	}catch(Over e1){
					  System.out.println(e1);
					  System.out.println("Please enter the overs once again:");
					  Exceptionhandle();
				  }
		 }
		 }
	 }
		 
		 public static void ri(float o) throws Over{
			if(o>40){
				try{
				throw new Over("Overs reduced to 40 due to rain");
				}catch(Over e2){
					System.out.println(e2);
				}
			} System.out.println("Please enter the overs once again less than 40:");
			 Exceptionhandle();
		 }
		 
		 public static void tie()throws Over{
			 try{
			 throw new Over("Match is a tie");
			 }catch(Over e3){
				 System.out.println(e3);
			 }
		 }
		 
		 public static void runs()throws Over{
			 try{
			 throw new Over("Runs Should not exceed 6 more than from first team score");
			 }catch(Over e4){
				 System.out.println(e4);
			 }System.out.println("please enter run rate once again:");
			 float rr=in.nextFloat();
			 g=rr;
		 }
	 }
	 
	 public static void Exceptionhandle(){
		 o=in.nextFloat();
		 if(l==0){
			 f=o;
		 }else if(l==1){
			 x=o;
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
						if(l==0)
						{
						FirstInnings();
						}else if(l==1)
						{
							 e=(int)((75*e)/100);
							System.out.println("First teams score due to rain based on DLS method is:"+(int)e);
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
		System.out.println("Enter the number of overs:");
		f=in.nextFloat();
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
		l++;
		rain();
	}
	
	public void SecondInnings() throws Over{
		
		System.out.println("Second Innings by"+"  "+b);
		System.out.println("Enter the number of overs:");
		x=in.nextFloat();
		OverException.ov(x);
		if(fortyoversflag==true){
			OverException.ri(x);
			}
	System.out.println("Enter the run rate:");
	System.out.println("Run rate should not exceed more than 2 decimal points of:"+(e/x));
	g=in.nextFloat();
	h=(int) (x*g);
	if(x<50&&h<e){
		z=10;
	}
	else if(x<=50&&(h<(e+6)&&h>e)){
		z=r.nextInt(9);
	}if(h>(e+6)){
		OverException.runs();
	}
	System.out.println("The score of\t"+ b +"\tteam is:"+(int)h+"/"+z);
	l++;
	}
	
	public static void main(String args[]) throws Over{		
		Cricket c=new Cricket();
			c.rain();
			if(l==0){
				c.FirstInnings();
			} if(l==1){
				c.SecondInnings();
			}
		if(e>h){
			System.out.println(a+"  "+"Won the match by"+" "+(e-h)+" "+"runs");
		}else if(h>e&&h<(e+7)){
			System.out.println(b+"  "+"Won the match by"+" "+(h-e)+" "+"runs");
		}
		 if(e==h){
			OverException.tie();
		}
	}
}
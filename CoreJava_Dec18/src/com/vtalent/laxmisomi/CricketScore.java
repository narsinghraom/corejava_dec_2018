 package com.vtalent.laxmisomi;

 import java.util.*;
 
 import java.io.*;
 
 class CricketScore{
	 
 static Scanner sc=new Scanner(System.in);
 static int var=0;
 static String nameA,nameB;
 static float score,Bscore;
 static  float oversA,Bovers,runrate, Brunrate, O;
 static boolean a1=false;
 
 static class Overs extends Exception {
	 Overs(String s){
		 super(s);
	 }
 }
 static class OverException{
	 public static void fifityoversException(float O) throws Overs {
		 if(O>50) {
			 try {
			 throw new Overs("overs should not exceed 50");
			 }
			 catch(Overs e){
				 System.out.println(e);
				 System.out.println("enter number of overs");
				 ExceptionHandle();
				 }
		 }
		 else {
			 double ap=Math.abs(O-Math.floor(O));
			 if (ap>0.5 && ap<=0.6) {
				 O=Math.round(O);
				 System.out.println(O);
			 }
			 if(ap>0.6) {
				 try {
					 throw new Overs("an over should have only 6 balls");
				 }
				 catch(Overs e4) {
					 System.out.println(e4);
				 }
				 System.out.println("please enter valid overs");
				 ExceptionHandle();
				 
				 }
			 }
		 }
	 
	 public static void thirtyoversException(float O) throws Overs {
		 if(O>30) {
			 try {
				 throw new Overs("overs should not exceed 30");
			 }
			 catch(Overs e5) {
				 System.out.println(e5);
			 }
		 }
	 }
	 
	 public static void fourtyoversException(float O) throws Overs{
		 if(O>40) {
			 try {
				 throw new Overs("overs should not exceed 40 after raining");
			 }
			 catch(Overs e1 ) {
				 System.out.println(e1);
				 System.out.println("enter number of overs");
				 ExceptionHandle();
				 
			 }
		 }
	 }
	 
	 public static void MatchTieException() {
		 try {
			 throw new Overs("Match is Tie");
		 }
		 catch(Overs e2) {
			 System.out.println(e2);
			 
		 }
	 }
	 
	 public static void MatchAbord() {
		 try {
			 throw new Overs("Match is abundant due to rain");
		 }
	     catch(Overs e3) {
	    	 System.out.println(e3);
	    	 System.exit(0);
	     }
	 
	 }
 
 public static void ExceptionHandle() {
	 O=sc.nextFloat();
	 if(var==0) {
		 oversA=O;
	 }else if(var==1) {
		 Bovers=O;
	 }
 }
 }	 
public static void Rain() throws Overs {
	
	 System.out.println("Is it raining yes/no");
     String rain=sc.next();
    if(rain.equals("yes")) {
    System.out.println("Is it raining after 2 hours yes/no");
     String rain2=sc.next();
    if(rain2.equals("yes")) {
    System.out.println("Is it raining after 3 hours yes/no");
     String rain3=sc.next();
    if(rain3.equals("no")) {
    	System.out.println("overs reduced by 40");	
    	a1=true;
    	if(var==0) {
    	Firstinnings();
    	}else if(var==1) {
    		score=(75*score)/100;
    		System.out.println("first team score is rediuced by " +(int)score);
    	Secondinnings();
    	}
    }
    else if(rain3.equals("yes")) {
    	OverException.MatchAbord();
    	
    }
    }
    }
}
	 public static void Firstinnings()throws Overs {
		 System.out.println("Enter Team A name");
		 nameA=sc.next();
	    System.out.println("Enter Team B name");
		 nameB=sc.next(); 
	    System.out.println("welcome to ODI between\t " +" " +nameA+" v/s "+ nameB);
	    System.out.println("Enter First innings by " +nameA);
	    System.out.println("Enter number of overs played"); 
	     oversA=sc.nextFloat();
	     OverException.fifityoversException(oversA);
	     if(a1==true) {
	     OverException.fourtyoversException(oversA);
	     }
	     else {
	    	 OverException.thirtyoversException(oversA);
	     }
	    System.out.println("Enter runrate");	
	      runrate=sc.nextFloat();
	    score= (int) (oversA*runrate);
	    System.out.println("total score of"+ nameA + "is"+ (int)score);
	    var++;
	    Rain();
	 }
	 public static void Secondinnings() throws Overs {
		 System.out.println("Enter Second innings by "+nameB);
	      System.out.println("Enter number of overs played"); 
	       Bovers=sc.nextFloat();
	       OverException.fifityoversException(Bovers);
	       if(a1==true) {
	  	     OverException.fourtyoversException(Bovers);
	  	     }
	       else {
		    	 OverException.thirtyoversException(Bovers);
	       }

	      System.out.println("Enter runrate");	
	        Brunrate=sc.nextFloat();
	      Bscore= (int) (Bovers*Brunrate);
	      System.out.println("total score of"+ nameB + "is"+ (int)Bscore);
	      var++;
	    }
 public static void main(String agrs[]) throws Overs {
	 CricketScore c=new CricketScore();
	 c.Rain();
	 if(var==0) {
	 c.Firstinnings();
	 }if(var==1) {
	 c.Secondinnings();
	 } 
    if (score>Bscore) {
  	  System.out.println("Finally"+ nameA+ "won the match by" + (score-Bscore)+ "runs");
    }
  	  else if(Bscore>score) {
  		  System.out.println("Finally"+ nameB+ "won the match by" + (Bscore-score)+ "runs");
  	  }   
 }
 }
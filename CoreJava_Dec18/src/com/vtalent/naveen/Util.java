 package com.vtalent.naveen;

import java.util.Scanner;



public class Util {
	public static Scanner sc;
	public static double calculateOvers(String team,double overs){
		sc=new Scanner(System.in);

		//condition for balls we need below 3 steps
		String stringovers=Double.toString(overs);
		char[] ch=stringovers.toCharArray();
		int balls=Character.getNumericValue(ch[3]);
		while(overs> 50.0 || balls>5) {

			if(balls>5) {
				System.out.println("One Over Contains 6 balls so please enter value lessthan 6 after decimal point"); 
			}//end if
			else {
				System.out.println("Overs should be Less Then Or Equals to 50");
			}//end else

			System.out.println("Enter Overs Played By "+team);
			overs=sc.nextDouble();
			//condition for balls we need below 3 steps
			stringovers=Double.toString(overs);
			ch=stringovers.toCharArray();
			balls=Character.getNumericValue(ch[3]);
		}//end  while loop
		return overs;
	}
	public static void diplayScore(String team,int score,int wickets){
		System.out.println("Score Board Of "+team+" is "+score+"-"+wickets);
	}
	public static double getRunrate(String team) {
		System.out.println("Enter RunRate By "+team);
		double runrate=sc.nextDouble();
		return runrate;
	}
	public static int calculateScore(double runrate,double overs) {
		double dscore=runrate*overs;
		int score=(int) dscore;
		return score;
	}
	public static int getWickets(double dovers){
		int overs=(int) dovers;
		if(overs<=10){
			return 1;
		}
		else if (overs>10 && overs<=15) {
			return 2;
		}
		else if (overs>15 && overs<=20) {
			return 3;
		}else if (overs>20 && overs<=25) {
			return 4;
		}else if (overs>25 && overs<=30) {
			return 5;
		}else if (overs>30 && overs<=35) {
			return 6;
		}else if (overs>35 && overs<=40) {
			return 7;
		}else if (overs>40 && overs<=45) {
			return 8;
		}else {
			return 10;
		} 


	}

}

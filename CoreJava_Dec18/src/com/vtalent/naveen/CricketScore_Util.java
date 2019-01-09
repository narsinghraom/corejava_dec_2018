package com.vtalent.naveen;

import java.util.Scanner;



public class CricketScore_Util {
	public static int getScore(String team) {
        
		//taking scores
		String hi="300-4";
		String me="210-7";
		String lo="175-9";
		//create scanner class
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter Overs Played By "+team);
		double overs=sc.nextDouble();
         
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

		System.out.println("Enter RunRate By "+team);
		double runrate=sc.nextDouble();
		if(runrate>=6.0) {
			System.out.println("ScoreCard Of "+team+" is "+hi);
			return 300;
		}//end if
		else if (runrate>4.5 && runrate<6.0) {
			System.out.println("ScoreCard Of "+team+" is "+me);

			return 210;
		}//end else-if
		else {
			System.out.println("ScoreCard Of "+team+" is "+lo);
			return 175;
		}//end else

	}//end getScore method
}//end class

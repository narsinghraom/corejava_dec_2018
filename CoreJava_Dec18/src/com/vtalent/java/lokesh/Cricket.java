package com.vtalent.java.lokesh;

import java.util.*;

	class CricketInnings {
		static Scanner s=new Scanner(System.in);
		static String teamA,teamB;
		static int  score1,score2;
		public void match() {
			System.out.println("enter the teamA name");
			teamA= s.next();
			System.out.println("enter the teamB name");
			teamB = s.next();
			System.out.println("welcome the ODI match bewteen" +teamA+ "vs" +teamB+ ".");
		}
		public void firstinnings() {
			System.out.println("check if it is raining yes/no");
			String check = s.next();
			if (check.equals("yes")) {
				System.out.println("it is rainning after 1 hour yes/no");
				String hour =s.next();
				if(hour.equals("yes")) {
					System.out.println("if it is rainning after 2 hour yes/no");
					String two =s.next();
					if(two.equals("no")) {
					}
				}
				System.out.println("overs played by" +teamA+ " .");
				double d= s.nextDouble();
				System.out.println("runrate of "+teamA+".");
				double c=s.nextDouble();
				score1=(int) (d*c);
				if(d<=50 && c<=25.5) {
					int wickets=1;
					System.out.println("score of " +teamA+ "=" +score1+ "/" +wickets);
				}
			}
	
		}
	
		public void SecondInnings() {
			System.out.println("check if it is rainning yes/no");
			String check =s.next();
			if(check.equals("yes")) {
				System.out.println("if it is rainning after 1 hour");
				String one =s.next();
				if(one.equals("yes")) {
					System.out.println("check if it is rainning after 2 hour");
				String three = s.next();
				if(three.equals("no")) {
				
}
			System.out.println("overs played by" +teamB+ ".");
			double d =s.nextDouble();
			System.out.println("runrate of" +teamB+ ".");
			double c=s.nextDouble();
			score2 =(int) (d*c);
			if(d<=50 && c<=9.5) {
				
				int wickets =9;
				System.out.println("score of" +teamB+ "=" +score2+ "/" +wickets);
				
			}
			if(score1==score2) {
				System.out.println("Match Tie.");
			}else if(score1<score2) {
				int result = score2 - score1;
				System.out.println(teamB+ " won by"+result+" runs.");
			}else if(score2<score1) {
				int result = score1-score2;
				System.out.println(teamA+ " won by"+result+" runs.");
			}
			
		}
			}
			
		}
public static class Cricket {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		CricketInnings ci=new CricketInnings();
		ci.match();
		ci.firstinnings();
		ci.SecondInnings();
	
		
	}
	}
}

	



	



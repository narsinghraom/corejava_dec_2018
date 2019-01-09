package com.vtalent.hanu.classtask;

import java.util.Scanner;

public class Test_Cricket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Match match=new MatchImpl();
		
		Scanner s= new Scanner(System.in);
		System.out.println("Enter Teams..");
		System.out.println("1st Innings..:");
		System.out.println("Enter First Team :");
		String team1=s.next();
		
		Team t1= new Team(team1);
		
		double score1=match.score(t1);
				
		System.out.println();
		System.out.println("2nd Innings..");
		System.out.println("Enter Second Team :");
		String team2= s.next();
		
		Team t2= new Team(team2);
		
		double score2=match.score(t2);
		
		System.out.println("-------");
		System.out.println(team1+" Score is "+ score1+" "+team2+" Score is "+score2);
		
		System.out.println(match.winner(t1,t2));
		
		
		
		
		
		
	}

}

package com.vtalent.naveen;

import java.util.Scanner;

public class CricketScore_Example {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//team1
		System.out.println("Please Enter Team One Name");
		String str1=sc.next();
		String team1=str1.toUpperCase();
		//team2
		System.out.println("Please Enter Team Two Name");
		String str2=sc.next();
		String team2=str2.toUpperCase();
		System.out.println("Cricket Match Between "+team1+" v/s "+team2);
		//team1
		System.out.println("First Innings By "+team1);
		int score1=CricketScore_Util.getScore(team1);
		//team2
		System.out.println("Second Innings By "+team2);
		int score2=CricketScore_Util.getScore(team2);
		if(score1>score2) {
			if(score1==300 && score2==210) {
				System.out.println(team1+" Won the Match by 90 Runs");
			}//end inner if
			else if (score1==300 && score2==175) {
				System.out.println(team1+" Won the Match by 125 Runs");
			} //end inner else-if
			else {
				System.out.println(team1+" Won the Match by 35 Runs");
			}//end inner else
		}//end outer if
		else if(score1<score2){

			if(score2==300 && score1==210) {
				System.out.println(team2+" Won the Match by 90 Runs");
			}//end inner if
			else if (score2==300 && score1==175) {
				System.out.println(team2+" Won the Match by 125 Runs");
			} //end inner else-if
			else {
				System.out.println(team2+" Won the Match by 35 Runs");
			}//end inner else
		}//end outer else-if
		else {
			System.out.println("Draw Match.......Will Go For Super Over");
		}//end outer else
	}//end main
}//end class

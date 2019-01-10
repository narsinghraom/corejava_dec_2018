 package com.vtalent.naveen;

import java.util.Scanner;


public class CricketScore_Test {

	public static void main(String[] args) {
		//create scanner class object
		Scanner sc=new Scanner(System.in);
		CricketScore cscore=new CricketScore();
		//read team1 name from input
		System.out.println("Please Enter Team One Name");
		String team1=sc.next().toUpperCase();

		//read team2 name from input
		System.out.println("Please Enter Team Two Name");
		String team2=sc.next().toUpperCase();
		//display both the team names
		System.out.println("Cricket Match Between "+team1+" v/s "+team2);
		//team1 innings...
		System.out.println("First Innings By "+team1);
		System.out.println("Enter Overs Played By "+team1);
		double fovers=sc.nextDouble();
		//overs calculating for team1....
		double calfovers=Util.calculateOvers(team1, fovers);
		//setting team1 overs to java bean
		cscore.setFteamovers(calfovers);
		double frunrate=Util.getRunrate(team1);
		//set team1 run rate to java bean
		cscore.setFteamrunrate(frunrate);
 
		//calculate score for team1
		int team1score=Util.calculateScore(cscore.getFteamrunrate(),cscore.getFteamovers());
		cscore.setFteamscore(team1score);
		//get team1 wickets
		int team1wicks=Util.getWickets(cscore.getFteamovers());
		//set wickets to java bean
		cscore.setFteamwickets(team1wicks);
		Util.diplayScore(team1,cscore.getFteamscore(),cscore.getFteamwickets());

		//team2 innings...
		System.out.println("Second Innings By "+team2);
		System.out.println("Enter Overs Played By "+team2);
		double sovers=sc.nextDouble();
		double calsovers=Util.calculateOvers(team2, sovers);
		//set team2 overs to java bean
		cscore.setSteamovers(calsovers);
		double srunrate=Util.getRunrate(team1);
		//set team2 run rate to java bean
		cscore.setSteamrunrate(srunrate);
		int team2score=Util.calculateScore(cscore.getSteamrunrate(),cscore.getSteamovers());
		cscore.setSteamscore(team2score);

		//get team2 wickets
		int team2wicks=Util.getWickets(cscore.getSteamovers());
		//set wickets to java bean
		cscore.setSteamwickets(team2wicks);
		Util.diplayScore(team2,cscore.getSteamscore(),cscore.getSteamwickets());
		//final result
		if(cscore.getFteamscore()>cscore.getSteamscore()){
			System.out.println(team1+" Won The Match By "+(cscore.getFteamscore()-cscore.getSteamscore())+" Runs");
		}
		else if (cscore.getFteamscore()<cscore.getSteamscore()) {
			System.out.println(team2+" Won The Match By "+(cscore.getSteamscore()-cscore.getFteamscore())+" Runs");
		}
		else {
			System.out.println("Draw Match......");
		}
	}
}

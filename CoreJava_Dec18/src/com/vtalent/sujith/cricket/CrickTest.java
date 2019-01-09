package com.vtalent.sujith.cricket;

import java.util.Scanner;

public class CrickTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		CrickInfo info=new CrickInfo();
		CrickBuzz buzz=new CrickBuzz();
		CrickInfo cricInfo = CrickBuzz.getCrickInfo();
		
		System.out.println("Enter Team One name");
		String teamOne=sc.next();
		buzz.teamOneName(teamOne);
		
		System.out.println("Enter Team Two name");
		String teamTwo=sc.next();		
		buzz.teamTwoName(teamTwo);
		

		System.out.println("Match b/w "+teamOne+" v/s"+teamTwo+"  1st Innings By");
		String finnings=sc.next();
		buzz.firstInnings(finnings);
		
		
		System.out.println("Enter Overs played By first innings "+cricInfo.getFirstinnings());
		double fOvers=sc.nextDouble();
		buzz.fOvers(fOvers);
		
		System.out.println("Enter Runrate By first innings "+cricInfo.getFirstinnings());
		double fRunrate=sc.nextDouble();
		buzz.fRunrate(fRunrate);
				
		buzz.fScore();
		
		System.out.println("Match b/w "+teamOne+" v/s "+teamTwo+"  2nd Innings By");
		String sInnings=sc.next();		
		buzz.secondInnings(sInnings);
		
		System.out.println("Enter overs Played by "+cricInfo.getSecondinnings());
		double sOvers=sc.nextDouble();
		buzz.sOvers(sOvers);
		
		System.out.println("Enter Runrate By "+cricInfo.getSecondinnings());
		double sRunrate=sc.nextDouble();
		buzz.sRunrate(sRunrate);
		
		buzz.sScore();
		
		buzz.winTeam();
		
		
//		
//		System.out.println(cricInfo.getFirstinnings());
//		System.out.println(cricInfo.getSecondinnings());
//		System.out.println(cricInfo.getfRunrate());
//		System.out.println(cricInfo.getsRunrate());
//		System.out.println(cricInfo.getfScore());
//		System.out.println(cricInfo.getsScore());
//		System.out.println(cricInfo.getfWickets());
//		System.out.println(cricInfo.getsWickets());
	}
	
	

}

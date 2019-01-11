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
		//buzz.teamOneName(teamOne);
		cricInfo.setTeamonename(teamOne);
		
		System.out.println("Enter Team Two name");
		String teamTwo=sc.next();		
		//buzz.teamTwoName(teamTwo);
		cricInfo.setTeamtwoname(teamTwo);

		System.out.println("Match b/w "+teamOne+" v/s"+teamTwo+"  1st Innings By");
		String finnings=sc.next();
		cricInfo.setFirstinnings(finnings);
		
		System.out.println("Enter Overs played By first innings "+cricInfo.getFirstinnings());
		double fOvers=sc.nextDouble();
		Double o=buzz.fOvers(fOvers);
		cricInfo.setfOvers(o);
		
		System.out.println("Enter Runrate By first innings "+cricInfo.getFirstinnings());
		double fRunrate=sc.nextDouble();
		buzz.fRunrate(fRunrate);
		cricInfo.setfRunrate(fRunrate);
				
		buzz.fScore();
		
		System.out.println("Match b/w "+teamOne+" v/s "+teamTwo+"  2nd Innings By");
		String sInnings=sc.next();		
		buzz.secondInnings(sInnings);
		cricInfo.setSecondinnings(sInnings);
		
		System.out.println("Enter overs Played by "+cricInfo.getSecondinnings());
		double sOvers=sc.nextDouble();
		buzz.sOvers(sOvers);
		cricInfo.setsOvers(sOvers);
		
		System.out.println("Enter Runrate By "+cricInfo.getSecondinnings());
		double sRunrate=sc.nextDouble();
		buzz.sRunrate(sRunrate);
		cricInfo.setsRunrate(sRunrate);
		
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

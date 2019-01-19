package com.vtalent.sujith.cricket;

import java.util.Scanner;


public class CrickBuzz {

	
	static CrickInfo info=new CrickInfo();
	Scanner sc=new Scanner(System.in);

	/*public void teamOneName(String teamOne) {
		info.setTeamonename(teamOne);
	}
	
	public void teamTwoName(String teamTwo) {
		info.setTeamtwoname(teamTwo);
	}*/
	
	public void firstInnings(String fInnings, String report) {
			if(report.equalsIgnoreCase("yes")) {
				//reducedOvers();
			}
		
	     	else if(fInnings.equals(info.getTeamonename()) || fInnings.equals(info.getTeamtwoname())){					
					
					info.setFirstinnings(fInnings);	
				//System.out.println(info.getFirstinnings());
			}
			else
			{
				System.out.println("please enter correct team name");
				System.out.println("Match b/w "+info.getTeamonename()+" v/s "+info.getTeamtwoname()+" 1st Innings By");
				String finnings=sc.next();
				firstInnings(finnings,report);
				}
		
		
	}
	
	public void secondInnings(String sInnings) {
		String nm= info.getFirstinnings();
		//System.out.println(nm);
		if(sInnings.equals(info.getTeamonename()) || sInnings.equals(info.getTeamtwoname())){
			if(sInnings.equals(nm)) {
			
				
				System.out.println("please enter correct team name");
				System.out.println("Match b/w "+info.getTeamonename()+" v/s "+info.getTeamtwoname()+"  2nd Innings By");
				String sinnings=sc.next();
				secondInnings(sinnings);
		
		}
			else
			{
				info.setSecondinnings(sInnings);
			}
		}
		else
		{
			System.out.println("please enter correct team name 2");
			System.out.println("Match b/w "+info.getTeamonename()+" v/s "+info.getTeamtwoname()+"  2nd Innings By");
			String sinnings=sc.next();
			secondInnings(sinnings);
		}
		
		
		
	}
	
	public double fOvers(double fOvers) {
		
		String stringOvers=Double.toString(fOvers);
		char[] ch=stringOvers.toCharArray();
		int balls=Character.getNumericValue(ch[3]);
	
		if(fOvers>50.0 || balls<6) {
		//info.setfOvers(fOvers);
			System.out.println("Entered overs is correct");
			return fOvers;
		}
		else {
			System.out.println("please enter correct format");
			System.out.println("Enter Overs played By first innings ");
			double fOvers1=sc.nextDouble();
			fOvers(fOvers1);
		}
		return fOvers;
		
		
	}
	
	public void sOvers(double sOvers) {
		info.setsOvers(sOvers);
	}
	
	public void fRunrate(double fRunrate) {
		info.setfRunrate(fRunrate);
	}
	
	public void sRunrate(double sRunrate) {
		info.setsRunrate(sRunrate);
	}
	
	public int fScore() {
		int wkt=fWickets(info.getfRunrate(), info.getfScore());
		int fScore=(int)(info.getfOvers()*info.getfRunrate());
		info.setfScore(fScore);
		System.out.println(info.getFirstinnings()+" score "+fScore+"/"+wkt);
		return fScore;	
	}
	
	public void sScore() {
		int wkt=sWickets(info.getsRunrate());
		int sScore=(int)(info.getsOvers()*info.getsRunrate());
		info.setsScore(sScore);
		System.out.println(info.getSecondinnings()+" score "+sScore+"/"+wkt);	
	}
	
	public void winTeam() {
		if(info.getfScore()>info.getsScore()) {
			int winScore=info.getfScore()-info.getsScore();
			//System.out.println("score is "+winScore);
			System.out.println(info.getFirstinnings()+" win by  "+winScore+" runs");
		}
		else if(info.getfScore()==info.getsScore()){
			System.out.println("Match is drawn");
		}
		else if(info.getfScore()<info.getsScore())
		{
			int wkt=10-info.getsWickets();
			System.out.println(info.getSecondinnings()+" win by  "+wkt+" wickets");
		}
		
	}
	public int fWickets(double frunrate,double fovers) {
		if(fovers<50) {
			info.setfWickets(10);
		}
		else if(frunrate>6.0) {
			info.setfWickets(3);
		}
		else if(frunrate>=5.0 && frunrate<=6.0) {
			info.setfWickets(5);
			
		}
		else {
			info.setfWickets(8);
		}
		
		return info.getfWickets();
	}
	public int sWickets(double srunrate) {
		if(info.getsOvers()<50.0) {
			if(info.getfScore()<info.getsScore()) {
				info.setsWickets(2);
			}
			else
			{
				info.setsWickets(10);
			}
			
		}
		else if(srunrate>6) {
			info.setsWickets(3);
		}
		else if(srunrate>5 && srunrate<=6.0) {
			info.setsWickets(5);
			
		}
		else {
			info.setsWickets(8);
		}
		return info.getsWickets();
	}
	public void weatherReport(String report) {
		if(report.equalsIgnoreCase("yes")) {
			System.out.println("Still rainy after 1.5 hr");
			String report2=sc.next();
			 if(report2.equalsIgnoreCase("yes")) {
				 
				 
			 }
			 else if(report.equalsIgnoreCase("no")) {
				 String fInnings=sc.next();
				 firstInnings(fInnings, fInnings);
				 double overs=sc.nextDouble();
				 reducedOvers(overs);
			 }
		}
		else if(report.equalsIgnoreCase("no")) {
			String fInnings=sc.next();
			firstInnings(fInnings, fInnings);
		}
		
	}
	public double reducedOvers(double Overs) {
		String stringOvers=Double.toString(Overs);
		char[] ch=stringOvers.toCharArray();
		int balls=Character.getNumericValue(ch[3]);
	
		if(Overs>40.0 || balls<6) {
		//info.setfOvers(fOvers);
			System.out.println("Entered overs is correct");
			//return fOvers;
		}
		else {
			System.out.println("please enter correct format");
			System.out.println("Enter Overs played By first innings ");
			double fOvers1=sc.nextDouble();
			reducedOvers(fOvers1);
		}
		
		return Overs;
		
	}
	public static CrickInfo getCrickInfo() {
		return info;
	}
	}
	

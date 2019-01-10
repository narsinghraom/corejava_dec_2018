package com.vtalent.hanu.classtask;

import java.util.Scanner;

public class Team {
	
	private String team;
	
	private double overs;
	
	private double runrate;
	
	private int score;
	
	public Team(String team) {
		Scanner s= new Scanner(System.in);
		this.team=team;
		System.out.println("enter runrate");
		this.runrate=s.nextDouble();
		double d=Conditions .checkRead();
		this.overs=d;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public double getOvers() {
		return overs;
	}

	public void setOvers(double overs) {
		this.overs = overs;
	}

	public double getRunrate() {
		return runrate;
	}

	public void setRunrate(double runrate) {
		this.runrate = runrate;
	}
}

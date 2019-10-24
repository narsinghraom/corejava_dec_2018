package com.vtalent.java.venkatesh;

import java.util.*;

class CricketInnings extends Exception{
	public String toString() {
	System.out.println("overs should be less than 50");	
		return null;
	}
	static Scanner sc=new Scanner(System.in);
	static String teamA,teamB;
	static int scoreA,scoreB;
	public void sample() {
		System.out.println("enter teamA name");
		teamA=sc.nextLine();
		System.out.println("enter teamB name");
		teamB=sc.nextLine();
		System.out.println("welcome to odi between " +teamA+ " vs " +teamB+ ".");
	}
	public void firstinnings() throws Exception {
		System.out.println("First Innings by"+teamA+".");
		System.out.println(" Is it raining yes or no ");
		String ri=sc.next();
		if(ri.equals("no")) {
			System.out.println("overs played by" +teamA+ ".");
			double d=sc.nextDouble();
			System.out.println("runrate of" +teamA+ ".");
			double d1=sc.nextDouble();
			scoreA=(int)(d*d1);
			if(d>50) {
				throw new CricketInnings();
			}
			if(d==50) {
				int wickets = 6;
				System.out.println("score of " +teamA+ "=" +scoreA+ "/" +wickets);
				secondinnings();
			}else
			if(d<50) {
				int wickets=10;
				System.out.println("score of" +teamA+ "=" +scoreA+ "/" +wickets);
				secondinnings();
			}
		}else{
			System.out.println("is it raining after 1hour yes or no");
			String ri1=sc.next();
			if(ri1.equals("no")) {
				System.out.println("overs reduced to 40");
				System.out.println("overs played by" +teamA+ ".");
			    double d=sc.nextDouble();
				System.out.println("runrate of" +teamA+ ".");
				double d1=sc.nextDouble();
				scoreA=(int)(d*d1);
				if(d<=40 && d1<=5.5) {
					int wickets=10;
					System.out.println("score of" +teamA+ "=" +scoreA+ "/" +wickets);
					secondinnings();
					}
				}else {
					System.out.println("is it raining after2hours yes or no");
					String ri2=sc.next();
					if(ri2.equals("no")) {
						System.out.println("overs reduced to 30");
						System.out.println("overs played by" +teamA+ ".");
						double d=sc.nextDouble();
						System.out.println("runrate of" +teamA+ ".");
						double d1=sc.nextDouble();
						scoreA=(int)(d*d1);
						if(d<=30 && d1<=7) {
							int wickets=10;
							System.out.println("score of" +teamA+ "=" +scoreA+ "/" +wickets);
							secondinnings();
						}
					}else {
						System.out.println("is it ranning after 3hours yes or no");
						String ri3=sc.next();
						if(ri3.equals("no")) {
							System.out.println("overs reduced to 15");
							System.out.println("overs played by" +teamA+ ".");
							double d=sc.nextDouble();
							System.out.println("runrate of" +teamA+ ".");
							double d1=sc.nextDouble();
							scoreA=(int)(d*d1);
							if(d<=15 && d1<=8) {
								int wickets=10;
								System.out.println("score of " +teamA+ "=" +scoreA+ "/" +wickets);
								secondinnings();
								}
							}else {
								System.out.println("match abonded due to rain");
								}
						}
					}
			}}
	public static void secondinnings() throws Exception {
		System.out.println("Second Innings by"+teamB+".");
		System.out.println(" Is it raining yes or no ");
		String ri=sc.next();
		if(ri.equals("no")) {
			System.out.println("overs played by" +teamB+ ".");
			double d=sc.nextDouble();
			System.out.println("runrate of" +teamB+ ".");
			double d1=sc.nextDouble();
			scoreB=(int)(d*d1);
			if(d>50) {
				throw new CricketInnings();
			}
			if(d==50) {
				int wickets = 6;
				System.out.println("score of " +teamB+ "=" +scoreB+ "/" +wickets);		
			}else
			if(d<50) {
				int wickets=10;
				System.out.println("score of" +teamB+ "=" +scoreB+ "/" +wickets);
			}
			if(scoreB==scoreA) {
				System.out.println("match tied");
			}else if(scoreB<scoreA) {
				int s=scoreA - scoreB;
				System.out.println( teamA+ "won by" +s+ "runs.");
			}else if(scoreB>scoreA) {
				int s=scoreB - scoreA;
				System.out.println(teamB+ "won by" +s+ "runs.");
			}
		}else{
			System.out.println("is it raining after 1hour yes or no");
			String ri1=sc.next();
			if(ri1.equals("no")) {
				System.out.println("overs reduced to 30");
				System.out.println("overs played by" +teamB+ ".");
			    double dd=sc.nextDouble();
				System.out.println("runrate of" +teamB+ ".");
				double dd1=sc.nextDouble();
				scoreB=(int)(dd*dd1);
				if(dd<=30 && dd1<=5.5) {
					int wickets=10;
					System.out.println("score of" +teamB+ "=" +scoreB+ "/" +wickets);
					}if(scoreA==scoreB) {
						System.out.println("match tied");
					}else if(scoreA>scoreB) {
						int ss=scoreA-scoreB;
						System.out.println( teamA+ "won by" +ss+ "runs.");
					}else if(scoreB>scoreA) {
						int ss1=scoreB-scoreA;
						System.out.println(teamB+ "won by" +ss1+ "runs.");
					}
				}else {
					System.out.println("is it raining after2hours yes or no");
					String ri2=sc.next();
					if(ri2.equals("no")) {
						System.out.println("overs reduced to 30");
						System.out.println("overs played by" +teamB+ ".");
						double dd=sc.nextDouble();
						System.out.println("runrate of" +teamB+ ".");
						double dd1=sc.nextDouble();
						scoreB=(int)(dd*dd1);
						if(dd<=30 && dd1<=7) {
							int wickets=10;
							System.out.println("score of" +teamB+ "=" +scoreB+ "/" +wickets);
						}
						if(scoreA==scoreB) {
							System.out.println("match tied");
						}else if(scoreA>scoreB) {
							int sss=scoreA-scoreB;
							System.out.println( teamA+ "won by" +sss+ "runs.");
						}else if(scoreB>scoreA) {
							int ss2=scoreB-scoreA;
							System.out.println(teamB+ "won by" +ss2+ "runs.");
						}
					}else {
						System.out.println("is it raing after 3hours yes or no");
						String ri3=sc.next();
						if(ri3.equals("no")) {
							System.out.println("overs reduced to 15");
							System.out.println("overs played by" +teamB+ ".");
							double dd=sc.nextDouble();
							System.out.println("runrate of" +teamB+ ".");
							double dd1=sc.nextDouble();
							scoreB=(int)(dd*dd1);
							if(dd<=15 && dd1<=8) {
								int wickets=10;
								System.out.println("score of " +teamB+ "=" +scoreB+ "/" +wickets);
								}if(scoreA==scoreB) {
									System.out.println("match tied");
								}else if(scoreA>scoreB) {
									int sss1=scoreA-scoreB;
									System.out.println( teamA+ "won by" +sss1+ "runs.");
								}else if(scoreB>scoreA) {
									int ss2=scoreB-scoreA;
									System.out.println(teamB+ "won by" +ss2+ "runs.");
								}
							}else {
								System.out.println("match abonded due to rain");
								}
						}
					}
			}}
		
		
	}

public class Cricket {
public static void main(String[] args) throws Exception {
	Scanner sc1=new Scanner(System.in);
	CricketInnings ci=new CricketInnings();
	ci.sample();
	ci.firstinnings();
	
	
	
}
}

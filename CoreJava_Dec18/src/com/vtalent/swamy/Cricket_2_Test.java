package com.vtalent.swamy;

import java.util.Scanner;

import com.vtalent.saichand.object20;

public class Cricket_2_Test {
	static Scanner sc = new Scanner(System.in);
	static Cricket_2_TeamA teamA;
	static Cricket_2_TeamB teamB;
	static boolean fiftyOversFlag;
	static boolean fourtyOversFlag;
	static boolean matchAborned;

	public static void main(String[] args) {
		teamA = new Cricket_2_TeamA();
		teamB = new Cricket_2_TeamB();
		Cricket_2_Exceptions ce = new Cricket_2_Exceptions();
		System.out.println("Enter Team A Name");
		teamA.setTeamAName(sc.next());
		System.out.println("Enter Team B Name");
		teamB.setTeamBName(sc.next());
		System.out.println("this match between  " + teamA.getTeamAName() + "  v/s  " + teamB.getTeamBName());
		firstInnings();
		if (!matchAborned);
		secondInnings();
		winning(teamA.getScore(), teamB.getScore());
	}

	/*
	 * @Override public String toString() { return "Cricket_2_Test [toString()=" +
	 * super.toString() + "]"; }
	 */
	public static void firstInnings() {
		System.out.println("First Innings played by  " + teamA.getTeamAName());
		rainCheck();
		if (fiftyOversFlag) {
			System.out.println("Enter overs by  " + teamA.getTeamAName());
			float overs = sc.nextFloat();
			if (overs > 50) {
				try {
					throw new Cricket_2_Exceptions.Fiftyovers();
				} catch (Cricket_2_Exceptions.Fiftyovers e) {
					System.out.println(e);
				}
			} else {
				teamA.setOvers(overs);
			}
		} else {
			System.out.println("Enter overs by  " + teamA.getTeamAName());
			float overs = sc.nextFloat();
			if (overs > 40) {
				try {
					throw new Cricket_2_Exceptions.FourtyOvers();
				} catch (Cricket_2_Exceptions.FourtyOvers e) {
					System.out.println(e);
				}

			} else {
				teamA.setOvers(overs);
			}
		}
		System.out.println("enter runrate by  " + teamA.getTeamAName());
		teamA.setRunrate(sc.nextFloat());
		
		calculateScore(teamA.getOvers(), teamA.getRunrate(), teamA);
		System.out.println(teamA.getTeamAName() + " Score  " + teamA.getScore() + "/" + teamA.getWickets());
	}

	public static void calculateScore(float overs, float run, Object o) {
		int score = (int) (overs * run);
		int wickets = 0;
		if (fiftyOversFlag) {
			if (overs <= 30) {
				wickets = 6;
			} else if (overs <= 40) {
				wickets = 8;
			} else if (overs >= 40) {
				wickets = 10;
			}
		} else {
			if (overs <= 30) {
				wickets = 6;
			} else if (overs <= 40) {
				wickets = 8;
			} else if (overs >= 40) {
				wickets = 10;
			}
		}
		if (o instanceof Cricket_2_TeamA) {
			teamA.setScore(score);
			teamA.setWickets(wickets);
		} else {
			teamB.setScore(score);
			teamB.setWickets(wickets);
		}

	}

	private static void rainCheck() {
		System.out.println("Is raining  yes/no");
		String condition1 = sc.next();
		if (condition1.equalsIgnoreCase("yes")) {
			System.out.println("is raining 3 hours");
			String condition2 = sc.next();
			if (condition2.equalsIgnoreCase("yes")) {
				try {
					matchAborned = true;
					throw new Cricket_2_Exceptions();
				} catch (Cricket_2_Exceptions e) {
					System.out.println(e);
				}
			} else {
				fourtyOversFlag = true;
			}
		} else
			fiftyOversFlag = true;
	}

	public static void secondInnings() {
		System.out.println("played by" + teamB.getTeamBName());
		rainCheck();
		if (fiftyOversFlag) {
			System.out.println("Enter overs by  " + teamB.getTeamBName());
			float overs = sc.nextFloat();
			if (overs > 50) {
				try {
					throw new Cricket_2_Exceptions.Fiftyovers();
				} catch (Cricket_2_Exceptions.Fiftyovers e) {
					System.out.println(e);
				}
			} else {
				teamB.setOvers(overs);
			}
		} else {
			System.out.println("Enter overs by  " + teamB.getTeamBName());
			float overs = sc.nextFloat();
			if (overs > 40) {
				try {
					throw new Cricket_2_Exceptions.FourtyOvers();
				} catch (Cricket_2_Exceptions.FourtyOvers e) {
					System.out.println(e);
				}
			} else {
				teamB.setOvers(overs);
			}
		}
		System.out.println("enter runrate by  " + teamB.getTeamBName());
		teamB.setRunrate(sc.nextFloat());
		calculateScore(teamB.getOvers(), teamB.getRunrate(), teamB);
		System.out.println(teamB.getTeamBName() + " Score " + teamB.getScore() + "/" + teamB.getWickets());
		
	}

	public static void winning(int teamA, int teamB) {
		if (teamA == teamB) {
			try {
				throw new Cricket_2_Exceptions.MatchTie();
			} catch (Cricket_2_Exceptions.MatchTie e) {
				System.out.println(e);
			}
		} else if (teamA > teamB) {
			System.out.println("teamA " +teamA+ " Win The Match");
		} else {
			System.out.println("teamB "+teamB + " Win The Match");
		}
	}

}

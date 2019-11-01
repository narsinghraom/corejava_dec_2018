package com.vtalent.prashanth;

import java.util.*;

class OversException extends Exception {
	public String toString() {
		return "Overs Excepion.";
	}
}

class BallsException extends Exception {
	public String toString() {
		return "Balls Exception.";
	}
}

class CricketInnings {
	
	static String teamA,teamB;
	static int totalA,totalB;
	static double ov;
	static Scanner sc1 = new Scanner(System.in);
	
	public void sample() throws OversException {
		System.out.println("Please enter Team A name: ");
		teamA = sc1.nextLine();
		System.out.println("Please enter Team B name: ");
		teamB = sc1.nextLine();
		System.out.println("Welcome to ODI between " + teamA + " vs " + teamB + "... ");
		firstInnings();
	}
	
	public static void firstInnings() throws OversException {
		System.out.println("First Innings by " + teamA + ". ");
		System.out.println("Is Raining yes or no.");
		String ra = sc1.next();
		double rrA;
		int wickets;
		if(ra.equals("no")) {
			System.out.println("Enter the overs Played by " + teamA + ". ");
			overs50try();
			System.out.println("Enter the Runrate Played by " + teamA +". ");
			rrA = sc1.nextDouble();
			totalA = (int) ( ov * rrA);
			if(ov == 50 && rrA <= 5.50) {
				wickets = 9;
				System.out.println("Total score by " + teamA + ": " + totalA + "/" +wickets);
				secondInnings();
			}else if(ov == 50 && rrA > 5.50) {
				wickets = 6;
				System.out.println("Total score by " + teamA + ": " + totalA + "/" +wickets);
				secondInnings();
			}else if(ov < 50) {
				wickets = 10;
				System.out.println("Total score by " + teamA + ": " + totalA + "/" +wickets);
				secondInnings();
			}
		}else {
			System.out.println("The match was interrupted due to rain please stay for the further updates.");
			System.out.println("Is Raining after Two hours yes or no.");
			String ra1 = sc1.next();
			if(ra1.equals("no")) {
				System.out.println("Overs reduced to 40 overs per side.");
				System.out.println("Enter the overs Played by " + teamA + ". ");
				overs40try();
				System.out.println("Enter the Runrate Played by " + teamA +". ");
				rrA = sc1.nextDouble();
				totalA = (int) ( ov * rrA);
				if(ov == 40 && rrA <= 5.50) {
					wickets = 9;
					System.out.println("Total score by " + teamA + ": " + totalA + "/" +wickets);
					secondInnings();
				}else if(ov == 40 && rrA > 5.50) {
					wickets = 6;
					System.out.println("Total score by " + teamA + ": " + totalA + "/" +wickets);
					secondInnings();
				}else if(ov < 40) {
					wickets = 10;
					System.out.println("Total score by " + teamA + ": " + totalA + "/" +wickets);
					secondInnings();
				}
			}else {
				System.out.println("The match was interrupted due to rain please stay for the further updates.");
				System.out.println("Is Raining after Three hours yes or no.");
				String ra2 = sc1.next();
				if(ra2.equals("no")) {
					System.out.println("Overs reduced to 30 overs per side.");
					System.out.println("Enter the overs Played by " + teamA + ". ");
					overs30try();
					ov = sc1.nextDouble();
					System.out.println("Enter the Runrate Played by " + teamA +". ");
					rrA = sc1.nextDouble();
					totalA = (int) ( ov * rrA);
					if(ov == 30 && rrA <= 5.50) {
						wickets = 9;
						System.out.println("Total score by " + teamA + ": " + totalA + "/" +wickets);
						secondInnings();
					}else if(ov == 30 && rrA > 5.50) {
						wickets = 6;
						System.out.println("Total score by " + teamA + ": " + totalA + "/" +wickets);
						secondInnings();
					}else if(ov < 30) {
						wickets = 10;
						System.out.println("Total score by " + teamA + ": " + totalA + "/" +wickets);
						secondInnings();
					}
				}else {
					System.out.println("Match between " + teamA + " vs " + teamB + " Abonded due to Rain.");
					System.exit(0);
				}
			}
		}
	}

	public static void overs50try() {
		try {
			ov = sc1.nextDouble();
			if(ov > 50) {
				throw new OversException();
			}else {
				System.out.println("No Overs Exception. ");
				balls();
			}
		}catch(Exception e){
			System.out.println("Exception occured: " + e);
			System.out.println("Please enter less than or equals to 50 overs");
			overs50try();
		}
		
	}
	
	public static void overs40try() {
		try {
			ov = sc1.nextDouble();
			if(ov > 40) {
				throw new OversException();
			}else {
				System.out.println("No Overs Exception. ");
				balls1();
			}
		}catch(Exception e){
			System.out.println("Exception occured: " + e);
			System.out.println("Please enter less than or equals to 40 overs");
			overs40try();
		}
	}
	
	public static void overs30try() {
		try {
			ov = sc1.nextDouble();
			if(ov > 30) {
				throw new OversException();
			}else {
				System.out.println("No Overs Exception. ");
				balls2();
			}
		}catch(Exception e){
			System.out.println("Exception occured: " + e);
			System.out.println("Please enter less than or equals to 30 overs");
			overs30try();
		}
	}

	public static void overs20try() {
		try {
			ov = sc1.nextDouble();
			if(ov > 20) {
				throw new OversException();
			}else {
				System.out.println("No Overs Exception. ");
				balls3();
			}
		}catch(Exception e){
			System.out.println("Exception occured: " + e);
			System.out.println("Please enter less than or equals to 20 overs");
			overs20try();
		}
	}
	
	public static void balls() {
		String o = " " + ov;
		char chArr[] = o.toCharArray();
		int intArr[] = new int[o.length()];
		for(int i=0;i<o.length();i++ ) {
			intArr[i] = chArr[i];
		}		
		try {
			int last = intArr[intArr.length-1];
			if(last<48 || last>53) {
				throw new BallsException();
			}else {
				System.out.println("No Balls Exception.");
			}
		}catch(Exception e){
			System.out.println("Exception occured: " + e);
			System.out.println("Please enter Balls in between 0-5.");
			overs50try();
		}
	}
	
	public static void balls1() {
		String o = " " + ov;
		char chArr[] = o.toCharArray();
		int intArr[] = new int[o.length()];
		for(int i=0;i<o.length();i++ ) {
			intArr[i] = chArr[i];
		}		
		try {
			int last = intArr[intArr.length-1];
			if(last<48 || last>53) {
				throw new BallsException();
			}else {
				System.out.println("No Balls Exception.");
			}
		}catch(Exception e){
			System.out.println("Exception occured: " + e);
			System.out.println("Please enter Balls in between 0-5.");
			overs40try();
		}
	}

	public static void balls2() {
		String o = " " + ov;
		char chArr[] = o.toCharArray();
		int intArr[] = new int[o.length()];
		for(int i=0;i<o.length();i++ ) {
			intArr[i] = chArr[i];
		}		
		try {
			int last = intArr[intArr.length-1];
			if(last<48 || last>53) {
				throw new BallsException();
			}else {
				System.out.println("No Balls Exception.");
			}
		}catch(Exception e){
			System.out.println("Exception occured: " + e);
			System.out.println("Please enter Balls in between 0-5.");
			overs30try();
		}
	}
	
	public static void balls3() {
		String o = " " + ov;
		char chArr[] = o.toCharArray();
		int intArr[] = new int[o.length()];
		for(int i=0;i<o.length();i++ ) {
			intArr[i] = chArr[i];
		}		
		try {
			int last = intArr[intArr.length-1];
			if(last<48 || last>53) {
				throw new BallsException();
			}else {
				System.out.println("No Balls Exception.");
			}
		}catch(Exception e){
			System.out.println("Exception occured: " + e);
			System.out.println("Please enter Balls in between 0-5.");
			overs20try();
		}
	}
	
	public static void secondInnings() {
		System.out.println("Second Innings by " + teamB + ". ");
		System.out.println("Is Raining yes or no.");
		String ra = sc1.next();
		double rrB;
		int wickets;
		if(ra.equals("no")) {
			System.out.println("Enter the overs Played by " + teamB + ". ");
			overs50try();
			System.out.println("Enter the Runrate Played by " + teamB +". ");
			rrB = sc1.nextDouble();
			totalB = (int) ( ov * rrB);
			if(ov == 50 && rrB <= 5.50) {
				wickets = 9;
				System.out.println("Total score by " + teamB + ": " + totalB + "/" +wickets);
			}else if(ov == 50 && rrB > 5.50) {
				wickets = 6;
				System.out.println("Total score by " + teamB + ": " + totalB + "/" +wickets);
			}else if(ov < 50) {
				wickets = 10;
				System.out.println("Total score by " + teamB + ": " + totalB + "/" +wickets);
			}
			if(totalB == totalA) {
				System.out.println("Match Tie");
			}else if(totalB < totalA) {
				int result = totalA - totalB;
				System.out.println(teamA + " won by " + result + " runs. ");
			}else if(totalB > totalA) {
				int result = totalB - totalA;
				System.out.println(teamB + " won by " + result + " runs. ");
			}
		}else {
			System.out.println("The match was interrupted due to rain please stay for the further updates.");
			System.out.println("Is Raining after Two hours yes or no.");
			String ra1 = sc1.next();
			if(ra1.equals("no")) {
				System.out.println("Overs reduced to 30 overs for " + teamB + " side.");
				System.out.println(teamB + " target is: " + (75*(totalA)/100));
				System.out.println("Enter the overs Played by " + teamB + ". ");
				overs30try();
				System.out.println("Enter the Runrate Played by " + teamB +". ");
				rrB = sc1.nextDouble();
				totalB = (int) ( ov * rrB);
				if(ov == 40 && rrB <= 5.50) {
					wickets = 9;
					System.out.println("Total score by " + teamB + ": " + totalB + "/" +wickets);
				}else if(ov == 40 && rrB > 5.50) {
					wickets = 6;
					System.out.println("Total score by " + teamB + ": " + totalB + "/" +wickets);
				}else if(ov < 40) {
					wickets = 10;
					System.out.println("Total score by " + teamB + ": " + totalB + "/" +wickets);
				}
				if(totalB == (75*(totalA)/100)) {
					System.out.println("Match Tie");
				}else if(totalB < (75*(totalA)/100)) {
					int result = (75*(totalA)/100) - totalB;
					System.out.println(teamA + " won by " + result + " runs.(DLS Method.) ");
				}else if(totalB > (75*(totalA)/100)) {
					int result = totalB - (75*(totalA)/100);
					System.out.println(teamB + " won by " + result + " runs.(DLS Method.) ");
				}
			}else {
				System.out.println("The match was interrupted due to rain please stay for the further updates.");
				System.out.println("Is Raining after Three hours yes or no.");
				String ra2 = sc1.next();
				if(ra2.equals("no")) {
					System.out.println("Overs reduced to 20 overs for " + teamB + " side.");
					System.out.println(teamB + " target is: " + (56*(totalA)/100));
					System.out.println("Enter the overs Played by " + teamB + ". ");
					overs20try();
					System.out.println("Enter the Runrate Played by " + teamB +". ");
					rrB = sc1.nextDouble();

					totalB = (int) ( ov * rrB);
					if(ov == 30 && rrB <= 5.50) {
						wickets = 9;
						System.out.println("Total score by " + teamB + ": " + totalB + "/" +wickets);
					}else if(ov == 30 && rrB > 5.50) {
						wickets = 6;
						System.out.println("Total score by " + teamB + ": " + totalB + "/" +wickets);
					}else if(ov < 30) {
						wickets = 10;
						System.out.println("Total score by " + teamB + ": " + totalB + "/" +wickets);
					}
					if(totalB == (56*(totalA)/100)) {
						System.out.println("Match Tie");
					}else if(totalB < (56*(totalA)/100)) {
						int result = (56*(totalA)/100) - totalB;
						System.out.println(teamA + " won by " + result + " runs.(DLS Method.) ");
					}else if(totalB > (56*(totalA)/100)) {
						int result = totalB - (56*(totalA)/100);
						System.out.println(teamB + " won by " + result + " runs.(DLS Method.) ");
					}
				}else {
					System.out.println("Match between " + teamA + " vs " + teamB + " Abonded due to Rain.");
				}
			}
		}

	}
		
}

public class Cricket {

	public static void main(String[] args) throws OversException {
		CricketInnings ci = new CricketInnings();
		ci.sample();
		
	}

}

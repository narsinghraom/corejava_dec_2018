package com.vtalent.vinodreddy;

import java.util.Scanner;

public class CricketInfo {
	static String teama,teamb;
	static int totalA,totalB;
	static double ov,runrate;
	static int wickets;

	static Scanner s =new Scanner(System.in);

	public void matchDetails() {
		// TODO Auto-generated method stub
		System.out.println("enter the team A name");
		teama =s.next();
		System.out.println("enter the team B name");
	    teamb =s.next();
		System.out.println("welcome to ODI cricket between "+ teama + " vs " + teamb );
		System.out.println("The toss won and choose to bat first by " + teama);
		firstInnings();
	}
	
	public void firstInnings() {
		// TODO Auto-generated method stub
		System.out.println("the first innings by " + teama  );
		System.out.println("check the rain is falling yes/no");
		String check =s.next();	
			if(check.equals("yes")) {
				System.out.println("the match was interrupted due to rain please stay tunned");
				System.out.println("Is Rain fall after two hours yes/no");
				String rain =s.next();
				if(rain.equals("yes")) {
					System.out.println("the rain was not stopped yet");	
					System.out.println("is the rain fall up to three hours yes/no");
					String three =s.next();
					
					if(three.equals("yes")) {
						System.out.println("The Match Was Permanently stopped Due The Rain");
					}
					
				
				else if(rain.equals("no")) {
					System.out.println("Due to rain interrupt overs was reduced to 40 ");
					System.out.println("enter the overs played by " + teama);
					ov =s.nextDouble();
				 	System.out.println("enter the run rate played by " + teama);
					runrate =s.nextDouble();
					totalA =(int) (ov * runrate);
					if(ov <=40 && runrate <=4.50) {
						wickets =10;
						System.out.println("The Total Score By" + teama + " is " + totalA + "/" +wickets );
						
					}
					else if(ov == 40 && runrate <=7.0  ) {
						wickets =6;
						System.out.println("The total Score By " + teama + " is " + totalA + "/" +wickets);
						
					}
					else if(ov < 40 ) {
						wickets =10;
						System.out.println("The Total Score By " + teama + " is " + totalA + "/" +wickets );
					}
					secondInnings();
				}
			
				else  {  
					scoreCalculation();
				}
			
			}
			}
	}
		
		
	
	private void scoreCalculation() {
		// TODO Auto-generated method stub
		System.out.println("enter the overs played by " + teama);
		ov =s.nextDouble();
		System.out.println("enter the run rate played by " + teama);
		runrate =s.nextDouble();
		totalA =(int) (ov * runrate);
		if(ov <=50 && runrate <=4.50) {
			wickets =10;
			System.out.println("The Total Score By " + teama + " is " + totalA + "/" +wickets );
			
		}
		else if(ov == 50 && runrate <=7.0  ) {
			wickets =6;
			System.out.println("The total Score By " + teama + "is" + totalA + "/" +wickets);
			
		}
		else if(ov < 50 ) {
			wickets =10;
			System.out.println("The Total Score By " + teama + "is" + totalA + "/" +wickets );
		}
		secondInnings();
	}



	public void secondInnings() {
		// TODO Auto-generated method stub
		System.out.println("the " + teamb +  " is coming out to chase the " + teama + "score");
		System.out.println("check the rain is falling yes/no");
		String check =s.next();	
			if(check.equals("yes")) {
				System.out.println("the match was interrupted by rain please stay tunned");
				System.out.println("Is Rain fall after two hours yes/no");
				String rain =s.next();
				if(rain.equals("yes")) {
					System.out.println("the rain was not stopped yet");	
					System.out.println("is the rain fall up to three hours yes/no");
					String three =s.next();
					
					if(three.equals("yes")) {
						System.out.println("The Match Was Permanently stopped Due The Rain");
						System.exit(0);
					}
				}
				else if(rain.equals("no")) {
					System.out.println("Due to rain interrupt overs was reduced to 40 ");
					System.out.println("enter the overs played by " + teamb);
					ov =s.nextDouble();
					System.out.println("enter the run rate played by " + teamb);
					runrate =s.nextDouble();
					totalB =(int) (ov * runrate);
					if(ov <=40 && runrate <=4.50) {
						wickets =10;
						System.out.println(" The Total Score By " + teamb + " is " + totalB + "/" +wickets );
						
					}
					else if(ov == 40 && runrate <=7.0  ) {
						wickets =6;
						System.out.println("The total Score By " + teamb + " is " + totalB + "/" +wickets);
					}
					else if(ov < 40 ) {
						wickets =10;
						System.out.println("The Total Score By " + teamb + " is " + totalB + "/" +wickets );
					}
					if(totalA==totalB) {
						System.out.println("The Match Was tied");
					}
					else if(totalA<totalB) {
						System.out.println("the " + teamb + " won the match");
					}
					else if(totalA>totalB) {
						System.out.println("the " + teama + " won the match");
					}
				}
			}
				else  {  
					secondScoreCalculation();
				}
	}
			
	private void secondScoreCalculation() {
		// TODO Auto-generated method stub
		
		System.out.println("enter the overs played by " + teamb);
		ov =s.nextDouble();
		System.out.println("enter the run rate played by " + teamb);
		runrate =s.nextDouble();
		totalB =(int) (ov * runrate);
		if(ov <=50 && runrate <=4.50) {
			wickets =10;
			System.out.println("The Total Score By" + teamb + " is " + totalB + "/" +wickets );
			
		}
		else if(ov == 50 && runrate <=7.0  ) {
			wickets =6;
			System.out.println("The total Score By " + teamb+ " is " + totalB + "/" +wickets);	
		}
		else if(ov < 50 ) {
			wickets =10;
			System.out.println("The Total Score By " + teamb + " is " + totalB + "/" +wickets );
		}
		if(totalA==totalB) {
			System.out.println("The Match Was tied");
			
		}
		else if(totalA<totalB) {
			System.out.println("the " + teamb + "won the match");
		}
		else if(totalA>totalB) {
			System.out.println("the " + teama + "won the match");
		}
	}
}





	

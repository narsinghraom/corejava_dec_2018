package com.vtalent.varshini;

import java.util.*;

class CricketInnings {
    	 
	    static String TeamA,TeamB;
		static Scanner sc=new Scanner(System.in);
   
	   public void Teams() {
		System.out.println("Enter the teamA name");
        TeamA = sc.nextLine();
        System.out.println("Enter the teamB name");
        TeamB = sc.nextLine();
        System.out.println("welcome to ONEDAY innings");
		}
		public void FirstInnings() throws  OversException{
			System.out.println("First innings by teamA");
			System.out.println("Is there is raining yes/no"); 
			String raining=sc.nextLine();
			double overs,runrate;
			int wickets;
			if(raining.equals("no")) {
				System.out.println("enter overs of TeamA" + TeamA );
				overs=sc.nextDouble();
				System.out.println("enter the run rate of TeamA" + TeamA );
				runrate=sc.nextDouble();
				double Total = (int)(overs*runrate);
				if(overs==50 && runrate<=4.5) {
					wickets=10;
					System.out.println("Total of" + TeamA + ": " + Total + "/" +wickets);
					SecondInnings();
				}
				else if(overs==50 && runrate<=6.5) {
					wickets=8;
					System.out.println("Total of" + TeamA + ":" + Total + "/" +wickets);
					SecondInnings();
					
				}
			}
			else {
					System.out.println("match stopped due to rain");
				    System.out.println("Is there is raining after 2 hours yes/no");
				    String raining1=sc.nextLine();
					if(raining1.equals("no")) {
						System.out.println("Run rate reduced by 40");
						System.out.println("enter overs of TeamA"+TeamA);
						overs=sc.nextDouble();
						System.out.println("enter the run rate of TeamA"+TeamA);
						runrate=sc.nextDouble();
						double Total1 = (int)(overs*runrate);
						if(overs==40 && runrate<=4.5) {
							wickets=10;
							System.out.println("Total of" + TeamA + ":" + Total1);
							SecondInnings();
						}else if(overs==40 && runrate<=6.5) {
							wickets=8;
							System.out.println("Total of" + TeamA + ":" + Total1);
							SecondInnings();
				}
			}else {
				System.out.println("Match was stopped due to rain");
				 System.out.println("Is there is raining after 3 hours yes/no");
				    String raining2=sc.nextLine();
					if(raining1.equals("no")) {
						System.out.println("Run rate reduced by 30");
						System.out.println("enter overs of TeamA");
						overs=sc.nextDouble();
						System.out.println("enter the run rate of TeamA");
						runrate=sc.nextDouble();
						double Total1 = (int)(overs*runrate);
						if(overs==30 && runrate<=4.5) {
							wickets=10;
							System.out.println("Total of team A"+Total1);
							SecondInnings();
						}else if(overs==30 && runrate<=6.5) {
							wickets=8;
							System.out.println("Total of Team B"+Total1);
							SecondInnings();
			}else if(overs<30) {
				System.out.println("Total score of Team A");
				SecondInnings();
			}
			else {
				System.out.println("match is stopped due to rain");
				System.exit(0);
			          }
					}
			}
				}
	}
	
					public static void SecondInnings() {
						System.out.println("Second innings by teamB");
						System.out.println("Is there is raining yes/no"); 
						String raining=sc.nextLine();
						double overs,runrate;
						int wickets;
						if(raining.equals("no")) {
							System.out.println("enter overs of TeamB");
							overs=sc.nextDouble();
							System.out.println("enter the run rate of TeamB");
							runrate=sc.nextDouble();
							double Total2 = (int)(overs*runrate);
							if(overs==50 && runrate<=4.5) {
								wickets=10;
								System.out.println("Total of" + TeamA + ":" + Total2 + "/" +wickets);
							}
							else if(overs==50 && runrate<=6.5) {
								wickets=8;
								System.out.println("Total of" + TeamA + ":" + Total2 + "/" +wickets);
								
							}else
								System.out.println("match stopped due to rain");
							    System.out.println("Is there is raining after 2 hours yes/no");
							    String raining1=sc.nextLine();
								if(raining1.equals("no")) {
									System.out.println("Run rate reduced by 40");
									System.out.println("enter overs of TeamB");
									overs=sc.nextDouble();
									System.out.println("enter the run rate of TeamB");
									runrate=sc.nextDouble();
									double Total21 = (int)(overs*runrate);
									if(overs==40 && runrate<=4.5) {
										wickets=10;
										System.out.println("Total of team A"+Total21);
									}else if(overs==40 && runrate<=6.5) {
										wickets=8;
										System.out.println("Total of Team B"+Total21);
							}
						
						}
						}
					}
					
			}
    public class Match {
	  

	public static void main(String[] args) {
		
		CricketInnings ci=new CricketInnings();
		ci.Teams();
		ci.FirstInnings();

	}

}

			
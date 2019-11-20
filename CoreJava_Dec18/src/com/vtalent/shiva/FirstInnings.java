package com.vtalent.shiva;

import java.util.Scanner;

public class FirstInnings {
	static String teamA,teamB;
	static int scoreA,scoreB;
		
	
	static Scanner sc=new Scanner(System.in);
	
	public static void rain() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter team A name ");
		String s=sc.nextLine();
		System.out.println("Enter team B name ");
		String b=sc.nextLine();
		System.out.println("welcome to the ODI between " +   s   +   " vs "   + b + ".");
		System.out.println("first Innings by " + s + "." );
		
		System.out.println("is it raining yes or no");
		String ra=sc.nextLine();
		if(ra.equals("no")){
			System.out.println("overs played by " + s +".");
			double d=sc.nextDouble();
			System.out.println("runrate of " + s + ".");
			double d1=sc.nextDouble();
		int	scoreA=(int)(d*d1);
			if(d==50) {
				int wickets=6;
				System.out.println("score of" + s + "=" + scoreA);
				//secondinnings();
			}
		
		else 
		if(d<50){
			int wickets=10;
			System.out.println("score of" + s + "=" + scoreA);
//			secondinnings();
		}
		else {
			System.out.println("will it raining after one hour yes or no ");
			String ra1=sc.nextLine();
			if(ra1.equals("no")) {
				System.out.println("overs reduced to 40");
				System.out.println("overs played by " + s +".");
				double d11=sc.nextDouble();
				System.out.println("runrate of" + s +".");
				double d111=sc.nextDouble();
				scoreA=(int)(d11*d111);
				if(d111<=40 && d11<=5.5) {
					int wickets=10;
					System.out.println("score of " + s+ "=" +scoreA+".");
//					secondinnings();
				}else {
					System.out.println("will it raining after two hour yes or no ");
					String ra2=sc.nextLine();
					if(ra2.equals("no")) {
						System.out.println("overs reduced to 30");
						System.out.println("overs played by " + s +".");
						double d0=sc.nextDouble();
						System.out.println("runrate of" + s +".");
						double d02=sc.nextDouble();
						scoreA=(int)(d0*d11);
						if(d0<=30 && d02<7) {
							int wickets=10;
							System.out.println("score of " + s+ "=" +scoreA+".");
//					secondinnings();
							
				}
						else {
							System.out.println("will it raining after three hour yes or no ");
							String ra3=sc.nextLine();
							if(ra3.equals("no")) {
								System.out.println("overs reduced to 15");
								System.out.println("overs played by " + teamA +".");
								double d2=sc.nextDouble();
								System.out.println("runrate of" + teamA +".");
								double d12=sc.nextDouble();
								scoreA=(int)(d2*d12);
								if(d2<=30 && d12<7) {
									int wickets=10;
									System.out.println("score of " + teamA+ "=" +scoreA+".");
//							secondinnings();
							
							
							
						}else {
							System.out.println("match abonded due to rain");
						}
			}
				}
			}
		}
	}
		}
			System.out.println("second Innings by " + b + "." );
			
			System.out.println("is it raining yes or no");
			String ra1=sc.nextLine(); 
			if(ra.equals("no")){
				System.out.println("overs played by " + b +".");
				double d9=sc.nextDouble();
				System.out.println("runrate of " + b + ".");
				double d8= sc.nextDouble();
			int	scoreB=(int)(d9*d8);
				if(d9==50) {
					int wickets=6;
					System.out.println("score of" + b + "=" + scoreB);
					//secondinnings();
				}
			
			else 
			if(d<50){
				int wickets=10;
				System.out.println("score of" + b + "=" + scoreA);
//				secondinnings();
			}
			else {
				System.out.println("will it raining after one hour yes or no ");
				String ra9=sc.nextLine();
				if(ra1.equals("no")) {
					System.out.println("overs reduced to 40");
					System.out.println("overs played by " + b +".");
					double d11=sc.nextDouble();
					System.out.println("runrate of" + b +".");
					double d111=sc.nextDouble();
					scoreA=(int)(d11*d111);
					if(d111<=40 && d11<=5.5) {
						int wickets=10;
						System.out.println("score of " + b+ "=" +scoreA+".");
//						secondinnings();
					}else {
						System.out.println("will it raining after two hour yes or no ");
						String ra2=sc.nextLine();
						if(ra2.equals("no")) {
							System.out.println("overs reduced to 30");
							System.out.println("overs played by " + b +".");
							double d0=sc.nextDouble();
							System.out.println("runrate of" + b +".");
							double d02=sc.nextDouble();
							scoreA=(int)(d0*d11);
							if(d0<=30 && d02<7) {
								int wickets=10;
								System.out.println("score of " + b+ "=" +scoreA+".");
//						secondinnings();
								
					}
							else {
								System.out.println("will it raining after three hour yes or no ");
								String ra3=sc.nextLine();
								if(ra3.equals("no")) {
									System.out.println("overs reduced to 15");
									System.out.println("overs played by " + b +".");
									double d2=sc.nextDouble();
									System.out.println("runrate of" + b +".");
									double d12=sc.nextDouble();
									scoreA=(int)(d2*d12);
									if(d2<=30 && d12<7) {
										int wickets=10;
										System.out.println("score of " + b+ "=" +scoreB+".");
//								secondinnings();
								
								
								
							}else {
								System.out.println("match abonded due to rain");
							}
		
	}
}

						}
					}
				}
			}
			}
		}
	}
}

		


		
		
	
	
	
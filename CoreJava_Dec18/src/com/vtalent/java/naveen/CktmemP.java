package com.vtalent.java.naveen;

import java.util.Scanner;

public class CktmemP {
	static Scanner sc = new Scanner(System.in);

	public static void teams() {
		System.out.println("please enter team one");
		String str = sc.next();
		System.out.println("please enter team two");
		String s = sc.next();
		System.out.println("Welcome to ODI b/w  " + str + " vs " + s);
	}

	static int inc = 0;

	public static int firstInnings() throws Exception {
		System.out.println("First innings by India");
		System.out.println("Is raining press y/n");
		String s = "n";
		s = sc.next();
		if (s.equalsIgnoreCase("n")) {
			playing();

		} else {
			rainCondition();
		}
		return inc;
	}

	static int sca = 0;
	static int TotalScore;

	public static int playing() throws Exception {

		CktException ce = new CktException();
		CktException.OversException in=new CktException().new OversException();
		System.out.println(" enter the overs ");
		double i = sc.nextDouble();
		Integer i7 = (int) i;
		double g = i - i7;
		System.out.println(g);
		if (g <= 0.6) {
			System.out.println("enter the runrate by India");
			double d = sc.nextDouble();
			int k = in.overs(i);
			// ce.runrate(d);

			if (k == 1) {
				i = 0;
			} else {
				System.out.println(i);
			}
			sca++;
			TotalScore = (int) (i * d);
			int j = CktException.conditions(d);
			System.out.println("Total score is  " + TotalScore + "/" + j);
			
		} else
			System.out.println("overs not exceded to 0.6");
		return sca;
	}

	public static int rainCondition() throws Exception {
		int c = 0;
		System.out.println("rain after 2hr");
		String z = "n0";
		System.out.println("if rain press yes/no");
		z = sc.next();
		if (z.equals("no")) {
			c++;
			firstInnings();
		} else if (z.equals("yes")) {
			//CktException.rainException();
		}
		return c;
	}

	public static void sceondInnings() throws Exception {
		System.out.println("2nd ");
		int TotalScore2 = 0;
		if (sca == 1) {

			CktException ce = new CktException();
			System.out.println(" enter the overs ");
			double i = sc.nextDouble();
			Integer i7 = (int) i;
			double g = i - i7;
			System.out.println(g);
			if (g<0.6) {
				System.out.println("enter the runrate by SA");
				double d = sc.nextDouble();
				//int kddsadf = ce.overs(i);
				//ce.runrate(d);
				/*
				 * if (kddsadf== 1) { i = 0; } else { System.out.println(i); }
				 */

				TotalScore2 = (int) (i * d);
				int j = CktException.conditions(d);
				System.out.println("Total score is  " + TotalScore2 + "/" + j);

			} else
				System.out.println("overs not exceded to 0.6");

		}
		if (TotalScore2 < TotalScore) {
			System.out.println("won INDIA  " + TotalScore);
		} else
			System.out.println("won2 SA" + TotalScore2);

	}

}

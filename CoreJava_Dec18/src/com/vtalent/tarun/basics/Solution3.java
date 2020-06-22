package com.vtalent.tarun.basics;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Film[] mv = new Film[4];
		for (int i = 0; i < 4; i++) {
			int a = sc.nextInt();
			sc.nextLine();
			String b = sc.nextLine();
			int c = sc.nextInt();
			int d = sc.nextInt();
			mv[i] = new Film(a, b, c, d);
		}
		sc.nextLine();
		String nm = sc.nextLine();
		int um = sc.nextInt();
		int dm = sc.nextInt();
		int res = findAvgBudgetByDirector(mv, nm);
		if (res > 0)
			System.out.println(res);
		else
			System.out.println("Sorry - The given director has not yet directed any Film");
		Film temp = getFilmByRatingBudget(mv, um, dm);
		if (temp == null)
			System.out.println("Sorry - No Film is available with the specified rating and budget requirement");
		else
			System.out.println(temp.id);
	}

	public static int findAvgBudgetByDirector(Film[] mv, String nm) {
		// method logic
		int avg, s = 0, j = 0;
		for (int i = 0; i < mv.length; i++) {
			if (nm.equalsIgnoreCase(mv[i].dt)) {
				s = s + mv[i].bt;
				j++;
			}
		}
		if (j > 0) {
			avg = s / j;
			return avg;
		} else
			return 0;
	}

	public static Film getFilmByRatingBudget(Film[] mv, int rating, int budget) {
		// method logic
		Film temp = new Film();
		for (int i = 0; i < 4; i++) {
			if ((rating == mv[i].rt) && (budget == mv[i].bt) && (mv[i].bt % mv[i].rt == 0)) {
				temp.id = mv[i].id;
				return temp;
			}
		}
		return null;

	}
}

class Film {
	// code to build Film class
	int id, rt, bt;
	String dt;

	Film() {

	}

	Film(int id, String dt, int rt, int bt) {
		this.id = id;
		this.dt = dt;
		this.rt = rt;
		this.bt = bt;
	}
}

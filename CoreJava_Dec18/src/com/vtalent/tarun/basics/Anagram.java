package com.vtalent.tarun.basics;
import java.util.*;
public class Anagram {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String x = s.nextLine();
		String y = s.nextLine();
		x = x.replace(" ", "").toLowerCase();
		y = y.replace(" ", "").toLowerCase();
		
		char a[] = x.toCharArray();
		char b[] = y.toCharArray();
		
		Arrays.sort(a);
		Arrays.sort(b);
		
		boolean res = Arrays.equals(a, b);
		if (res == true) {
			System.out.println("Yes !! Anagram");
		}
		else {
			System.out.println("No , Try Again");
		}
	}
}

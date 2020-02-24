package com.vtalent.tarun.basics;

import java.util.*;

public class GcdLcm {
	public static void main(String args[]) {
		int n1, n2;
		int gcd, lcm, rem, num, den;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two Numbers");
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		if (n1 > n2) {
			num = n1;
			den = n2;
		} else {
			num = n2;
			den = n1;
		}
		rem = num % den;
		while (rem != 0) {
			num = den;
			den = rem;
			rem = num % den;
		}
		gcd = den;
		lcm = n1 * n2 / gcd;
		System.out.println("GCD of " + n1 + " and " + n2 + " = " + gcd);
		System.out.println("LCM of " + n1 + " and " + n2 + " = " + lcm);
	}
}

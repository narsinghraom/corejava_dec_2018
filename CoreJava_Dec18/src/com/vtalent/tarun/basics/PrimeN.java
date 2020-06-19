package com.vtalent.tarun.basics;

public class PrimeN {
	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("enter	number");
		int n = sc.nextInt();
		int t = 0;
		if (n <= 1) {
			System.out.println("Prime	starts	from	2");
			
		} 
		else {
			for (int i = 2; i < n - 1; i++) {
				if (n % i == 0)
					t += 1;
			}
			System.out.println("=======================");
			if (t > 0) {
				System.out.println("No");
			} else {
				System.out.println("Yes");
			}
		}
	}
}
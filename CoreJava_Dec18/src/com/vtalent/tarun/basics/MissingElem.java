package com.vtalent.tarun.basics;

public class MissingElem {

	public static void main(String[] args) {
		/*
		 * int[] a = {2,4,6,10,12,14,16}; int exp_elements = a.length + 1; int total_sum
		 * = exp_elements * (exp_elements + 1) / 2; int sum = 0; for (int i = 0 ;
		 * i<a.length; i++) { sum += a[i]; }
		 * System.out.println("Missing Array Element: " +(total_sum - sum));
		 */
		/*
		 * int a = 2; int b = 5; a = b++; System.out.println(a +" " +b);
		 */
		int[] a = {2,4,6,8,12,14,16};
		int xor1 = a[0];
		for (int i=1;i<a.length;i++) {
			xor1 = xor1^a[i];
		}
		int xor2 = 1;
		for (int i = 2; i<=(a.length+1);i++) {
			xor2 = xor2 ^ i;
		}
		System.out.println("Missing one: " +(xor1^xor2));
	}

}

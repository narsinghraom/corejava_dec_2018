package com.vtalent.saichand;

public class nestedwhileloop {
	public static void main(String args[]) {
		int i = 10, j = 5;
		while (i >= 1) {
			while (j >= 1) {
				System.out.println("the value of j is:" + j);
				j--;
			}
			System.out.println("the value of i is:" + i);
			i--;
		}
	}

}
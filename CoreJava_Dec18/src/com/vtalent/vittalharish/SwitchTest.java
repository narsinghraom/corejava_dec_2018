package com.vtalent.vittalharish;

import java.util.Scanner;

public class SwitchTest {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Select an Option" + '\n' + "1.Prime Number" + '\n' + "2.Factorial" + '\n'
				+ "3.Fibonacci Series" + '\n');
		int p = scan.nextInt();
		Switch st = new Switch();
		switch (p) {
		case 1:
			st.primenumbers();
			break;

		case 2:
			st.factorial();
			break;

		case 3:
			st.fibonacci();
			break;

		case 4:
			break;
		}

	}

}

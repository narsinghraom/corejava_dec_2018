package com.vtalent.raju;

import java.util.Scanner;


public class SwitchTest {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Select an Option" + '\n' + "1.Prime Number" + '\n' + "2.Factorial" + '\n'
				+ "3.Fibonacci Series" + '\n' +"4.minmax");
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
			st.minmax();
			break;
		case 5:
			System.out.println("Choose the Type of Sort"+'\n'+"1.Insertion Sort"+'\n'+"2.Merge Sort");
			int x=st.nextInt();
			if(x==1) {
				int[] a= {5,13,2,14,7,6};
				st.insert(a);
			}
			else {
				
			}
			break;
		}

		}

	}



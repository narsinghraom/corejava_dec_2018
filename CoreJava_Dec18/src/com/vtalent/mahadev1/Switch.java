package com.vtalent.mahadev1;

import java.util.Scanner;

public class Switch {
	public static void main(String[] args) {
		int n=0;
		while (true) {

			Scanner s = new Scanner(System.in);
			System.out.println("Enter");
			n = s.nextInt();
		//	if(n<=3){
			switch (n) {
			case 1:
				System.out.println("inset\n");
				break;
			case 2:
				System.out.println("delete\n");
				break;
			case 3:
				System.out.println("update\n");
				break;
				default :
					System.out.println("invalid");
			}
			}
		//	else{
			//	System.out.println("invalid");
			}
}



	
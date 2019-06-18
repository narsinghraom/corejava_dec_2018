package com.vtalent.mahadev1;

import java.util.Scanner;

public class switchcase {
	public static void main(String[] args) {
		int n=1;
		while (n<=3) {

			Scanner s = new Scanner(System.in);
			System.out.println("Enter");
			n = s.nextInt();
			if(n<=3){
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
			}
			}
			else{
				System.out.println("invalid");
			}
		}
	}
}
	

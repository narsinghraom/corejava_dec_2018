package com.vtalent.sampath;

import java.util.Scanner;

public class OddEven {
public static void main(String args[]) {
	Scanner Sc=new Scanner(System.in);
	System.out.println("Enter a number");
	int num=Sc.nextInt();
	if (num%2==0) {
		System.out.println(num+"Even number");
	}
	else{
		System.out.println(num+"odd number");
		
		
	}
	
	
}

}

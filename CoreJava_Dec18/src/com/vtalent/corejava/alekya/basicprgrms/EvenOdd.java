package com.vtalent.corejava.alekya.basicprgrms;
import java.util.Scanner;

public class EvenOdd {
	
	 
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);//taking ip from user
		System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if(num % 2 == 0)
            System.out.println(num + " is even");
        else
            System.out.println(num + " is odd");
	}
}
 

package com.vtalent.jhansi.basics;
import java.util.Scanner;
public class Palandrome {
	public static void main(String[] args) {
		int r,sum=0,temp;
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter number");
		int num=scan.nextInt();
		scan.close();
		temp=num;
		while(num>0)
		{
			r=num%10;
			sum=sum*10+r;
			num=num/10;
		}
		if(temp==sum)
			System.out.println("given number is palendrome");
		else
			System.out.println("given number is not palandrome");
	}

}

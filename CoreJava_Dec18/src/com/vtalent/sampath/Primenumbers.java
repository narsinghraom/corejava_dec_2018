package com.vtalent.sampath;
import java.util.Scanner;

public class Primenumbers {
	public static void main(String args[]) {
		
		while(true) {
			Scanner Sc=new Scanner(System.in);
			int number=Sc.nextInt();
			
		
		if (number<0) {
			System.out.println("Number must be possitive");
		}
		
		
		else {
			Boolean flag=Boolean.TRUE;
	for(int i=2;i<number;i++)
	{
		if (number%i==0)
		{
			flag=Boolean.FALSE;
		}
	}
	if(flag==Boolean.TRUE)
	{
		System.out.println("prime Number");
		
	}
		
	else {
		System.out.println("not a prime number");
	}
		}
		
	}
	}
}


package com.vtalent.jhansi.basics;
import java.util.Scanner;
public class PrimeNumber {
	public static void main(String[] args) {
		boolean flag=false;
	Scanner scan=new Scanner(System.in);
	System.out.println("Please enter number");
	int num=scan.nextInt();
	scan.close();
	System.out.println("the number entered is "+num);
	for(int i = 2; i <= num/2; ++i)
    {
         if(num % i == 0)
        {
            flag = true;
            break;
        }
    }
    if (!flag)
        System.out.println(num + " is a prime number.");
    else
        System.out.println(num + " is not a prime number.");
}
	
	
	}
    



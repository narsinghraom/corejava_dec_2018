
package com.vtalent.jhansi.basics;
import java.util.Scanner;
public class Factorial {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("please enter number whose factorial need to be found");
	int num=scan.nextInt();
	scan.close();
	System.out.println("the number whose factorial need to be found is  " + num);
	int fact=1;
	for(int i=1;i<=num;i++)
		fact=fact*i;
	System.out.println("the factorial of the given number is "+fact);
}
}

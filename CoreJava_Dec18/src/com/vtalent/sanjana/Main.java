package com.vtalent.sanjana;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Basic b=new Basic();
Scanner sc=new Scanner(System.in);
System.out.println("Select an option to perform the operation");
int choice=sc.nextInt();
switch(choice)
{
case 1:
	b.primeNumber();
	break;
	
case 2:
	b.factorial();
	break;
	
case 3:
	b.fibonacci();
	break;
case 4:
	b.minmax();
	break;
default:
	System.out.println("Choose operation");
}
	}

}

package com.vtalent.corejava.alekya.basicprgrms;

import java.util.Scanner;
class ArmstrongExample{  
  public static void main(String[] args)  {  
    int c=0,a,temp;  
System.out.println("please enter the number");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();  
    temp=n;  
    while(n>0)  
    {  
    a=n%10;  
    n=n/10;  
    c=c+(a*a*a);  
    }  
    if(temp==c)  
    System.out.println(temp+"armstrong number");   //Armstrong Number in Java: A positive number is called armstrong number if it is equal to the sum of cubes of its digits for example 0, 1, 153, 370, 371, 407 etc.
    else  
        System.out.println("Not armstrong number");   
   }  
}
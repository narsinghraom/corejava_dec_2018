package com.vtalent.sri;
import java.util.Scanner;

public class Factorial {
	 n=0;

    public static void main(String[] args) {

    	//We will find the factorial of this number
    	n=0;
        long fact = 1;
        Scanner in = new Scanner(System.in); 
        
       String n =in.nextLine(); 
        System.out.println("You entered number "+n); 

        for(int i = 1; i<= n; i++)
        	
        {
            fact = fact * i;
        }
        System.out.println("Factorial of "+n+" is: "+fact);
    }
}
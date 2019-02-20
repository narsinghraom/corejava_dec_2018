package com.vtalent.naveena;
import java.util.*;
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,fact=1; 
		  Scanner Scn=new Scanner(System.in);
		  System.out.println("enter value for factorial");
		  int n=Scn.nextInt();  
		  for(i=1;i<=n;i++){    
		      fact=fact*i;  
		  }    
		    System.out.println("Factorial of "+n+" is: "+fact);

	}

}

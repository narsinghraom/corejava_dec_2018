package com.vtalent.raju;

import java.util.Scanner;

public class Test
{
	Scanner sc = new Scanner(System.in);

	class Factorial{  
		  int i,fact=1;  
		  int number=5;    
		  for(i=1;i<=number;i++){    
		      fact=fact*i;    
		  }    
		  System.out.println("Factorial of "+number+" is: "+fact);    
		 }  
		}  


public class Minmax {
		
		 {
				int[] a= {3,7,10,0,1};
				int min = a[0];
				for(int i=1;i<a.length;i++){
					if(a[i] < min){
						min = a[i];
					}
			}
				int max=a[0];
				for(int i=1;i<=a.length-1;i++ ) {
					if(a[i] > max) {
						max=a[i];
					}
				}
				
				System.out.println("Minimum Value:"+min);
				System.out.println("Maximum Value:"+max);
				
				
			
	}
				

	}



public class Prime {


		int k;
		int count = 0;
		System.out.println("Enter a Number");
		k = sc.nextInt();
		for (int i = 0; i <=k; i++) {
			if (k % i == 0)

			{
				count++;

			}

		}
		if (count == 2) {
			System.out.println(k + "is a Prime Number ");

		} else {
			System.out.println(k + "is  Not a Prime Number ");
		}
	}

public class Fibonacci {
	{    
	 int a=0,b=1,c,i,count=5;    
	 System.out.print(a+" "+b);    
	    
	 for(i=2;i<count;++i)   
	 {    
	  c=a+b;    
	  System.out.print(" "+c);    
	  a=b;    
	  b=c;    
	 }    
	  
	} 


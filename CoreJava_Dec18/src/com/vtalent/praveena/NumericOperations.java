package com.vtalent.praveena;

import java.util.Scanner;

public class NumericOperations {
	static Scanner b = new Scanner(System.in);

	public static void primeNumber() {
		System.out.println("Enter a number");
		double PN = b.nextDouble();
		int count = 0;
		for (int i = 1; i <= PN; i++) {
			if (PN % i == 0) {
				count++;
			}
		}
		if (count == 2) {
			System.out.println(PN + "is a Prime Number");
		} else {
			System.out.println(PN + "is not a Prime Number");
		}
	}

	public static void Factorial() {
		System.out.println("Enter a number");
		int f = b.nextInt();
		int fact = 1;
		for (int i = 1; i <= f; i++) {
			fact = fact * i;

		}
		System.out.println("Factorial value is " + fact);
	}

	public static void FibonacciSeries() {
		System.out.println("Enter a number");
		double n = b.nextDouble();
		int first = 0;
		int second = 1;
		int FS = first + second;
		System.out.print(first + "," + second + ",");
		for (int i = 0; i <= n; i++) {
			System.out.print(FS + ",");
			first = second;
			second = FS;
			FS = first + second;
		}
	}

	public static void MinMax() {
		int arr[] = { 3, 7, 10, 0, 1 };
		int arrmin = arr[0];
		int arrmax = arr[0];
		for (int i = 0; i <= arr.length - 1; i++) {
			if (arrmin > arr[i]) {
				arrmin = arr[i];
			}
		}
		System.out.println("min number of given array is" + arrmin);
		for (int j = 0; j <= arr.length - 1; j++) {
			if (arrmax < arr[j]) {
				arrmax = arr[j];
			}
		}
		System.out.println("max number of array is" + arrmax);

	}
	public static void InsertionSort()
	{
		 int[] a = {3,7,10,0,1}; 
		    for(int i=1; i<a.length;i++)   
		    {  
		        int k = a[i];  
		        int j= i-1;  
		        while(j>=0 && k<= a[j])  
		        {  
		        	int temp=a[j];		
		            a[j] = a[j+1];  	
		            a[j+1]=temp;
		            j = j-1;  
		        }  
		        
		    }  
		    System.out.println("printing sorted elements ...");  
		    for(int i=0;i<=a.length-1;i++)  
		    {  
		        System.out.print(a[i]+" ");  
		    }  
		}  
	}



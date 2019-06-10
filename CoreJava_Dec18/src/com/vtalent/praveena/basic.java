package com.vtalent.praveena;
import java.util.Scanner;


public class basic {
	 static Scanner b=new Scanner(System.in);
	 public static void main(String[]args)
	 {
		 System.out.println("Select your option");
		 int choice=b.nextInt();
		 switch(choice)
		 {
		 case 1:
			 System.out.println("primeNumber");
			 NumericOperations.primeNumber();
			 break;
		 case 2:
			 System.out.println("Factorial");
			 NumericOperations.Factorial();
			 break;
		 case 3:
			 System.out.println("FibonacciSeries");
			 NumericOperations.FibonacciSeries();
			 break;
				 
		 case 4:
			System.out.println("Min and Max num of an array");
			NumericOperations.MinMax();
			break;
			// case 5:
			// System.out.println("Merge Sort");
			// NumericOperations.MergeSort();
			 //break;
		 case 5:
			 System.out.println("Insertion Sort");
			 NumericOperations.InsertionSort();
			 break;
		 default :
			 System.out.println("Exit");
			 break;
		 }
	 }
}				 

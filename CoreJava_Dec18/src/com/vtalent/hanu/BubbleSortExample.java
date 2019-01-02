package com.vtalent.hanu;

import java.util.Scanner;

public class BubbleSortExample {
	
	static void sort(int[] arr) {  
        int n = arr.length;  
        int temp = 0;  
         for(int i=0; i < n; i++){  
                 for(int j=1; j < (n-i); j++){  
                          if(arr[j-1] > arr[j]){  
                                 //swap elements  
                                 temp = arr[j-1];  
                                 arr[j-1] = arr[j];  
                                 arr[j] = temp;  
                         }  
                          
                 }  
         }  
         for (int i : arr) {
			System.out.print(i+" ");
		}
  
    }  
	
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter Array Length....");
		int n=s.nextInt();
		int[] a= new int[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Enter Element..");
			a[i]=s.nextInt();
			
		}
		sort(a);
	}

}

package com.vtalent.corejava.aravind;
import java.util.Arrays;

public class BubbleSort {
	public static void swapping(int arr[], int i, int j) { //function for swapping corresponding elements
		int temp = arr[i];		// i value store in temp												
		arr[i] = arr[j];		// j value stores in i and swaps from temp variable
		arr[j] = temp;
	}

	public static void sorting(int arr[]) { //function for iterating through array
		for(int i = 0; i<=arr.length-1; i++) { //i loop will iterate from index 0
			for(int j=0;j<arr.length-1-i; j++) {//  j loop iterate and compare with next elemnt upto n length
				if(arr[j]>arr[j+1]) {//condition to check corresponding element 
					swapping(arr,j,j+1);//calls the swapping function to swap elements
			}
			
		}
	}
}
		public static void main(String[] args) { 
		int arr[] = {4,6,8,3,2,5,9,1};
		sorting(arr); //calling array in function
		System.out.println("sorted list"+ Arrays.toString(arr) );// prints string representation from array 
		}
	}

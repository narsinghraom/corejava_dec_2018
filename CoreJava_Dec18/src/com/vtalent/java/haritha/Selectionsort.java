package com.vtalent.java.haritha;

public class Selectionsort {
		public static void main(String args[]){
		int array[] = {10, 20, 25, 63, 96, 57};
	      
		for (int i = 0 ;i< array.length-1; i++){
	         	int min = i;
	         for (int j = i+1; j<array.length; j++){
	            if (array[j] < array[min]){
	            min = j;
	            }
	         }
	         int temp = array[min];
	         array[min] = array[i];
	         array[i] = temp;
	      }
		for (int i = 0 ;i< array.length; i++){
	         System.out.print(" "+array[i]);
	      }
	   }  
	}

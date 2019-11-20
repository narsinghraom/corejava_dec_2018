package com.vtalent.java.lokesh;

public class Array1 {
	public static void main(String[] args){
		int Array[] = {25,52,3,5,89,6,};
		int smallest = Array[0];
		int largest = Array[0];
		for(int i =0;i<Array.length; i++) {
		if(Array[i]<smallest) {
			smallest=Array[i];
		}
		if(Array[i]>largest) {
			largest=Array[i];
		}
		}
		System.out.println("the smallest value of array is :"+smallest);
		System.out.println("the largest value of array is:"+largest);
	}
		
	}
	
		
	

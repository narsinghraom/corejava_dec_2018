package com.vtalent.vinodreddy;

public class GreatestSmallest {

	public static void main(String[] args) {
		int Array[] = {31,25,65,85,98,12,14};
		int smallest = Array[0];
		int largest  = Array[0];
		for(int i=0;i<Array.length;i++) {
			 if(Array[i]<smallest) {
				 smallest =Array[i];
			 }
			 if(Array[i]>largest) {
				 largest = Array[i];
			 }
			
		}
	System.out.println("the smallest value of array is :"+smallest);
	System.out.println("the largest value of array is :"+largest);
	
	
	}

}
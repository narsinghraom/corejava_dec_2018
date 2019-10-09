package com.vtalent.java.srikarreddy;

public class ArraySizeFinding {
public static void main(String[] args) {
	int    Array[]= {10,2,3,4};
	int smallest=Array[0];
	int largest=Array[0];
	for(int i=0;i<Array.length;i++) {
		if(Array[i]<smallest)smallest=Array[i];
		if(Array[i]>largest)largest= Array[i];}
		System.out.println("the smallest value in the array is: "+smallest);
		System.out.println("the largest value in the array is:"+largest);
	 
	}
}
 

package com.vtalent.shiva;
import java.util.Scanner;
public class MaxMinivalue {
	public int largestValue(int[] arr) {
		int a=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>a) {
				a=arr[i];
			}
		}
		return a;
	}
	public int smallestValue(int[] arr) {
		int b=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<b) {
				b=arr[i];
			}
		}
		return b;
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter array size: ");
	int h=sc.nextInt();
	int[] arr=new int[h];
	System.out.println("enter " + h + " array values : ");
	for(int i=0;i<=arr.length-1;i++) {
		arr[i]=sc.nextInt();
	}
	MaxMinivalue m=new MaxMinivalue();
	System.out.println("Maximum value is: " + m.largestValue(arr));
	System.out.println("minimum value is: " + m.smallestValue(arr));
	
	
}
}

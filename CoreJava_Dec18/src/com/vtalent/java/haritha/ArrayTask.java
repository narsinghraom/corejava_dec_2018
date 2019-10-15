package com.vtalent.java.haritha;
import java.util.Scanner;
public class ArrayTask {
	public static int Max(int[] array) {
		int maxvalue=array[0];
		for(int i=1;i<array.length;i++) {
			if(array[i]>maxvalue) {
				maxvalue=array[i];
			}
		}
		
		return maxvalue;
	}
	public static int min(int[] array) {
		int minvalue=array[0];
		for(int i=1;i<array.length;i++) {
			if(array[i]<minvalue) {
				minvalue=array[i];
			}
		}
		return minvalue;
				
	}
	public static void main(String[] args) {
		System.out.println("enter the size of array:");
		Scanner sc=new Scanner(System.in);
		int s=sc.nextInt();
		System.out.println("enter Array values:\n");
		int[] array=new int[s];
		for(int i=0;i<s;i++) {
			array[i]=sc.nextInt();
		}
		int m=Max(array);
		int m1=min(array);
		
		System.out.println("maximum value:"+m);
		System.out.println("minimum value:"+m1);
		
		
	}

}

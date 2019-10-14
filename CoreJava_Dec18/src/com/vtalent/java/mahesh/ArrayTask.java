package com.vtalent.java.mahesh;
import java.util.Scanner;
public class ArrayTask{
	 public static int getMin(int[] Array){ 
		    int minValue = Array[0]; 
		    for(int i=1;i<Array.length;i++){ 
		      if(Array[i] < minValue){ 
		        minValue = Array[i]; 
		      } 
		    } 
		    return minValue; 
		  } 
	public static int getMax(int[] Array){ 
	    int maxValue = Array[0]; 
	    for(int i=1;i < Array.length;i++){ 
	      if(Array[i] > maxValue){ 
	         maxValue = Array[i]; 
	      } 
	    } 
	    return maxValue; 
	  }
	public static void main(String args[]){
		System.out.println("Enter size of the array:");
		Scanner n=new Scanner(System.in);
		int l=n.nextInt();
		int[] a=new int[l];
		System.out.println("Enter elements of array:");
		for(int i=0;i<l;i++){
			a[i]=n.nextInt();
		}
		    int min = getMin(a);
		    System.out.println("Minimum Value is: "+min);
		    int max = getMax(a);
		    System.out.println("Maximum Value is: "+max);
	}
}

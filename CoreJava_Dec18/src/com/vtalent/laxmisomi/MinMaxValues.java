package com.vtalent.laxmisomi;

import java.util.*;
public class MinMaxValues {

	public static int MaxValue(int[] array)
	{
		int maxa1=array[0];
		for(int i=1;i<array.length;i++) {
			if(array[i] > maxa1) {
			maxa1= array[i];				
	}
		}
		return maxa1;
	}
	
	public static int MinValue(int[] array) 
	{
		int mina1=array[0];
		for(int i=1;i<array.length;i++)
		{
			if(array[i] < mina1)
			{
				mina1=array[i];
			}
		}
		return mina1;
	}
	
	
	public static void main(String[] args) {
		System.out.println("please enter array size");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int[] a=new int[size];
		System.out.println("please enter number of elements");
		for(int i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
			
		}
		
		int m1=MaxValue(a);
		int m2=MinValue(a);
		
		System.out.println("max value is" +m1);
		System.out.println("min value is" +m2);
		
	}
			
			
			
			
			
		
		
		
	
	
	
}

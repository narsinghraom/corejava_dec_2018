package com.vtalent.varshini;
import java.util.*;
public class MinMax {
	
	public static int Max(int[] array)
	{
		int max=array[0];
		for(int i=1;i<array.length;i++) {
			if(array[i]>max) {
				max=array[i];
			}
		}
		return max;	
	}
	
	public static int Min(int[] array)
	{
		int min=array[0];
		for(int i=1;i<array.length;i++) {
			if(array[i]<min) {
				min=array[i];
			}
		}
		return min;	
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.out.println("enter the array");
    Scanner sc=new Scanner(System.in);
    int size=sc.nextInt();
    int[] a=new int [size];
    System.out.println("enter the no of elements");
    for(int i=0;i<size;i++)
    {
    	a[i]=sc.nextInt();
    }
    int m1=Max(a);
    int m2=Min(a);
   System.out.println("min value"+m1);
   System.out.println("max value"+m2);
}
}

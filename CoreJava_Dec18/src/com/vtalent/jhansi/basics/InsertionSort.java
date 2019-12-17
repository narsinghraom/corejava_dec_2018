package com.vtalent.jhansi.basics;

public class InsertionSort {
	public static void insertionSort(int array[])
	{
		int n=array.length;
		for(int j=1;j<n;j++ )
		{
			int key=array[j];
			int i=j-1;
			while((i>-1)&&(array[i]>key))
					
			{
				array[i+1]=array[i];
				i--;
			}
			array[i+1]=key;
		}
		
	}
	public static void main(String[] args) {
		int a[]= {100,20,15,30,5,75};
		System.out.println("Before insertion sort");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		insertionSort(a);
		System.out.println("after insertion sort");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}

			}
	

}

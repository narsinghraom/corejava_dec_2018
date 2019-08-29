package com.vtalent.java.haritha;

public class BubblesortExample {
	static void bubblesort(int[] arr) {
		int n=arr.length;
		int temp=0;
		int i,j;
		for(i=0;i<n;i++) {
			for(j=1;j<(n-1);j++)
			{
				if(arr[j-1]>arr[j])
				{
					//swap lements
					temp=arr[j-1];
					arr[j-1]=arr[j];
							arr[j]=temp;
				}
			}
		}
	}
		public static void main(String[] args) {
		int arr[]= {38,52,9,18,6,62,1};
		System.out.println("Array before bubblesort");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+"");
		}	
		System.out.println();
		bubblesort(arr);
		System.out.println("array after bubblesort");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]+"");
	}	
		}
																																																																							
			}

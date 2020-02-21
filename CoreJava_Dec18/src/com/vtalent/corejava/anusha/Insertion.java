package com.vtalent.corejava.anusha;

public class Insertion {
	public static void main(String[] args) {
		int i, j;
		int arr[]={10, 90, 70, 30, 5};
		int n= arr.length;
		for(j=1;j<n;j++)
		{
			int key=arr[j];
			i=j-1;
			while((i>-1)&&arr[i]>key)
			{
				arr[i+1]=arr[i];
				i--;
			}
			
			arr[i+1]=key;
		}
		
		for(int k=0;k<arr.length;k++)
		{
			System.out.println(arr[k]);
			
		}
	}

}

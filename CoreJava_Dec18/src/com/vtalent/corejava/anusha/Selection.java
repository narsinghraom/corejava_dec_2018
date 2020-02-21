package com.vtalent.corejava.anusha;

public class Selection {
	public static void main(String[] args) {
		int arr[]= {20,5, 15,10,1};
		int size=arr.length;
		for(int i=0; i<size-1; i++)
		{
			int min=i;
			
			for(int j=i+1;j<size;j++)
				
			{
				if(arr[j]<arr[min])
				{
					min=j;
				}
			}
			
			int temp=arr[min];
			arr[min]=arr[i];
			arr[i]= temp;			
			
		}
			
		for(int k=0; k<size;k++)
		{
			System.out.println(arr[k]);
		}
	}

}

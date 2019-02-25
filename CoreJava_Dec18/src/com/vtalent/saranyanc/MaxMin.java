package com.vtalent.saranyanc;

public class MaxMin {
	int i,j,max,min,n;
	public void function(int n){
		int arr[]={100,2,101,50,0};
		for(i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}
		max=arr[0];
		min=arr[0];
		for(i=1;i<n;i++)
		{
			if(arr[i]>max)
			{max=arr[i];
			
			}
			if(arr[i]<min)
			{
				min=arr[i];
			}
		}
		System.out.println(max);
		System.out.println(min);
		
	}
	public static void main(String[] args){
		MaxMin m = new  MaxMin() ;
		m.function(5);
		
	}
	

}

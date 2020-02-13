package com.vtalent.vijaya.basic;

public class SecondLargest {
	public static int getSecondLargest(int[] a,int total) {
		int temp;
		for(int i=0;i<total;i++)
		{
			for(int j=i+1;j<total;j++) 
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		return a[total-2];
	}
		public static void main(String[] args) {
		int a[]= { 100,14, 46, 47, 94, 94, 52, 86, 36, 94, 89 };
		System.out.println("second largest-"+getSecondLargest(a,11));
		
			
		}
}	
			



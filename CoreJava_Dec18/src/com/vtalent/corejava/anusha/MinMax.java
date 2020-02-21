package com.vtalent.corejava.anusha;

public class MinMax {
	
	public static void main(String[] args) {
		int a[]={ 10, 2, 15, 1, 20, 6};
		int max=a[0];
		int min=a[0];
		for(int i=1; i<a.length-1; i++)
		{
			if(a[i]>max)
			{
				max= a[i];
			}
			if(a[i]<min)
			{
				min=a[i];
			}
		}
		
		System.out.println("Maximum Value: "+ max );
		System.out.println("Minimum Value : "+ min);
	}

}

package com.vtalent.java.venkatesh;

public class BubbleSort {
public static void main(String[] args) {
	int[]a= {4, 2, 1, 5, 3};
	for(int i=0;i<a.length;i++)
	{
		for(int j=0;j<a.length;j++)
		{
			if(a[i]<a[j])
			{
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
	}
		System.out.println("printing sorted list......");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
}	



package com.vtalent.srinu;

public class SelectionSort {

	public static void main(String[] args) {
		
	int temp=0;
		
		int a[]={7,5,9,6,12};
		for(int i=0;i<a.length-1;i++)
			{
			int min=i;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[j]<a[min])
				{
					min=j;
				}
			}
			if(min!=i)
			{
				temp=a[i];
				a[i]=a[min];
				a[min]=temp;
			}
			}
			for (int k = 0; k < a.length; k++) {
				System.out.println(a[k]+"");
		
		}
		
		

	}

}

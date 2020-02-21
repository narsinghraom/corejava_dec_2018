package com.vtalent.srinu;

public class BubbleSort {

	public static void main(String[] args) {
		int a[]={78,59,96,52,5};
		int temp=0;
		int f=0;
		for (int i = 0; i < a.length-1; i++) {
			for (int j = 0; j < a.length-1-i; j++) {
				if(a[j]>a[j+1])
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					f++;
				}
				
			}
			if(f==0)
			{
				break;
			}
		}
			for (int k = 0; k < a.length; k++) {
				System.out.println(a[k]+" ");
				
			}
			
		}
		// TODO Auto-generated method stub

	}



package com.vtalent.java.prashanth;

public class BubbleSort {
	
	public static void main(String[] args) {
		int[] a= {30,10,5,6,36};
		int temp,flag=0;
		//for no of rounds 
		for (int i = 0; i < a.length; i++) {
			//intenal loop is to check for the adjacent element
			for (int j = 0; j < a.length-1; j++) {
				//this is for if the adjacent element is greater
				if (a[j]>a[j+1]) {
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					flag=1;
				}
			}
			if (flag==0) {
				break;
				
			}
			
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+"  ");
		}

	}

}

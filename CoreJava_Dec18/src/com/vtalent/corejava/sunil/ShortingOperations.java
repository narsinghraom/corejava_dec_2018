package com.vtalent.corejava.sunil;

public class ShortingOperations {
	 
	public static void main(String[]args) {
	
		int []a= {12,213,345,212,11,24,3,3532,22,1};
		
		for(int i=0;i<10;i++) {
			for(int j=0;j<10;j++) {
				
				if(a[i]<a[j]) {
		        int temp = a[i];
		        a[i]=a[j];
		        a[j]=temp;
				}
			}
		}
		for(int i=0;i<10;i++) {
			System.out.println(a[i]);
		}
		}

}

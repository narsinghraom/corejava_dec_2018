package com.vtalent.corejava.sunil;

public class BubbleShort {

	public static void main(String[] args) {
    int[]a= {12,213,342,1,234,21,434,54,5,60}; 
	for(int i=1;i<10;i++) {
		for(int j=1;j<10;j++) {
			if(a[i]<a[j]) {
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
	}
	System.out.println("print");
		
		  for(int i=1;i<10;i++) { 
			  System.out.println(a[i]); 
			  }
		 
		}
	}



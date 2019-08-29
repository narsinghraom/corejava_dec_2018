package com.vtalent.vinodreddy;

public class BubbleSorting {
	 
	    public static void main(String[] args) {  
	    int[] a = {10, 9, 7, 101, 23, 44, 12, 78, 34, 23};  
	    for(int i=0;i<a.length;i++)  
	    {  
	        for (int j=0;j<a.length;j++)  
	        {  
         if(a[i]<a[j]) 
	            {  
	                int temp = a[i];  
	                a[i]=a[j];  
	                a[j] = temp;   
	            }  
	        }  
	        	
	    }  
	    System.out.println("Printing Sorted List ...");  
	    for(int i=0;i<a.length;i++)  
	    {  
	        System.out.println(a[i]);  
	    }  
	}  
}

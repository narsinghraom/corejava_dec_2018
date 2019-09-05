package com.vtalent.java.haritha;

public class BubblesortExample {
	 public static void main(String[] args) {  
		    int[] a = {99,1,21,34,69,9};  
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
	
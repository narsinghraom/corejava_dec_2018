package com.vtalent.nikitha;

public class MinMax {

	public static void main(String[] args)
	{
     int[] arr= {42,72,81,95,32};
     int max=arr[0];
     int min=arr[0];
     for(int i=1;i<=arr.length-1;i++)
     {
    	 if(arr[i]>max)
    	 {
    		 max=arr[i];
    	 }
    	 if(arr[i]<min)
    	 {
    		 min=arr[i];
    	 }
     }
     System.out.println("The max number is"+max);
     System.out.println("The min number is"+min);

	}

}

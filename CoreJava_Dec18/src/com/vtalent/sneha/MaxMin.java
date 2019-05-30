package com.vtalent.sneha;

public class MaxMin {
	public static void main(String[] args) 
	{
		int a[] = new int[] {3,7,10,0,1};

		int min = a[0]; //  assume first elements as smallest number
		int max = a[0]; //  assume first elements as largest number

		for (int i = 1; i < a.length; i++)  // iterate for loop from arrays 1st index (second element)
		{
			if (a[i] > max) 
			{
				max = a[i];
			}
			if (a[i] < min) 
			{
				min = a[i];
			}
		}

		System.out.println("Max Number in a given array is : " + max);
		System.out.println("Min  Number in a given array is : " + min);
	}


}

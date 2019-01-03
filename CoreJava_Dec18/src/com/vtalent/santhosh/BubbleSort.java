package com.vtalent.santhosh;

public class BubbleSort {

	public static void main(String[] args) {
		int[] intArray={30,50,-5,-10,9,15};
		for(int i=intArray.length-1;i>0;i--)
		{
			for(int j=0;j<i;j++)
			{
				if(intArray[j]>intArray[j+1])
				{
					swap(intArray,j,j+1);
				}
			}
		}
		for(int i=0;i<intArray.length;i++)
		{
			System.out.println(intArray[i]);
		}
		
		
		
	}
	public static void swap(int[] array,int i,int j)
	{
		if(i==j){
			return;}
		int temp=array[i];
		array[i]=array[j];
		array[j]=temp;
	}
	



}

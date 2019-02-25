package com.vtalent.saranyanc;

public class Bubble {
	int i,j ,n,temp;
	
	public   void  function(int n)
	
	{
int arr[]={50,25,72,151,200};
		
		for(i=0;i<n;i++)
		{	
		System.out.println(arr[i]);
		}
	
		for(i=0;i<n-1;i++)
		{
			for(j=0;j<n-i-1;j++)
			{
				
				if(arr[j]> arr[j+1])
				{temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
				
				}
				}
			}
			for(i=0;i<n;i++)
			{
				System.out.println(arr[i]);
			 		
			}
				
			
		}
		
	
	
public static void main(String[] args){
	
Bubble b= new Bubble();
	
	b.function(5);

}
}

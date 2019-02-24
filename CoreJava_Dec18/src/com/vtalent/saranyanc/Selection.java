package com.vtalent.saranyanc;

public class Selection {
	int i,j,n,temp;
	public void function(int n){
		int arr[]={10,500,15,5,71};
		for(i=0;i<n;i++)
		{System.out.println(arr[i]);}
			
	
	for(i=0;i<n-1;i++)
	{
		for(j=i+1;j<n;j++)
		{
			if(arr[i]>arr[j])
			{temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			
			}
		}
		}
		for(i=0;i<n;i++)
		{
	
	System.out.println(arr[i]);
		}
	}
	
	public static void main(String[] args){
		Selection s=new Selection();
		s.function(5);
	}
	}
	

		
	



package com.vtalent.sanjana;
import java.util.Scanner;

public class Basic {
Scanner sc=new Scanner(System.in);
	public void primeNumber() {
		System.out.println("Enter the number to check prime or not");
		int x=sc.nextInt();
		int count=0;
		for(int i=2;i<=x/2;i++)
		{
			int r=x%i;
			if(r==0)
			{
				count++;
			}
		}
		if(count==0)
		{
			System.out.println(x+ " is a prime number");
			
		}
		else
		{
			System.out.println(x+ " is not a prime number");
		}
	}
    public void factorial()
    {
    	System.out.println("Enter the number to find factorial");
    	int x=sc.nextInt();
    	int fact=1;
    	for(int i=x;i>=1;i--)
    	{
    		fact=fact*i;
    	}
    	System.out.println("factorial of "+x+" is "+fact);
    }
    public void fibonacci()
    {
    	System.out.println("Enter the length of fibonacci to print");
    	int x=sc.nextInt();
    	int n1=0,n2=1,n3;
    	System.out.print(n1+" "+n2);
    	for(int i=0;i<=x;i++)
    	{
    		n3=n1+n2;
    		n1=n2;
    		n2=n3;
    		System.out.print(" "+n3);
    	}
    }
    public void minmax()
    {
    	System.out.println("Min and Max values of given Array:{3,7,10,0,1}");
    	int a[]= {3,7,10,0,1};
    	int min=a[0];
    	for(int i=1;i<a.length;i++)
    	{
    		if(a[i]<min)
    	    min=a[i];
    	}
    	System.out.println("Min Value is "+min);
    	int max=a[0];
    	for(int i=1;i<a.length;i++)
    	{
    		if(a[i]>max)
    	    max=a[i];
    	}
    	System.out.println("Max Value is "+max);
    }
  
}

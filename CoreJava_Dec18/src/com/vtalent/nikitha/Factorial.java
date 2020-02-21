package com.vtalent.nikitha;

public class Factorial {

	public static void main(String[] args) 
	{
int n=5,fact=1;
for(int i=1;i<=n;i++)
{
	fact=i*fact;
}
System.out.println("factorial of  "+n+" is "+fact);
	}

}

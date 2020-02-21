package com.vtalent.nikitha;

public class palimdrome {

	public static void main(String[] args)
	{
int num=565;
int temp,rem,sum=0;
temp=num;
while(num>0)
{
	rem=num%10;
	sum=(sum*10)+rem;
	num=num/10;
}
if(temp==sum)
{
	System.out.println("Given number "+temp+" is palimdrome");
}
else
{
System.out.println("Given number "+temp+" is not a palimdrome");

	}

}
}
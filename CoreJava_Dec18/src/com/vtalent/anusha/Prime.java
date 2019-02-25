package com.vtalent.anusha;

class Prime {
	
	public static void main(String[] args) {
		int count=0,num=2,i;
		for(i=1;i<=num;i++);
		{
		if(num%i==0)
		{
			count++;
		}
		}
		if(count==2)
		{
			System.out.println("the number is  a prime");
		}
			else {
				System.out.println("the number is not a prime");	
			}

	}
	
}
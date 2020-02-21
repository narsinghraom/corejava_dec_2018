package com.vtalent.nikitha;

public class Fibonacci {

	public static void main(String[] args) 
	{
      int a=0,b=1,c;
      int n=8;
      System.out.println(a);
      System.out.println(b);
      for(int i=0;i<=n;i++)
      {
    	  c=a+b;
    	  System.out.println(c);
    	  a=b;
    	  b=c;
      }
    		  
	}

}

package com.vtalent.mamathasri1;
class Overloding{
static int add(int l,int m)
{
	return l+m;
	//System.out.println("priya");	
}
static int add(int k,int j,int h)
{
	return k+j+h;
	//System.out.println("priya");	
}
public static void main(String args[])
{
System.out.println(Overloding.add(1,2));
System.out.println(Overloding.add(1,2,3)); 
}	
}

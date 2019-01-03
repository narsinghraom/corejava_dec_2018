package com.vtalent.chamu.OOPS;
public class Cal_Test 
{
	public static void main(String[] args) 
	{
			Calculator c1 = new Cal_Impl();
			System.out.println(c1.add(2,5));
			System.out.println(c1.sub(2,5));
			System.out.println(c1.mul(2,5));
			System.out.println(c1.div(2,5));
	}

}
	
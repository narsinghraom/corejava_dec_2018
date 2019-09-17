   package com.vtalent.laxmisomi;

interface Abc{
	public static final float pi=3.14f;
	int k=0;
	public abstract void function (int x);
	public void function (int x, int y); 
}
class AbcImp implements Abc{
	int k;
	public void function (int x) 
	{
		System.out.println((int)pi + x);
		System.out.println(k);
	}
	public void function( int x, int y)
	{
		//pi=pi+0;
		k=k+ (x*y);
		System.out.println(Abc.k);
		System.out.println(k);
	
	}
	
	public void function()
	{
		System.out.println(k);
	}
}

public class AbcTest {
public static void main(String[] args) {
	/*
	 * AbcImp abc = new AbcImp();
	 */
	/*
	abc.k =5;
	abc.function(abc.k);
	abc.function(abc.k, abc.k);
	abc.function();
	*/

	Abc oe = new AbcImp();
	//oe.k=5; 
	oe.function(2);
	oe.function(2,3);
	//oe.function();
	
	
} 

}

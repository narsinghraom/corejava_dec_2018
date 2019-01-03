package com.vtalent.chamu.OOPS;
public class Test_FST
{
	public static void main(String[] args) 
	{
		First first = new First();
		first.fun(2);
		first.fun(2,3);
		System.out.println(first.i);
		System.out.println(first.j);
		
		Second second = new Second();
		second.fun(2);
		second.fun(2, 3);
		System.out.println(second.i);
		System.out.println(second.j);
		
		Third third = new Third();
		third.fun(2);
		third.fun(2,3);
		System.out.println(third.i);
		System.out.println(third.j);
		
		First obj = new Second();
		obj.fun(2);
		obj.fun(2,3);
		System.out.println(obj.i);
		System.out.println(obj.j);
		
		First obj1 = new Third();
		obj1.fun(2);
		obj1.fun(2,3);
		System.out.println(obj1.i);
		System.out.println(obj1.j);
		
		Second obj2 = new Third();
		obj2.fun(2);
		obj2.fun(2,3);
		System.out.println(obj2.i);
		System.out.println(obj2.j);	
		

	}

}

package com.vtalent.mamathasri1;
 class team  {
	 void add()
	 {
	 System.out.println("hello");
	 
	 }
}
class Overriding extends team
{
	void add()
	{
		System.out.println("super");
	
	}
public static void main(String args[])
{
	
	team obj=new  Overriding();
obj.add();

}
}


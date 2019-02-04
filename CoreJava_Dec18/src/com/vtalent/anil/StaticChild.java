package com.vtalent.anil;


 class StaticParent 
{
	 protected void Sum()
	 {
		 System.out.println("this is private sum");
	 }
	public static void main(String[] args)
	{
	System.out.println("this is saticparent");

	}

}
public class StaticChild extends StaticParent
{
	private void sum()
	{
		System.out.println("this private sum in child ");
	}
	public static void main(String[] args) 
	{
		StaticChild s=new StaticChild();
		//s.sum();
		StaticParent p=new StaticParent();

		s.sum();
			
		p.Sum();
		
	}
}


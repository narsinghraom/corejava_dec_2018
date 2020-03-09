package com.vtalent.suma3;

/* Local Inner Class*/

public class LocalInner {
	int i;
	public void function() {
		class Local
		{
			int k;
			public void function() {
				System.out.println(k);
				System.out.println("This is Local Inner Class Method");
			}
		}
		Local l1=new Local();
		l1.k=5;
		l1.function();
	}
public static void main(String[] args)
{
	LocalInner l1=new LocalInner();
	l1.function();
}
}

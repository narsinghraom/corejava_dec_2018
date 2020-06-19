package com.vtalent.suma3;

interface Abc3
{
public void function();
}
public class Test15
	{
		public void display(Abc3 abc)
		{
			abc.function();
		}
		public static void main(String[] args)
		{
			Test15 t1=new Test15();
			t1.display(new Abc3() {
				public void function() {
					System.out.println("Anonymous Class");
				}
			});
		}
}
	

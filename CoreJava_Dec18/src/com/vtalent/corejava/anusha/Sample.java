package com.vtalent.corejava.anusha;

public class Sample {
		int x, y;
		static float f1;
		static {
			System.out.println("Anusha");
		}

		public void function()
		{
			method();
			x=5;
			y=10;
			f1=1.5f;
		}
		
		public void method()
		{
			System.out.println("world");
		}
		public static void fun()
		{
			int z=10; 
			System.out.println("sample1");
			System.out.println(z);
			Sample sample1= new Sample();
			sample1.function();
			System.out.println(sample1.x);
			}

	public static void main(String[] args) {
		Sample sample= new Sample();
		sample.function();
		fun();
		System.out.println("sample1");
		System.out.println(sample.x+sample.y);
		System.out.println(f1);// System.out.println(sample.f1)y
		System.out.println(sample);
	}

}

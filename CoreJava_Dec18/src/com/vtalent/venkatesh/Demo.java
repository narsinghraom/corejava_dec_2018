package com.vtalent.venkatesh;

public class Demo {

	int i, j;
		static float f1, f2;
	
		public void FunctionOne() {
			i = 5;
			j = 7;
		}
	
		public static int FunctionTwo(float f1) {
			Demo.f1 = f1 + Demo.f1;
			f2 = Demo.f1 + f1;
			return (int) f1;
		}
	
		public static void main(String args[]) {
			Demo demo = new Demo();
			demo.FunctionOne();
			int k = FunctionTwo((float) demo.i);
			System.out.println(demo.i + demo.j);
			System.out.println(f1 + f2);
			;
		}
	
	
	

}

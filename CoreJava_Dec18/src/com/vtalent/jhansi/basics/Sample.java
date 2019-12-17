package com.vtalent.jhansi.basics;

public class Sample {
	
		int a,b;
		static int c;
		public void function(int c)
		{
			a=c;
			b=c+5;
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			c=10;
			Sample sam=new Sample();
			sam.function(c);
			System.out.println(sam.a+sam.b+c);

}
}

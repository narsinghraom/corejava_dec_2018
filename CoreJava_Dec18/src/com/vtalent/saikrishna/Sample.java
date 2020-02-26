package com.vtalent.saikrishna;


public class Sample {

		int x,y;
		static float f;
		public void function()
		{
			x=5;
			y=10;
			f=2.5f;
			
			
		}
		public static void main(String[] args) {
		
			Sample s= new Sample();
			s.function();
			System.out.println(s.x+s.y);
			System.out.println(f);
			System.out.println(s);
			
			
		}

	}



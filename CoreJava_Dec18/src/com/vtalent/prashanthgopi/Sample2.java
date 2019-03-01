package com.vtalent.prashanthgopi;

public class Sample2 {
		long l1,l2;
		static float f1,f2;
		public int function (long l1, long l2) {
			this.l1=l1+l2;                   //2+5
			this.l2=l1*l2;                   //2*5
			return (int) (this.l1+this.l2);
			}
	   public static void function(float f1, float f2) {
		  // Sample2.f1=f1+f2;
		   Sample2.f2=f1-f2;
		   }
	      public static void main(String[] args) {
			Sample2 sample=new Sample2();
			int k=sample.function(2, 5);       //7+10=17
			function ((float)k, (float)k+1);
			System.out.println(k);             //17
			System.out.println(sample.l1);     //2+5=7
			System.out.println(sample.l2);     //2*5=10
			System.out.println(sample);        //Sample@garbageValue as for our machine
		}
	}




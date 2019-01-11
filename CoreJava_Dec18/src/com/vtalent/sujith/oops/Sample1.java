package com.vtalent.sujith.oops;

public class Sample1 {

	float f1,f2;
	void function (float f1,  float f2) {
		this.f1=f1+f2;
		this.f2=f2+this.f2;
	}
	public void function(long l) {
		this.f1=this.f1+(float)l;
	}
}
	class SampleOne1 extends Sample1{
		float f1;
		long l2;
	
		public void function(long l2) {
			this.l2=this.l2+l2;
		
	}
		public void function(char ch) {
			System.out.println(ch);
		}
}
	class SampleTwo extends SampleOne1{
		
		public void function(long l2) {
			this.l2=this.l2+l2;
		
	}
		
	}
	
	

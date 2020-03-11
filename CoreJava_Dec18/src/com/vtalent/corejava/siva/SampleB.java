package com.vtalent.corejava.siva;

public class SampleB {
	int x,y;
	float f1=2.0f;
	float f2=3.0f;
	 SampleB sampleB;
	
	public static void function(SampleB B){
		SampleB sample = new SampleB();
		sample.f1=10.0f;
		sample.f2=10.0f;
		sample.demo();	
		
	}

	public void demo() {
	  sampleB=new SampleB();
	  sampleB.x=5;
	  sampleB.y=10;
		x=10;
		y=20;
		sampleB.x=sampleB.x+sampleB.x;
		sampleB.y=sampleB.x*sampleB.y;
		System.out.println(sampleB.x);
		System.out.println(sampleB.y);
		
		float k=sampleB.Id();
		f1=k;
		f2=f1+f2;
		System.out.println(f1);
		System.out.println(f2);
	}
	public  float Id(){
		f1=f1+f1;
		f2=f1*f2;
		return f1+f2;	
	}

	public static void main(String[] args) {		
		function(new SampleB());
		
	}

}

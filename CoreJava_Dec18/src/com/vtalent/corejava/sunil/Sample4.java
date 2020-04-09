package com.vtalent.corejava.sunil;

public class Sample4 {
	int i,j;
	Sample4 d;
	public Sample4 function(Sample4 s1){
	d=new Sample4();
	d.d=new Sample4();
	d.d.d=s1;
	d.d.i=s1.i+s1.j;
	d.d.j=s1.i*s1.j;
	return d.d;
	}
	public static void main(String[] args) {
		//Sample4 d=new Sample4();
		Sample4 s1=new Sample4();	
		  s1.i=7; 
		  s1.j=5;
		 
	Sample4 s2=s1.function(s1);
	System.out.println(s2.i+s2.j);
	System.out.println(s1.i+s1.j);
	System.out.println(s1.d.i+s1.d.j);
	System.out.println(s2.i+s2.d.i);
	System.out.println(s2.j+s2.d.j);
	}

}

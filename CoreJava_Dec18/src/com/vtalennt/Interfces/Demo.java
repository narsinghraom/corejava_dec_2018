package com.vtalennt.Interfces;

public class Demo {

	public static void main(String[] args) {
	A a=new m1();
	a.sum(5);
	a.sum(5, 5);
	//a.sub(2.3);this method is not present in A interface
	m1 m=new m1();
	m.sum(5);
	m.sum(2, 6);
	m.sub(4,2);
	 
	B b=new m2();
	b.mul(5);
	b.div(10, 5);

	m2 ma=new m2();
	ma.sum(5);
	ma.sum(5, 5);
	ma.sub(7, 2);
	ma.div(7, 2);
	ma.mul(5);
	
	c c=new m3();
	c.div(7, 2);
	c.mul(5);
	c.sum(5);
	c.sum(5, 6);
	//c.sub(7,2) not available this method is not present in any of the interfaces this method is present in class
	
	m3 ma1=new m3();
	ma1.div(7, 2);
	ma1.mul(4);
	ma1.sub(7, 3);
	ma1.sum(4, 5);
	ma1.sum(6);
	
	d d=new m4();
	d.div(5, 4);
	d.sum(6, 4);
	//these two methods are only defined in that interface so other methods are not available
	m4 mm=new m4();
	mm.div(5, 7);
	mm.mul(6);  
	mm.sub(6, 5);
	mm.sum(5, 3);
	mm.sum(5);
	// through inheritance concept all methods are available to the above particular class
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	

	}

}

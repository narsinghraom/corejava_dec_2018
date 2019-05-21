package com.vtalent.raju;

public class DemoTwo {
	int i,j;
	DemoTwo d;
	public DemoTwo function()
	
	{
		d=new DemoTwo();
		d.d=new DemoTwo();
		d.d.i=5;
		d.d.j=7;
		return d.d;
		
	}
	public static void main(String[] args) {
		
		DemoTwo d1=new DemoTwo();
		d1.d=new DemoTwo();
		d1.d.i=d1.j;
		d1.d.j=d1.i;
		System.out.println(d1.i+d1.j);
		Object di;
		System.out.println(d1.d.i+di.dj);
		
		
	}

}

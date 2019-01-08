package com.vtalent.hanu.oops;

public class Test_Oopsss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ABCImpl i1= new ABCImpl();
		System.out.println(i1.function(5));
		System.out.println(i1.function(2,10));
		i1.dispaly();
		
		ABC ab= new ABCImpl();
		System.out.println(ab.function(5));
		System.out.println(ab.function(10,10));
		//ab.display();
		
		ABC abc= new XYZImpl();
		System.out.println(abc.function(2));
		System.out.println(abc.function(2,2));
		//System.out.println(abc.function());
		
		XYZ xyz= new XYZImpl();
		System.out.println(xyz.function(2));
		System.out.println(xyz.function(2,2));
		xyz.function();
		
		Mnr mnr= new MnrImpl();
		System.out.println("From mnr");
		mnr.function();
		
		
	}

}

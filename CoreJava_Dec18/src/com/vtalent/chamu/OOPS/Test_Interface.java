package com.vtalent.chamu.OOPS;

public class Test_Interface {

	public static void main(String[] args) 
	{
		//Abc abc = new Abc(); [cannot create object for interfaces]
		
		AbcImpl abc1 = new AbcImpl();
		System.out.println(abc1.function(2));
		System.out.println(abc1.function(2,5));
		abc1.display();

		Abc abc2 = new AbcImpl();
		System.out.println(abc2.function(2));
		System.out.println(abc2.function(2,5));
		//abc2.display();
		//[cannot call this method with reference abc2(Abc interface doesn't contain display method)] 
		
		Abc abc3 = new XyzImpl();
		System.out.println(abc3.function(2));
		System.out.println(abc3.function(2,5));
		//abc3.function();
		
		Abc abc4 = new MnrImpl();
		System.out.println(abc4.function(2));
		System.out.println(abc4.function(2,5));
		//abc4.function();
		
		/*AbcImpl abc6 = new XyzImpl();
		AbcImpl abc5 = new MnrImpl();*/
				
		Xyz xyz = new XyzImpl();
		System.out.println(xyz.function(2));
		System.out.println(xyz.function(2,5));
		xyz.function();
				
		//Xyz xyz1 = new AbcImpl();
		Xyz xyz2 = new MnrImpl();
		System.out.println(xyz2.function(2));
		System.out.println(xyz2.function(2,5));
		xyz2.function();
		//xyz2.display();
		
		XyzImpl xyz3 = new MnrImpl();
		System.out.println(xyz3.function(2));
		System.out.println(xyz3.function(2,5));
		xyz3.function();
							
		Mnr mnr = new MnrImpl();
		System.out.println(mnr.function(2));
		System.out.println(mnr.function(2,5));
		mnr.function();
		
		//MnrImpl mnr1 = new AbcImpl();
		//MnrImpl mnr2 = new XyzImpl();
						
	}

}

package com.vtalent.sujith.oops;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbcImp abc=new AbcImp();
		abc.function(2);
		abc.function(2, 5);
		abc.display();
		
		Abc abc1=new AbcImp();
		abc1.function(2);
		abc.function(2, 5);
		abc.display();
		
		Abc abc2=new XyzImp();
		System.out.println(abc2.function(2));
		System.out.println(abc2.function(2,5));
		//abc2.function();
		
		Xyz xyz=new XyzImp();
		System.out.println(xyz.function(2));
		System.out.println(xyz.function(2, 5));
		xyz.function();
		
		//Mnr mnr=new MnrImp();
		
		
	}

}

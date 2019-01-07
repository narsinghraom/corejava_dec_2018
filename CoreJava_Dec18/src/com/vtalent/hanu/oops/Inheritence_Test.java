package com.vtalent.hanu.oops;

public class Inheritence_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		First f= new First();
		f.function(2);
		f.function(2,3);
		System.out.println(f.i);
		System.out.println(f.j);
		
		Second s= new Second();
		s.function(2);
		s.function(2,3);
		System.out.println(s.i);
		System.out.println(s.j);
		
		Third t= new Third();
		t.function(2);
		t.function(2,3);
		System.out.println(t.i);
		System.out.println(t.j);
	}

}

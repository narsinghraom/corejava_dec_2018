package com.vtalent.rakesh;

public class SingleInheritance {
	public static void main(String[] args) {
		First first = new First();
		first.function(5);
		Second second = new Second();
		second.function(5, 5);
		second.function(7);
		System.out.println(second.j);
		System.out.println(first.j);
		System.out.println(first.i);
		System.out.println(second.i);
		Third third = new Third();
		int l = third.function(1);
		System.out.println(l);
		System.out.println(third.i);
		
		First fourth1 = new Fourth();
		Fourth fourth = new Fourth();
		fourth.function(4);
		first.function(5);
		System.out.println(fourth.function(4));

	}

}
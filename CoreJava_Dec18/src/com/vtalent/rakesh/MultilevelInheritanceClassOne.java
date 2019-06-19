package com.vtalent.rakesh;

public class MultilevelInheritanceClassOne {
	int x;

	public MultilevelInheritanceClassOne(int i) {
		this.x = i;
	}

	public void function() {
		System.out.println("ClassOne");

	}

	public static void main(String args[]) {
		MultilevelInheritanceClassOne q3 = new MultilevelInheritanceClassOne(10);
		// ClassThree q = new ClassThree();
		// q.function();
		// ClassTwo q1 = new ClassThree();
		// q1.function();

		// q3 = (MultilevelInheritanceClassOne) q;
		System.out.println(q3.x);
	}
}

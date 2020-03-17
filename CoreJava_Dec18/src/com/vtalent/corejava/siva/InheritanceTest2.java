package com.vtalent.corejava.siva;

class First1 {
	int i, j;

	public void funtionOne(int i) {
		this.i = this.i + i;
		j = this.j + j;
		System.out.println("Void Type is Called");
	}
}

class Second1 extends First1 {
	int j;
public void functionThree(int i, int j) {
		this.j = this.j + j;
		super.j = super.j + this.j;
		System.out.println(super.j);
		this.i = this.i + i;
	}

}

class Third extends First1 {
	public int function(int i) {
		System.out.println("int Type is Called");
		return i * i;
	}

	class Four extends First1 {

		public int function(int i) {
			return 1;
		}
	}
}
public class InheritanceTest2 {

	public static void main(String[] args) {
		First1 f = new First1();
		f.funtionOne(5);

		Second1 s = new Second1();
		s.functionThree(5, 5);
		s.funtionOne(7);

		Third d = new Third();
		d.function(15);
		int k = d.function(10);
		System.out.println(k);

		System.out.println(s.j);
		System.out.println(s.i);
	}

}

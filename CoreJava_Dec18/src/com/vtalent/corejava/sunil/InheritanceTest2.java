package com.vtalent.corejava.sunil;


class First {
	int i, j;    

	public void funtionOne(int i) {
		this.i = this.i + i;
		j = this.j + j;
		System.out.println("Void Type is Called");
	}
}

class Second extends First {
	int j;

	public void functionThree(int i, int j) {
		this.j = this.j + j;
		super.j = super.j + this.j;//0+5=5;
		System.out.println(super.j);//5
		this.i = this.i + i;
	}

}

class Third extends First {
	public int function(int i) {
		System.out.println("int Type is Called");
		return i * i;       //15*15=225;
	}

	class Four extends First {

		public int function(int i) {
			return 1;
		}
	}
}

public class InheritanceTest2 {
	public static void main(String[] args) {
		First f = new First();
		f.funtionOne(5);

		Second s = new Second();
		s.functionThree(5, 5);
		s.funtionOne(7);

		Third d = new Third();
		d.function(15);
		int k = d.function(10);   
		System.out.println(k);   //100;

		System.out.println(s.j);  
		System.out.println(s.i);
	}
}

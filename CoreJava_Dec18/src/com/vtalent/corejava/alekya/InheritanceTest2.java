package com.vtalent.corejava.alekya;

class FirstA {
	int i, j;

	public void funtionOne(int i) {
		this.i = this.i + i;
		j = this.j + j;
		
		
		System.out.println("Void Type is Called");
	}
}

class SecondA extends FirstA {
	int j;

	public void functionThree(int i, int j) {
		this.j = this.j + j;
		super.j = super.j + this.j;
		System.out.println(super.j);
		this.i = this.i + i;
	}
}
class ThirdA extends FirstA {
	public int function(int i) {
		System.out.println("int Type is Called");
		return i * i;
	}

	class FourA extends FirstA {

		public int function(int i) {
			return 1;
		}
	}
}

public class InheritanceTest2 {
	public static void main(String[] args) {
		FirstA f = new FirstA();
		f.funtionOne(5);

		SecondA s = new SecondA();
		s.functionThree(5, 5);
		s.funtionOne(7);

		ThirdA d = new ThirdA();
		d.function(15);
		
		int k = d.function(10);
		System.out.println(k);

		System.out.println("value is" +  s.j);
		System.out.println(s.i);	
		
			}
}

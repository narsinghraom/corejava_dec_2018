package com.vtalent.prashanth;

class Multiplication {
	int i,j,k;
	public void mul(int i,int j) {
		this.i = i * j;
		k = j * this.i;
	}
}
class Substraction extends Multiplication {
	int j;
	public void sub(int j) {
		this.j = j - k;
		i = this.j + j;
	}
}
class Addition extends Substraction{
	int i;
	public void add(int i) {
		this.i = i + k;
		j = this.i + i;
	}
}

public class Inheritance2 {

	public static void main(String[] args) {
		Multiplication m = new Multiplication();
		m.mul(2,3);
		System.out.println(m.i * m.j);
		System.out.println(m.i * m.k);
		Substraction s = new Substraction();
		s.sub(6);
		System.out.println(s.i - s.j);
		Addition a = new Addition();
		a.add(10);
		System.out.println(a.i + a.j + a.k);

	}

}

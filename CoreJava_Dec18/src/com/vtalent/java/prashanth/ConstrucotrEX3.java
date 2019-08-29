package com.vtalent.java.prashanth;

public class ConstrucotrEX3 {
	int i, j;

	ConstrucotrEX3() {
		//this(i); change i to static
		this(2);
		i = 5;
		j = 7;
	}

	ConstrucotrEX3(int i) {
		this(5,3);
		this.i = this.i + i;// 
		System.out.println("This value of one arguments con "+this.i);
		j = j + this.i;// 
	}

	ConstrucotrEX3(int i, int j) {
		
		this.i = this.i + i;// 0+5=5
		this.j = this.j * j;// 0+
		System.out.println("This value of two arguments con "+this.i);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstrucotrEX3 e1 = new ConstrucotrEX3();
		// ConstructorEx2 e2=new ConstructorEx2(2);
		// ConstructorEx e3=new ConstructorEx(3,5);
		System.out.println(e1.i + e1.j);//12
		// System.out.println(e2.i+e2.j);//21
		// System.out.println(e3.i+e3.j);

	}
}

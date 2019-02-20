package com.vtalent.ashwanth;

public class ConstructorEx {
	int x, y;

	ConstructorEx() {
		x = 5;
		y = 7;
		System.out.println();
		System.out.println("0 arg");
		System.out.println("0 arg x :" + x);
		System.out.println("0 arg y :" + y);
	}

	ConstructorEx(int x) {
		this(); // call goes to 0 arg con
		System.out.println("this x in 1 arg:"+(this.x));
		System.out.println("general x in 1 arg:"+x);
		System.out.println("y in 1 arg:"+y);
		this.x = this.x + x;//5+5=10
		y = y + x;//7+5=12
		System.out.println();
		System.out.println("1 arg");
		System.out.println("1 arg x :" + x);
		System.out.println("1 arg y :" + y);

	}

	ConstructorEx(int x, int y) {
		this(x);
		this.x = this.x + x;
		this.y = this.y + y;
		System.out.println();
		System.out.println("2 arg");
		System.out.println(" 2 arg x :" + x);
		System.out.println("2 arg y :" + y);
	}

	public void function() {
		System.out.println("function result");
		System.out.println("combination this.x and y=y+x :"+(x + y));//10+12=22
	}

	public static void main(String[] args) {
		// ConstructorEx c1=new ConstructorEx();
		ConstructorEx c2 = new ConstructorEx(5);
		// ConstructorEx c3=new ConstructorEx(2,6);
		c2.function();
	}
}

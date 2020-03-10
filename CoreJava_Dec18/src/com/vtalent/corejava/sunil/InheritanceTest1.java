package com.vtalent.corejava.sunil;

class Demo1 {
	int x, y;
	
	public void functionThree(int x, int y) {
		this.x = this.x + x;
		this.y = this.y + y;
	}
}

class Demo2 extends Demo1 {
	static int z;
	int x;

	public void functionTwo(int x) {
		this.x = this.x + x + z;
	}
}

class Demo3 extends Demo2 {
	public void functionOne() {
		System.out.println(x);//3
		System.out.println(y);//2
	}

}

public class InheritanceTest1 {
	public static void main(String[] args) {
		Demo1 d = new Demo3();
		d.functionThree(5, 2);

		Demo2 d2 = new Demo3();
		d2.functionTwo(3);
		d2.functionThree(3, 2);

		Demo3 d3 = new Demo3();
		d3.functionTwo(3);
		d3.functionThree(3, 2);
		d3.functionOne();

		System.out.println(d.x + "  " + d.y);  //5 , 2
		System.out.println(d2.x + "  " + d2.y);//3,2
		System.out.println(d3.x + "  " + d3.y);//3,2
	}
}

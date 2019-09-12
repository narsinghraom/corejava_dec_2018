package com.vtalent.prashanth;

class First2{
	int x,y;
	public int function(int x) {
		this.x = this.x + x;
		y = y + x;
		return x;
	}
}
class Second2 extends First2{
	int y;
	public int function(int y) {
		this.y = this.y + y;
		x = x+y;
		return y;
	}
	public int function(int x,int y) {
		this.x = this.x + x;
		this.y = this.y + y;
		return x + y;
	}
}
class Third2 extends Second2{
	int x;
	public int function(int x,int y) {
		this.x = this.x + x;
		this.y = this.y + y;
		return x + y;
	}
}

public class Polymorphism3 {

	public static void main(String[] args) {
		Third2 t1 = new Third2();
		int k = t1.function(5);
		k = t1.function(k, k);
		System.out.println(k);
		System.out.println(t1.x + t1.y);
		
		Second2 s1 = new Third2();
		k = s1.function(k);
		k = s1.function(k, k);
		System.out.println(k);
		System.out.println(s1.x + s1.y);
		
		First2 f1 = new Third2();
		k = f1.function(k);
//		k = f1.function(k, k);
		System.out.println(k);
		System.out.println(f1.x + f1.y);
		
		First2 f2 = new Second2();
		k = f2.function(k);
//		k = f2.function(k,k);
		System.out.println(k);
		System.out.println(f2.x + f2.y);
		
		First2 f3 = new First2();
		k = f3.function(k);
		System.out.println(k);
		System.out.println(f3.x + f3.y);
		
		Second2 s2 = new Second2();
		k = s2.function(k);
		k = s2.function(k, k);
		System.out.println(k);
		System.out.println(s2.x + s2.y);

	}

}

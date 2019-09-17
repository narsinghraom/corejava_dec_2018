package com.vtalent.prashanth;

abstract class Calculation{
	public int add(int x,int y) {
		return x + y;
	}
	public int sub(int x,int y) {
		return x - y;
	}
	public int mul(int x,int y) {
		return x * y;
	}
	abstract int div(int x,int y);
}
class CarOne extends Calculation{
	public int div(int x,int y) {
		return x/y;
	}
}

public class Abstraction {

	public static void main(String[] args) {
		CarOne co = new CarOne();
		System.out.println(co.add(2, 3));
		System.out.println(co.sub(2, 3));
		System.out.println(co.mul(2, 3));
		System.out.println(co.div(6, 3));

	}

}

package com.vtalent.corejava.suma;
abstract class Calculator{
	public int add(int x, int y){
		return x+y;
		
	}
	public int sub(int x, int y){
		return x-y;
	}
	public abstract int mul(int x, int y);
	public abstract int div(int x, int y);
	
}
class CalculatorOne extends Calculator{
public int mul(int x, int y){
	return x*y;
	 
}
public int div(int x, int y){
	return x/y;
}
}


public class Abstract {
	public static void main(String args[]){
		Calculator c1=new CalculatorOne();
		System.out.println(c1.add(2,5));
		System.out.println(c1.sub(2,5));
		System.out.println(c1.mul(2,5));
		System.out.println(c1.div(2       ,5));

	}

}

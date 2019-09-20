package com.vtalent.prashanth;

interface Abc2{
	public static final float pi=3.14f;
	int k=0;
	public abstract void function(int x);
	public void function(int x,int y);
}
class AbcImp1 implements Abc2{
	int k;
	public void function(int x) {
		System.out.println((int)pi + x);
		System.out.println(k);
	}
	public void function(int x,int y) {
//		pi = pi + x;
		k = k + (x * y);
		System.out.println(Abc2.k);
		System.out.println(k);
	}
	public void function() {
		System.out.println(k);
	}
}

public class AbcTest {

	public static void main(String[] args) {
		AbcImp1 abc = new AbcImp1();
		abc.k = 5;
		abc.function(abc.k);
		abc.function(abc.k, abc.k);
		abc.function();
		
		Abc2 abc1 = new AbcImp1();
//		abc1.k = 5;
		abc1.function(2);
		abc1.function(2, 3);
//		abc1.function();

	}

}

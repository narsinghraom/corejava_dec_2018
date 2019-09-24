package com.vtalent.java.lokesh;

interface Abc1{
	public static final float pi =3.14f;
	int k=0;
	public abstract void function(int x);
	public void function (int x, int y);
}
class AbcImpl implements Abc1{
		int k;
		public void function (int x) {
			System.out.println((int)pi+x);
			System.out.println(k);
		}
	public void function (int x, int y) {
//		pi = pi+x;
		k=k+(x*y); 
		System.out.println(Abc1.k);
		System.out.println(k);
	}
	public void function() {
		System.out.println(k);
	}
}
public class AbcTest{
	public static void main(String[] args) {
		AbcImpl ab = new AbcImpl();
		ab.k=5;
		ab.function(ab.k);
		ab.function(ab.k,ab.k );
		ab.function();
		Abc1 abc = new AbcImpl();
//		abc.k=5;
		abc.function(2);
		abc.function(2,3);
//		abc.function();
	}
		
}

		
		
		


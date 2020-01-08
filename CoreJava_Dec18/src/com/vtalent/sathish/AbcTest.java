package com.vtalent.sathish;





interface Abc1{
	public static final float pi=3.14f;
	public int k=0;
	int i=0;
	public abstract void function(int x);
	public void function(int x,int y);
}
class AbcImpl implements Abc1{
int k;
public void function(int x) {
	System.out.println((int)pi+x);
	System.out.println(k);
	}
public void function(int x,int y) {
	k=k+(x*y);
	System.out.println(Abc1.k);
	System.out.println(k);
}
public void function() {
	System.out.println(k);
}
	
}

public class AbcTest {

	public static void main(String[] args) {
		/*
		 * AbcImpl abc=new AbcImpl(); abc.k=5; abc.function(abc.k);
		 * abc.function(abc.k,abc.k); abc.function();
		 */	
		Abc1 abc=new AbcImpl();
		//abc.k=5;
		abc.function(2);
		abc.function(2, 3);
		
		

	}

}


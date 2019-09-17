package com.vtalent.varshini;

interface Abc12{
public static final float pi=3.14f;
public int k=0;
//int i;
public abstract void function(int x);
public void function(int x,int y);
}
class AbcImpl implements Abc12
{
	int k;
	public void function(int x) {
	System.out.println((int)pi+x);
	System.out.println(k);
}
	public void function(int x,int y) {
		//pi=pi+x;
		k=k+(x*y);
		System.out.println(Abc12.k);
		System.out.println(k);
	}

public void function() {
	System.out.println(k);
}
}

public class Abctest {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		/*
		 * AbcImpl abc=new AbcImpl(); 
		 * abc.k=5;
		 *  abc.function(abc.k); 
		 *  abc.function(abc.k,abc.k); //abc.function();
		 */		
		
    Abc12 abc=new AbcImpl();
    //abc.k=5;
    abc.function(2);
    abc.function(2, 3);
   // abc.function();
	}

}
 
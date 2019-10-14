package com.vtalent.swamy;

 interface Interfa {
	public static final float pi=3.14f;
	int k=45;
	public abstract  void  function(int x);
	void function(int x,int y);
}
class InterfaceEx1 implements Interfa{
int k;
	public void function(int x) {	
	System.out.println((int)pi+x);
	System.out.println(k);
	}
	public void function(int x, int y) {		
		//pi=pi+k;
		k=k+(x*y);
		System.out.println("last:"+k);
		System.out.println(Interfa.k);

	}
	public void function () {
		System.out.println(k);
	}
	public static void main (String []args) {
		InterfaceEx1 in=new InterfaceEx1();
		//Interfa in=new InterfaceEx1();
		in.k=5;
		in.function(2);
		in.function(2,3);
		in.function();
		System.out.println(in.k);
	}
	
}
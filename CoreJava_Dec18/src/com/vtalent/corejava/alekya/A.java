package com.vtalent.corejava.alekya;

public class A {
	int i=1;
	int k=20;
	public int function(int i,int k){
		i=i+k;
		k=i+k;
		this.i=this.i+i;
		this.k=this.k+k;
		return i+k;
	}
	public static void main(String[] args){
		A a1= new A();
		System.out.println(a1.i);
		System.out.println(a1.k);
}
	

}

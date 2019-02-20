package com.vtalent.sri;

public class Remo {
	static Remo remo;
	Remo remo1;
	int i,j;
	public static Remo function(){
		remo=new Remo();
		remo.remo1=new Remo();
		remo.i=10;
		remo.j=20;
		remo.remo1.i=remo.i+remo.j;
		remo.remo1.j=remo.i*remo.j;
		return remo.remo1;
	}
	public static void main(String[] args) {
		remo=function();
		System.out.println(remo.i);
		System.out.println(remo.j);
	} 
}

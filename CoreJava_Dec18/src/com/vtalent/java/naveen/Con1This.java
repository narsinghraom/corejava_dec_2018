package com.vtalent.java.naveen;

public class Con1This {
int i;
int j;
public  Con1This() {
	i=5;
	j=7;
}
public  Con1This(int i) {
	this.i=this.i+i;//5
	j+=this.i;//
	
}
public  Con1This(int i,int j) {
	this.i=this.i+i;//
	j=this.j*j;//
}
	public static void main(String[] args) {
		int k=10;
		int l=10;
		System.out.println("this"+k+l);
		System.err.println("10"+k*l);
		
		Con1This ct=new Con1This();
		System.out.println(ct.i+ct.j);
		Con1This ct1=new Con1This(5);
		System.err.println(ct1.i+ct1.j);
		Con1This ct2=new Con1This(5,3);
		System.out.println(ct2.i+ct2.j);
	}

	

}

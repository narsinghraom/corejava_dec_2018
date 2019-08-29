package com.vtalent.java.lokesh;

public class ThisExone {
int i,j;
ThisExone(){
	i=5;
	j=7;
}
ThisExone (int i) {
	this();
	this.i = this.i+i;
	j= j+this.i;
}
ThisExone(int i, int j) {
	this(i+j);
	this.i = this.i+j;
	this.j= j*this.j;
}
public static void main(String[] args) {
	/*ThisExone e1 = new ThisExone();
	ThisExone e2 = new ThisExone(2);*/
	ThisExone e3 = new ThisExone(3,5);
	System.out.println(e3.i + e3.j);
}
	
}
	
	



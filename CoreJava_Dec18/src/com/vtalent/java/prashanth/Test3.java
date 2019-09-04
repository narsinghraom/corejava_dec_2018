package com.vtalent.java.prashanth;

class Single1{
	int i,j;
	public void function(int i) {
		this.i=this.i*i;
		j=this.i;
	}
}
class Second1 extends Single1{
	int j;
	public void function(int i,int j) {
		this.j=this.j+j;
		this.i=this.i+i;
	}
}
class Test2 extends Second1 {
	int k;
	public void function(int i,int j,int k) {
		this.k=this.k+k;
		this.j=this.k+j;
		this.i=this.k+i;
		//this.k=this.k+k;

		}

}


public class Test3 {

	public static void main(String[] args) {
		Single s1=new Single();
		s1.function(5);
		System.out.println(s1.i+s1.j);
		Second s2=new Second();
		s2.function(3);
		s2.function(5,4);
		Test2 t2=new Test2();
		t2.function(8,9,10);
		System.out.println(s2.i+s2.j);
		System.out.println(t2.i+t2.j+t2.k);

	}

}

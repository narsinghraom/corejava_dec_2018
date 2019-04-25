package com.vtalent.sri;
 class First {
	int i,j;
	public void function(int i) {
		this.i=i+i;
		this.j=this.i+i;
		System.out.println(this.i);
		System.out.println(this.j);
	}
	}

class Second extends First{
int i;
double d1;
public void function(int i,double d1){
	this.i=i*i;
	super.i=super.i+i;
	this.d1=d1;
	j=j+i;
	System.out.println(this.i);
	System.out.println(super.i);
	System.out.println(this.d1);
	System.out.println(j);
}
}
class Test1{
public static void main(String[] args) {
		
		Second s1=new Second();
		s1.function(2);
		s1.function(3,2.5);
		System.out.println(s1.i);
	}

}

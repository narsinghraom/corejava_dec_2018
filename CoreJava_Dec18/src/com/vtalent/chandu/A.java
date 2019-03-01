package com.vtalent.chandu;

class A {
int i,k;
public String toString(){
	return "ivalue="+i+" "+"kvalue="+k;
}
public static void main(String[] args) {
	A a1=new A();
	a1.i=10;
	a1.k=20;
	System.out.println(a1);
}
}

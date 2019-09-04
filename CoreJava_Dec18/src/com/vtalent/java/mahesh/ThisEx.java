package com.vtalent.java.mahesh;

public class ThisEx {
	int i,j;
ThisEx(){
i=5;
j=7;
}
ThisEx(int i){
	this();
this.i=this.i+i;
j=j+this.i;
}
ThisEx(int i,int j){
	this(i+j);
this.i=this.i+i;
this.j=this.j*j;
}
public static void main(String args[]){
ThisEx e1=new ThisEx();
ThisEx e2=new ThisEx(2);
ThisEx e3=new ThisEx(3,5);
System.out.println(e1.i+e1.j);
System.out.println(e2.i+e2.j);
System.out.println(e3.i+e3.j);
}
}

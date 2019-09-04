package com.vtalent.shiva;

public class ThisEx {
int i,j;
ThisEx(){
	this(2);
	i=100;
	j=900;
	
}

ThisEx(int i){
	this(3,4);
	this.i=this.i+i;
	j=j+this.i;
}
ThisEx(int i,int j){
	this.i=this.i+i;
	this.j=this.j*j;
	
}
public static void main(String[] args) {
	
ThisEx e1=new ThisEx();
ThisEx e2=new ThisEx(2);
ThisEx e3=new ThisEx(3,4);
System.out.println(e1.i+e1.j);
System.out.println(e2.i+e2.j);
System.out.println(e3.i+e3.j);

}
}

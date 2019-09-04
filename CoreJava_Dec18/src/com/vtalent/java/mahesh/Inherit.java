package com.vtalent.java.mahesh;
public class Inherit {
int i,j;
public void function(int i){
	this.i=this.i*i;
	j=this.i;
}
}
class second extends Inherit{
	int j;
	public void function(int i,int j){
		this.j=this.j+j;
		this.i=this.i+i;
	}
}
class third extends second{
	int k;
	public void function(int k){
		this.k=this.k+k;
	}
}
class Test1{
	public static void main(String args[]){
		Inherit I=new Inherit();
		I.function(5);
		System.out.println(I.i+I.j);
		second s=new second();
		s.function(5, 4);
		System.out.println(s.i+s.j);
		third t=new third();
		t.function(13);
		System.out.println(s.i+s.j+t.k);
	}
}
package com.vtalent.java.vishnu;

class single {
	int i,j;
	public void function(int i){
		this.i=this.i*i;
		j=this.i;
	}
}
class second extends  single{
	int j;
	public void function(int i,int j){
		this.j=this.j+j;
		this.i=this.i+i;
	}
}
public class InheritancEx {
	public static void main(String[] args) {
		single s1=new single();
		s1.function(5);
		System.out.println(s1.i+s1.j);
		second s2=new second();
		s2.function(3);
		s2.function(5,4);
		System.out.println(s2.i+s2.j);
	}
}

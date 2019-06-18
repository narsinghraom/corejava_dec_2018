package com.vtalent.sampath;

class First{
	int i,j;
	public void function(int i) {
		this.i=this.i+i;
		j=this.j+j;

	}


}
class Second extends First{
	int j;
	public void function(int j,int i) {
		this.j=this.j+j;
		super.j=super.j+this.j;
		this.i=this.i+i;

	}
}
public  class Inhertance {
	public static void main(String args[]) {
		First first=new First();
		first.function(5);
		System.out.println(first.i);
		Second second=new Second();
		second.function(10, 11);
		second.function(15);

		System.out.println(second.j);
		System.out.println(second.i);

	}
}




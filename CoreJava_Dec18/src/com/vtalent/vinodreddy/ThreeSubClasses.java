package com.vtalent.vinodreddy;

class Substraction {
	int i,j,k;
	public void substract(int i,int j) {
		
		this.j =i-this.i;
		this.i =this.j+j;
		
	}
}
class Addition extends Substraction{
	 int k;
	  public void add(int k ) {
		  
		  this.j =k+this.k;
		  this.k =this.j+j;
	  }
}
 class Multiplication extends Substraction{
	 int i,j,k;
	 public void multi(int i) {
		 this.k =this.j*i*this.k;
	 }
 }
public class ThreeSubClasses {
	public static void main(String[] args) {
		Substraction sub = new Substraction(); 
		sub.substract(5, 6);
		System.out.println(sub.i-sub.j);
		Addition a = new Addition();
		a.add(8);
		System.out.println(a.j+a.k);
		Multiplication m =new Multiplication();
		m.multi(10);
		System.out.println(m.i*m.j*m.k);
	}

}

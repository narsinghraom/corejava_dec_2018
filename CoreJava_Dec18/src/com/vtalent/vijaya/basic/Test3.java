package com.vtalent.vijaya.basic;

class Single{
	int i,j;
	public void function(int i) {
		this.i=this.i*i;
		j=this.i;
		}
	}
class Second1 extends Single{
	int j;
	public void function(int i,int j) {
		this.j=this.j+j;
		this.i=this.i+i;
	}	
}
class Third1 extends Second1{
	int k;
	public void function(int k) {
		j=k*k*k;
		this.k=this.j;
	}
}
public class Test3{

	public static void main(String[] args) {
		Single s1=new Single();
		s1.function(5);
		System.out.println(s1.i+s1.j);
		Second1 s2=new Second1();
		s2.function(5);
		s2.function(5, 4);
        System.out.println(s2.i+s2.j);
        Third1 t = new Third1();
        t.function(5);
        System.out.println(t.k);
        System.out.println(t.j);
        System.out.println(t.k+t.j);
        System.out.println(s1.i+s2.j+t.k);
        }
	}

package com.vtalent.suma3;

class Single{
	int i,j;
	public void function(int i)
	{
		this.i=this.i*i;
		j=this.i;
		
		}
	}
class Secondd extends Single
{
	int j;
	public void function(int i,int j) {
		this.j=this.j+j;
		this.i=this.i+i;
	}	
}
class Third extends Secondd
{
	int k;
	public void function(int k) {
		j=k*k*k;
		this.k=this.j;
	}
}
public class Test4 {

	public static void main(String[] args) 
	{
		Single s1=new Single();
		s1.function(5);
		System.out.println(s1.i+s1.j);
		Secondd s2=new Secondd();
		s2.function(5);
		s2.function(5, 4);
        System.out.println(s2.i+s2.j);
        Third t = new Third();
        t.function(5);
        System.out.println(t.k);
        System.out.println(t.j);
        System.out.println(t.k+t.j);
        System.out.println(s1.i+s2.j+t.k);
        
        }
	}



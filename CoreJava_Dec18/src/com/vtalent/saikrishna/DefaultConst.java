package com.vtalent.saikrishna;


public class DefaultConst {
		int a=5,b=10;
		static double c=1.5f;
		DefaultConst()//constructor
		{
			System.out.println("default constructor");
		}
		public void display(int m,int n)
		{
	m=this.a;
	n=this.b;
	System.out.print(m +"    "+n);  
			
		}
		{
			System.out.println(b);//instance block
			
		}
		static 
		{
			System.out.println(c);
		}
		public static void main(String[] args) {
			DefaultConst d=new DefaultConst();
			 d.display(11,12);
		} 

	}



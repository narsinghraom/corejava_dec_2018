package com.vtalent.corejava.suma;

public class ThisPointer {

		int i=1;
		int j=5;

		public void fun(int i,int j){
			i=i;
			System.out.println(i);
			j=j;
			System.out.println(i);
			this.i=this.i;
			System.out.println(this.i);
			this.j=this.j;
			System.out.println(this.j);
		}
		}



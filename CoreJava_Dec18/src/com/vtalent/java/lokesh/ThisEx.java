package com.vtalent.java.lokesh;

public class ThisEx {
int i,j;
ThisEx () {
	i=5;
	j=7;
}
	ThisEx (int i) {
		this.i = this.i + i;
		j = j + this.i;
	}
		ThisEx (int i,int j) {
		this.i =this.i+i;
		this.j= this.j*j;
		}
		public static void main(String[] args) {
			ThisEx e1 = new ThisEx();
		/*
		 * ThisEx e2 = new ThisEx(); ThisEx e3 = new ThisEx();
		 */
		System.out.println(e1.i+e1.j);
		
		

		}
	
	
}


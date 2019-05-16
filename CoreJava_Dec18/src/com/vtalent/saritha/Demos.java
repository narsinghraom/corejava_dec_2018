
	package com.vtalent.saritha;

	public class Demos {
		static Demos demo;
		Demos demo1;
		int i,j;
		public static Demos function(){
			demo=new Demos();
			demo.demo1=new Demos();
			demo.i=10;
			demo.j=20;
			demo.demo1.i=demo.i+demo.j;
			demo.demo1.j=demo.i*demo.j;
			return demo.demo1;
		}

		public static void main(String[] args) {
			demo=function();
			System.out.println(demo.i);
			System.out.println(demo.j);
			
		}

	}


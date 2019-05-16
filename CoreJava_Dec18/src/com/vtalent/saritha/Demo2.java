package com.vtalent.saritha;

	public class Demo2 {
		static Demo2 demo;
		Demo2 demo1;
		int i,j;
		public static Demo2 function(){
			demo=new Demo2();
			demo.demo1=new Demo2();
			demo.i=10;
			demo.j=20;
			demo.demo1.i=demo.i+demo.j;
			demo.demo1.j=demo.i*demo.j;
			return demo.demo1;
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			demo=function();
			System.out.println(demo.i);
			System.out.println(demo.j);
			
		}

	}



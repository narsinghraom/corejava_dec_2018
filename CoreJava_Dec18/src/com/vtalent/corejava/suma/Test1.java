package com.vtalent.corejava.suma;


	class First {
		int x;
		public void function(int x){
		this.x=this.x+x;
		}
		}
		class Second extends First {
		int x,y;
		public void functionone(int x, int y){
		this.x = this.x+x;
		this.y = this.y+y;
		super.x=super.x+x;

		}
		}


		public class Test1 {
		public static void main(String[] args) {
		First fr =new First();
		fr.function(5);
		System.out.println(fr.x);
		Second scr=new Second();
		scr.function(5);
		scr.functionone(2,3);
		System.out.println(scr.x+scr.y);
		System.out.println(scr.x);


		}
		}


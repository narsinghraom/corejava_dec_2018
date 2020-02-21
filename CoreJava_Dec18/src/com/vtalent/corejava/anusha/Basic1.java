package com.vtalent.corejava.anusha;

public class Basic1 {
		int i;
		float f1;
		public void function(){
			int x=method(3,30.0f);
			System.out.println("My value of X"+" "+x);
		}
		public int method(int i,float f1){
			this.i=(int) (i+f1);
			this.f1=(float) (this.i);
			return (int)(this.i+this.f1); 
		}
		public static void main(String[] args) {
			Basic1 basic1 = new Basic1();
			basic1.function();
		}

	}


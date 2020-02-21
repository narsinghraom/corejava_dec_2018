package com.vtalent.corejava.alekya;

public class Text {
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
		Text basic1 = new Text();
		basic1.function();
	}

}



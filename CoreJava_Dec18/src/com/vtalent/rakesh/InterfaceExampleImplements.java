package com.vtalent.rakesh;

public class InterfaceExampleImplements implements InterfaceExample {
	float f1;
	int y;
	public int x;

	public int function(float f1) {

		this.f1 = this.f1 + f1;
		System.out
				.println("Excuted the method that is there in the InterfaceExampleImplements with single parameters  ");
		return (int) (this.f1);

	}

	public float function(int x, int y) {
		this.y = this.y + y;
		f1 = f1 + x;
		System.out
				.println("Excuted the method that is there in the InterfaceExampleImplements with double parameters  ");
		return x + y;
	}

}

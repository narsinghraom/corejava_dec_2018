package com.vtalent.corejava.sunil;

public class ThiseEx2 {
static int a=12;
int b=10;
public void display() {
	System.out.println(this.a);
	System.out.println(this.b);

}
	public static void main(String[] args) {
int n=11;
new ThiseEx2().display();
System.out.println(n);

	}

}

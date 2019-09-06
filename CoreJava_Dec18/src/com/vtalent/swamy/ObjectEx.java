package com.vtalent.swamy;

public class ObjectEx {
int i;
 ObjectEx oe;
public ObjectEx() {
	oe=new ObjectEx();
}
public void function(int i) {
	this.i=i*i;
}
	public static void main(String[] args) {
		ObjectEx oe=new ObjectEx();
		oe.function(5);
		System.out.println(oe.i);
	}

}

package com.vtalent.rakesh;

public class ObjectReference {
	int r;

	public int function(int r) {
		int z;
		z = r + 10;
		this.r = z;
		System.out.println(z);
		return z = r + 10;

	}

	public int getR() {
		System.out.println(r);
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}

	public static void main(String[] args) {
		ObjectReference t = new ObjectReference();
		ObjectReference t1 = new ObjectReference();
		t1.function(8);
		t1.setR(5);
		t.getR();
		t1.getR();
		t1.function(5);
		t.function(5);
		Employeee q = new Employeee();
		q.getName();
		System.out.println(q);

	}
}

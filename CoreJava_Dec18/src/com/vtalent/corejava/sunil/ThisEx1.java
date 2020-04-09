package com.vtalent.corejava.sunil;

public class ThisEx1 {
private int a,b;
public ThisEx1(int a,int b) {
	this.a=a;
	this.b=b;
}
public void Print() {
	System.out.println("print  :"+a);
	System.out.println("print  :"+b);

}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
ThisEx1 te=new ThisEx1(100,200);
te.Print();
System.out.println("value  :"+te);
	}

}

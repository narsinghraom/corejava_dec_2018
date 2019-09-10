package com.vtalent.java.mahesh;

public class polytest {
	public static void main(String args[]){
	//polytwo p=new polytwo();
	//Polyone p=new polytwo();
	//Polyone p=new polythree();
	polythree p=new polythree();
	int k=p.function(2.0);
	k=p.function((double) k,(double) k);
	double d=p.function(k,k);
	System.out.println(d);
	System.out.println(k);
	System.out.println(p.a);
	System.out.println(p.b);
	}
}

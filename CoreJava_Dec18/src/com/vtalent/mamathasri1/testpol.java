package com.vtalent.mamathasri1;
class testpol {	
	public static void main(String args[]){
		poltwo t=new polthree();
		int k=t.function(2.0);
		k=t.function(k,k);
		System.out.println(k);
		System.out.println(t.x+t.y);
		System.out.println(t.a);
		polone o=new polthree();
		k=o.function((double) k);
		//k=o.function(k,k);
		System.out.println(k);
		//System.out.println(o.x+o.y);
		System.out.println(o.a);
		polone o1=new poltwo();
		k=o1.function((double) k);
		//k=o1.function(k,k);
		System.out.println(k);
		//System.out.println(o1.x+o1.y);
		System.out.println(o1.a);
		}
}

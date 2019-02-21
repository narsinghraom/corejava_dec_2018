package com.vtalent.swethajadhav;

public class ObjectEx {
	static ObjectEx oe = new ObjectEx();
	int k;
	public void function(){
		System.out.println(k);
	}
	public static void main(String[] args){
		ObjectEx oe1 = new ObjectEx();
		oe1.k = 10;
		oe1.function();
		//System.out.println(oe1.k);
		oe1.oe.k =10;
		System.out.println(oe1.oe.k);
	}

}

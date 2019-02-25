package com.vtalent.ashwanth;

public class ObjEx1 {

	
		ObjEx1 oe =new  ObjEx1();
		int k;
		public void function(){
			System.out.println(k);
		}
		public static void main (String[] args){
			ObjEx1 oe1=new ObjEx1();
			oe1.k=10;
			oe1.function();
			oe1.oe.k=10;
			System.out.println(oe1.oe.k);
			
			
			
		}

	}
	
}

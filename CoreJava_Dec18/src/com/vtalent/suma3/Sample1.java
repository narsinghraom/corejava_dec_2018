package com.vtalent.suma3;

public class Sample1 {
	int x,y;
	static float f1;
	public void function() {
		f1=2.5f;	
	}
	public int function( int x , int y) {
		 x=x+(int)f1;  // 2+int(2.5)=2+2=4
		 y=y+(int)f1; // 3+int(2.5)=3+2=5
		 return x+y; // 4+5=9
	}
	public static void main(String[] args) {
		Sample1 s1= new Sample1();
		s1.function();
		int k=s1.function(2,3);  // k=9
		System.out.println(k);  
		System.out.println(s1.x+s1.y); // 0+0 =0
		System.out.println(f1); // 2.5

	}
		
	}



package com.vtalent.corejava.naveenm;
class Y{
	float f1;
	static float f2;
}

public class Xyz {
	int a,b;
	Y y;
	Xyz(){
		a=10;
		b=20;
	}
	public  void create(Xyz xyz){	
		
		xyz.y=new Y();
		xyz.y.f1=(float)(xyz.a+xyz.b);
		xyz.y.f2=Y.f2+xyz.y.f1;
		
		System.out.println(xyz.y.f1);
		System.out.println(xyz.y.f2);
	}
	public static void main(String[] args) {
		
		Xyz xyz = new Xyz();
		xyz.create(xyz);
	}

}

package com.vtalent.corejava.siva;

public class Jkl {
	int i, j;
	static float f1, f2;
	Jkl jkl;

	public Jkl functionOne(Jkl dem) {
		
		jkl=new Jkl();
		jkl.jkl=new Jkl();
		jkl.jkl=dem;
		
		jkl.i=dem.i+dem.jkl.i;
		jkl.j=dem.j+jkl.i;
				
		return dem;
	}

	public static int functionTwo(float f1) {
		Jkl.f1 = f1 + Jkl.f1;
		f2 = Jkl.f1 + f2;
		return (int) (f1+f2);
	}
	

	public static void main(String args[]) {

		Jkl dem = new Jkl();
		dem.i = 5;
		dem.j = 7;

		Jkl dem1=dem.functionOne(dem);
		
		int k = functionTwo((float) dem.i);
		System.out.println(k);
		System.out.println(f1+f2);
		System.out.println(dem.i + dem.j);
		
	}

}

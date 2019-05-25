package com.vtalent.sneha;

public class Sample {
	int i,j;
	static float f1,f2;
	public void functionOne(){
		i=5;
		j=7;
	}
	public static int functionTwo(float f1){
		Sample.f1=f1+Sample.f1;
		f2=Sample.f1+f1;
		return(int)f1;
	}
	public static void main(String[] args)
	{
		Sample sample1=new Sample();
		sample1.functionOne();
		int k=functionTwo((float)sample1.i);
		System.out.println(k);
		System.out.println(sample1.i+sample1.j);
		System.out.println(f1+f2);
		

}
}

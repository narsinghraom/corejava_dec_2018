package com.vtalent.srinu;

public class SampleOne {
	
	int x,y;
	static float f1,f2;
	public int  functionone(int x,int y)
	{
		x=x+y;
		y=x+y;
		this.x=this.x+x;
		this.y=this.y+y;
		
		System.out.println(this.x);
		return x+y;
	}
	public static float functiontwo(float f1,float f2)
	{
		f1=f1+f2;
		f2=f1+f2;
		SampleOne.f1=SampleOne.f1+f1;
		SampleOne.f2=SampleOne.f2+f2;
		return f1+f2;		
	}
		public static void main(String[] args) {
			float f1=functiontwo(1.5f,1.5f);
					
		SampleOne s1=new SampleOne();
		f1=f1+s1.functionone((int)f1,(int)f1+2);
		System.out.println(f1);
	
		}
}
/*public class SampleOne {	
	public static float function(float f,float f1){
		f=f+f1;
		return f;
	}
	public static void method(int i){
		 i=i+i;
		 System.out.println(i);
	}
	public static void main(String[] args) {
		method(5);
		float f2=function(5.5f,5.5f);
		System.out.println(f2);
	}
}*/
		
	/*int i;
	float f1;
	public void function(){
		int x=method(3,30.0f);
		System.out.println("My value of X"+" "+x);
	}
	public int method(int i,float f1){
		this.i=(int) (i+f1);
		this.f1=(float) (this.i);
		return (int)(this.i+this.f1); 
	}
	public static void main(String[] args) {
		SampleOne basic1 = new SampleOne();
		basic1.function();
	}

}*/
		
/*int a,b;
	
	public void Function(int a, int b){
		this.a=a+this.b;
		this.b=this.a;
		a=this.a+this.b;
		b=a;
		
		System.out.println(this.a);
		System.out.println(this.b);
		
		System.out.println(a);
		System.out.println(b);
	}
	public static int sample(int i,float f1){
		i=i+i;
		f1=f1+i;
		return (int) (i+f1);
	}
	public static void main(String[] args) {
		int x=sample(5,5.5f);
		System.out.println(x);
		SampleOne  basic = new SampleOne ();
		basic.Function(5,6);
		
	}
}
	*/	





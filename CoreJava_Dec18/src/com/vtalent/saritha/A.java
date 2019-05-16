package com.vtalent.saritha;

 class B {
	private float f1;
	private B(){
		f1=2.5f;
	}
	public static B function(){
		B a1=new B();
		return a1;
	}
		public float getValue(){
			return f1;
		}
	}
	class A{
		int x,y;
		B a;
		A b;
		public B functionOne(){
			a=B.function();
			x=(int)a.getValue();
			y=(int)a.getValue();
			return a;
		}
		public static  A  functionTwo(){
			A b=new A();
			b.b=new A();
			b.b.a=b.functionOne();
			b.b.x=(int)b.b.a.getValue();
			b.b.y=(int)b.b.a.getValue();
			return b.b;
		}
		public static void main(String []args){
			A b2=functionTwo();
			b2.y=b2.x+5;
			b2.y=b2.y+5;
			float f2=b2.a.getValue();
			System.out.println(f2);
			System.out.println(b2.x);
			System.out.println(b2.y);
		}
	
	}



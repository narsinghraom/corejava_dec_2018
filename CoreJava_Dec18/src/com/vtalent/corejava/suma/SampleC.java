package com.vtalent.corejava.suma;


	class C{
		public int sample(){
			int k=40;
			int l=30;
			return k+l;
			
	}
		   
	}

	public class SampleC {
		
		static float f1,f2;
		
		SampleC(){
			f1=function();
			System.out.println(f1);
			
		}
		public static  float function(){
			f1=f1+f1;
			f2=f1*f1;
			return f1+f2;	
		}
		public void getValue(C c){
			int a=c.sample();
			System.out.println(a);
		}
			
		public static void main(String[] args) {
			SampleC s=new SampleC();
			s.getValue(new C());
			
			
		}
		
	
}

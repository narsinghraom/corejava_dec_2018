package com.vtalent.saikrishna;


public class StaticInstanceSample2 {
			int a,b;
			
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
				StaticInstanceSample2 si=new StaticInstanceSample2 ();
				int x=sample(5,5.5f);
				System.out.println(x);
				si.Function(5,6);
				
			}
		}




package com.vtalent.saritha;

	public class Abcp1{
		
		static Abcp1 abc=new Abcp1();
		float f1,f2;
		static long l1,l2;
		Abcp1 abcRef;
		public Abcp1 function(Abcp1 abc){
			abcRef=abc;
			return abcRef;
		}
		public static long function1(){
			Abcp1 abc1=abc.function(new Abcp1());
			abc1.f1=1.5f;
			abc1.f2=2.5f;
			abc=abc1;
			return (long)(abc1.f1+abc1.f2);
		}

		public static void main(String[] args){
			// TODO Auto-generated method stub
			l1=function1();
			l2=l1+5;
			System.out.println(l1+l2);
			System.out.println(abc.abcRef);
			System.out.println(abc.f1);
			System.out.println(abc.f2);
			
			
		}

	}


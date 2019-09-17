package com.vtalent.java.mahesh;

public interface Ab {
	public static final float pi=3.14f;
	public int k=0;
	int i=0;
	public abstract void function(int x);
	public void function(int x,int y);
	}
	class Ab1 implements Ab
	{
		int k;
		public void function(int x){
		System.out.println((int)pi+x);
		System.out.println(k);
		}
		public void function(int x,int y){
		//pi=pi+x;
		k=k+(x*y);
		System.out.println(Ab.k);
		System.out.println(k);
		}
		public void function(){
		System.out.println(k);
		}
}

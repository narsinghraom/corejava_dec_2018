package com.vtalent.corejava.alekya;

public class ExceptionExample {
	int i;
	int[] k=new int[3];
	String str;
	public void function()throws Exception{
		k[0]=1;
		i=1/k[0];
		k[1]=2;
		k[2]=3;
		k[3]=4;
		char ch=str.charAt(0);
	}
	public static void main(String[] args){
		ExceptionExample ex=new ExceptionExample();
		try{
			ex.function();
		}catch(ArithmeticException e){
			System.out.println("array values are0 please give values");
			
		}catch(Exception e){
			System.out.println("array values are0 please give values");
			
		}
	}

}

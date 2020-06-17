package com.vtalent.corejava.alekya;

public class AccountData {
	int a;
	int b;
	int c;
	public void setData(int a,int b){
	
	c=a+b;
	a=c+b;
	b=c+a;
	System.out.println("value of A= "+c);
	System.out.println("value of B= "+a);
	System.out.println("value of C= "+b);
	
	}
	public void showData(int i){
		c=b+i;
		System.out.println("value of B= "+b);
		System.out.println("value of A= "+i);
		System.out.println("value of C= "+c);
	}
		public static void main(String[] args) {
		AccountData data=new AccountData();
	data.showData(15);
	data.setData(15,16);
	
		}	

}

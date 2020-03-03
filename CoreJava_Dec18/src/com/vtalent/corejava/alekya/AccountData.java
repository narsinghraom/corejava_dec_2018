package com.vtalent.corejava.alekya;

public class AccountData {
	int a;
	int b;
	public void setData(int a,int b){
	a=a;
	b=b;
	}
	public void showData(){
		System.out.println("value of B= "+b);
		System.out.println("value of A= "+a);
	}
		public static void main(String[] args) {
		AccountData data=new AccountData();
		}	

}

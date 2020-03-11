package com.vtalent.corejava.siva;

public class Loop {
	int x,y;
	public void abc(int x){
		this.x=this.x+x;
		y=5;
	}
	public static void main(String[] args) {
		Loop obj=new Loop();
		obj.abc(5);
		System.out.println(obj.x+obj.y);
	}
}

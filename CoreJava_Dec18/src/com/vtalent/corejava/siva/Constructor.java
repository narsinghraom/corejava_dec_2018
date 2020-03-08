package com.vtalent.corejava.siva;

public class Constructor {
	int x,y;
	Constructor()
	{ this(5);
		x=2;
		y=5;
	}
	Constructor(int x)
	{ 
		this.x=this.x+x;
		y=y+x;
	}
	Constructor(int x,int y)
	{ this();
		this.x=this.x+x;
		this.y=this.y+y;
	}
	public static void main(String[] args) {
		Constructor c1=new Constructor(2,8);
		System.out.println(c1.x+c1.y);
	}

}

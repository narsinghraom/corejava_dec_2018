package com.vtalent.java.prashanth;

public class ThisEx {
	int i,j;
	ThisEx(){
		//System.out.println(i);
		i=5;
		j=7;
		//System.out.println("This i s zero arguments "+i);
		//System.out.println(this.i);
	}
	ThisEx(int i){
		this();
		//System.out.println(i);
		//System.out.println(this.i);
		this.i=this.i+i;//8
		//System.out.println(this.i);
		
		j=j+this.i;//12
	}
	ThisEx(int i,int j){
		this(i+j);
	    //System.out.println(this.i+"  "+this.j);
		this.i=this.i+i;//
		this.j=this.j*j;//
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ThisEx e1=new ThisEx();
		//ThisEx e2=new ThisEx(2);
		ThisEx e3=new ThisEx(3,5);
		/*System.out.println(e1.i+e1.j);
		System.out.println(e2.i+e2.j);*/
		System.out.println(e3.i+e3.j);
	}

}

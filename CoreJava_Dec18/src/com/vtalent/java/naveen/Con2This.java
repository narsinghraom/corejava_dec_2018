package com.vtalent.java.naveen;

public class Con2This {
int i,j;
 public Con2This(){
	 this(5);
	i=5;
	j=7;
}
 public Con2This(int i){
	 this(2,3);
	 this.i=this.i+i;//7
	 j+=this.i;//7
 }
 public Con2This(int i,int j){
	 this.i=this.i+i;//2
	 this.j*=j;//0
 }
	public static void main(String[] args) {
		Con2This ct2=new Con2This();
		System.out.println(ct2.i+ct2.j);//12

	}

}

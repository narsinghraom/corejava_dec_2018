package com.vtalent.java.prashanth;

public class ConstructorEx5 {
			int i,j;
			public ConstructorEx5() {
				//this(i,j);
				this(2,3);
				i=5;
				j=7;
				//System.out.println("This i s zero arguments "+i);
				//System.out.println(this.i);
			}
			ConstructorEx5(int i){
				
				System.out.println(i);
				System.out.println(this.i);
				this.i=this.i+i;//0+5=5
				//System.out.println(this.i);
				
				j=j+this.i;//0+5=5
				
			}
			ConstructorEx5(int i,int j){
				this(i+j);
			    //System.out.println(this.i+"  "+this.j);
				this.i=this.i+i;//
				//System.out.println(i+"  "+j);
				this.j=this.j*j;//
			}
			public static void main(String[] args) {
				// TODO Auto-generated method stub
				  ThisEx e1=new ThisEx();
				//ThisEx e2=new ThisEx(2);
				//ThisEx e3=new ThisEx(3,5);
				  System.out.println(e1.i+"  "+e1.j);
				System.out.println(e1.i+e1.j);
				//System.out.println(e2.i+e2.j);
				//System.out.println(e3.i+e3.j);
			}

		}


	
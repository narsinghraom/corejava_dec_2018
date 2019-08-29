package com.vtalent.java.prashanth;

public class ConstructorEX2 {


					int i,j;
					ConstructorEX2(){
						this(3,5);
						i=5;
						j=7;	
					}
					ConstructorEX2(int i){
						
						this.i=this.i+i;//8
						j=j+this.i;//8
					}
					ConstructorEX2(int i,int j){
						this(i+j);
						this.i=this.i+i;//8+3=11
						this.j=this.j*j;//40
					}
					public static void main(String[] args) {
						// TODO Auto-generated method stub
						ConstructorEx e1=new ConstructorEx();
						//ConstructorEx2 e2=new ConstructorEx2(2);
						//ConstructorEx e3=new ConstructorEx(3,5);
						System.out.println(e1.i+e1.j);//53
						//System.out.println(e2.i+e2.j);//21
						//System.out.println(e3.i+e3.j);
					}

				}

			

	

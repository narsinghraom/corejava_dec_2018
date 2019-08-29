package com.vtalent.java.lokesh;

public class ThisExample {
		int i,j;
		ThisExample () {
			i=5;
			j=7;
		}
			ThisExample ( int i) {
				this();
				this.i = this.i + i;
				j = j + this.i;
			}
				ThisExample (int i,int j) {
				this.i =this.i+i;
				this.j= this.j*j;
				}
				public static void main(String[] args) {
					ThisExample e1 = new ThisExample(2);
					System.out.println(e1.i+e1.j);
				}
				}

package com.vtalent.sri;

public class Abc1 {
int i,j;
static float f1,f2;
Abc1(){
	i=5;
	j=7;
}
public int function(int i){
	this.i=i+this.i;
	return i+this.j;
}
public float function(int i,int j){
	this.i=this.i+i;
	this.j=this.j+j;
	f1=i;
	f2=j;
	return f1+f2;
}			
}

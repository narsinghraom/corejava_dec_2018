package com.vtalent.java.prashanth;

public class First1 {
int x,y;
public int function(int x) {
	this.x=this.x+x;
	y=y+x;
	return x;
}
}
class Second2 extends First1{
	int y;
	public int function(int y) {
		this.y=this.y+y;
		x=x+y;
		return y;
	}
public int function(int x,int y) {
	this.x=this.x+x;
	this.y=this.y+y;
	return x+y;
}
}
class Third3 extends Second2{
	int x;
public int function(int x,int y) {
	this.x=this.x+x;
	this.y=this.y+y;
	return x+y;
}
}
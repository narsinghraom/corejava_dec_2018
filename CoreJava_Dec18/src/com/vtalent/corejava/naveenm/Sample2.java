package com.vtalent.corejava.naveenm;

public class Sample2 {
int x,y;
static float f1;
public void function(){
	x=7;
    y=8;
    f1=2.5f;

}
public static void main(String[]args) {
	Sample2 sample = new Sample2();
	sample.function();
	System.out.println(sample.x + sample.y);
	System.out.println(f1);
	
System.out.println(sample);	
}
	}


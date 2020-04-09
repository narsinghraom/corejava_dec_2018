package com.vtalent.corejava.nareshmala;

public class Demotwo1 {
int i,j;
Demotwo1 d;
public Demotwo1 function(Demotwo1 d1){
	d=new Demotwo1();
	d.d=new Demotwo1();
	d.d.d=d1;
	d.d.i=d1.i+d1.j;//7+5=12
	d.d.j=d1.i*d1.j;//7*5=35
	return d.d;
}
public static void main(String[] args) {
	Demotwo1 d1=new Demotwo1();
	d1.i=7;
	d1.j=5;
	Demotwo1 d2=d1.function(d1);
	System.out.println(d2.i+d2.j);//12+35=47
	System.out.println(d1.i+d1.j);//7+5=12
	System.out.println(d1.d.i+d1.d.j);//0+0=0
	System.out.println(d2.i+d2.d.i);//12+7=19
	System.out.println(d2.j+d2.d.j);//35+5=40
}

}

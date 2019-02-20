package sitha.vtalent;

public class Object {
static Object oe=new Object();
int k;
public void function(){
	System.out.println(k);
	
}
public static void main(String[] args){
	Object oe1=new Object();
	oe1.k=10;
	oe1.function();
	System.out.println(oe1.k);
	
}
}

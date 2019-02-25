package sitha.vtalent;

import com.vtalent.vijay.oops.Abc;

public class Refvariables {
static Refvariables abc=new Refvariables();
float f1,f2; 
static long l1,l2;
Refvariables abcfy;
public Refvariables function(Refvariables abc){
	abcfy=abc;
	return abcfy;
}
public static long function(){
	Refvariables abc1=abc.function(new Refvariables());
	abc1.f1=1.5f;
	abc1.f2=2.5f;
	abc=abc1;
	return (long)(abc1.f1+abc1.f2);
	}
public static void main(String[] args){
	l1=function();
	l2=l1+5;
	System.out.println(l1+l2);
	System.out.println(abc.abcfy);
	System.out.println(abc.f1);
	System.out.println(abc.f2);
	
}

}

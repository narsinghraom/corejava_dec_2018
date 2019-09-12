package com.vtalent.java.mahesh;
class TestPolym {
public static void main(String args[]){
Polythird t=new Polythird();
int k=t.function(5);
k=t.function(k,k);
System.out.println(k);
System.out.println(t.x+t.y);
Polysecond s=new Polythird();
k=s.function(k);
k=s.function(k,k);
System.out.println(k);
System.out.println(s.x+s.y);
Polyfirst f=new Polythird();
k=f.function(k);
//k=f.function(k,k);
System.out.println(k);
System.out.println(f.x+f.y);
Polyfirst f1=new Polysecond();
k=f.function(k);
System.out.println(k);
System.out.println(f1.x+f1.y);
Polyfirst f3=new Polyfirst();
k=f.function(k);
System.out.println(k);
System.out.println(f3.x+f3.y);
Polysecond s1=new Polysecond();
k=s.function(k);
k=s.function(k,k);
System.out.println(k);
System.out.println(s1.x+s1.y);
}
}
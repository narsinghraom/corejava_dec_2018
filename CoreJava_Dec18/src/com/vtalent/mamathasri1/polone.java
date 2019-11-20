package com.vtalent.mamathasri1;

public class polone {


double a;
public int function(double a){
this.a=this.a+a;
return (int)a;
}
}
class poltwo extends polone{
int x,y;
public int function(int x,int y){
this.x=this.x+x;
this.y=this.y+y;
return x+y;
}
}
class polthree extends poltwo{
int y;
public int function(int x,int y){
this.x=this.x+super.function(x,y);
this.y=x+this.y+y;
return (this.x+this.y);
}
public int function(double a){
int k=super.function(a);
this.a=(double)k+a;
return (k+(int)this.a);
}
}


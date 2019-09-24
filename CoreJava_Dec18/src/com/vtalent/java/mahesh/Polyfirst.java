package com.vtalent.java.mahesh;
class Polyfirst{
int x,y;
public int function(int x){
this.x=this.x+x;
y=y+x;
return x;
}
}
class Polysecond extends Polyfirst{
int y;
public int function(int y){
this.y=this.y+y;
x=x+y;
return y;
}
public int function(int x,int y){
this.x=this.x+x;
this.y=this.y+y;
y=y+x;
return x+y;
}
}
class Polythird extends Polysecond{
int x;
public int function(int x,int y){
this.x=this.x+x;
this.y=this.y+y;
return x+y;
}
}

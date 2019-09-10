package com.vtalent.java.naveen;
class PolyOne{
	double a,b;
	static int x,y;
	public int function(double a) {
		this.a=this.a+a;
		b+=a;
		return (int) (a+b);
	}
	public double function(int x,int y) {
		PolyOne.x=PolyOne.x+x;
		PolyOne.y=PolyOne.y+y;
		return (double)  (x+y);
		
	}
}
 class PolyTwo extends PolyOne{
	 double a;

	 public int function(double a) {
			this.a=this.a+a;
			b+=a;
			return (int) (a+b);
		}
	 public int function(double a,double b) {
		this.a=this.a+a;
		this.b=this.b+b;
		  return (int) ( a+b);	 
	 }
	
}
public class PolyTest {

	public static void main(String[] args) {
		PolyTwo p1=new PolyTwo();
		int k=p1.function(2.0);
     k=p1.function((double)k, (double)k);
     double d1=p1.function(k, k);
     System.out.println(k);
     System.out.println(d1);
     System.out.println(PolyOne.x+"      "+PolyOne.y);
     //
     System.out.println();
     System.out.println("obj2");
     //
     PolyOne p2=new PolyTwo();
     int k2= p2.function(3.0);
    System.out.println(k2); 
     int k21=(int) p2.function(k2, k2);
     System.out.println(k21); 
     System.out.println(p2.a+"         "+p2.b);
     System.out.println(PolyOne.x+"      "+PolyOne.y);
	
	}

}

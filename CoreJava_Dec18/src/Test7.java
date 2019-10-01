class PolyFirst{
	static int x=10;
	int y=20;
	public int function(int x) {
		this.x=x+20;
		return x;
		
	}
	public static void   function1(int x) {
		//this.x=x+x; cannot use this in static context
		x=x+10;
	}
}
class PolySecond2 extends PolyFirst{
	int x=10;
	int y=20;
	public int function(int x) {
		this.x=x+30;
		System.out.println("this.x value in Polysecond"+this.x);
		return this.x;
	}
}
class PolyThird3 extends PolySecond2{
	int x=20;
public int function(int x) {
	return x;
}

	
	
}
public class Test7 {

	public static void main(String[] args) {
		PolyThird3 p3=new PolyThird3();
		System.out.println(p3.x);
		PolySecond2 p2=new PolyThird3();
		int k1`=function(5);
		PolyFirst p1=new PolySecond2();
		int k=p1.function(5);
		System.out.println(k);
		

	}

}

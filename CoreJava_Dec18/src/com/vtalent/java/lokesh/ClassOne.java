

Class First{
	int x,y;
	public int function (int x) {
		this.x =this.x+x;
		y=y+x;
	return x;
	}
}
Class Second extends first{
	int y;
	public int function (int y) {
		this.y = this.y+y;
		x=x+y;
	return x+y;
	}
	public int function(int x , int y) {
		this.x = this.x +x;
		this.y =this.y+y;
		return x+y;
	}
Class Third extends Second {
	int x;
	public int function(int x, int y) {
		this.x= this.x +x;
		this.y=this.y+y;
		return x=y;
	}
}
Class Test {
	public static void main (string [] args) {
		Second f2 = new Second();
		int k = f2.function(5);
		k=t1.function(k,k);
		system.out.println(kt);
		system.out.println(f2.x+f2.y);
		First f3 = new Second();
		k= f3.function(k);
		k=f3.function(k,k);
		system.out.println(k);
		system.out.println(f3.x+f3.y);
		second f4 = new Second();
		k=f4.function(k);
		k=f4.function(k,k);
		system.out.println(k);
		system.out.println(f4.x+f4.y);
		
		
	}
	}
}

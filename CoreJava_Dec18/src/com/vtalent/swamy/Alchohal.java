package com.vtalent.swamy;
class brandy{
	public void harm(String s) {
		System.out.println("is injurious to health");
	}
}
class wiskey extends brandy{
	public void harm(String s) {
		System.out.println("is betterthen brandy");
	}
}
class beer extends wiskey{
	public void harm(String s) {
		System.out.println("is 'better than wiskey ");
	}
}
public class Alchohal {

	public static void main(String[] args) {
		/*beer b=new beer();
		b.harm("kf");
		wiskey w=new beer();
		w.harm("RC");*/
		brandy b1=new wiskey();
		b1.harm("MH");
		
 	}
}

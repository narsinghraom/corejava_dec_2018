package sitha.vtalent;

public class Sample {
	
	static long l1, l2;
	static float f1, f2;

	public int function (float f1, float f2) {
	this.f1 = f1 + f2;
		this.f2 = f1 * f2;
		return (int)(this.f1 + this.f2);
	}

	public static void function(long l1, long l2) {
		Sample.l1= l1 + l2;
		Sample.l2 = l1 - l2;
	}

	public static void main(String[] args) {
		Sample Sample = new Sample();
		int j = Sample.function((float)2,(float)7);
		function(j, j + 1);
		System.out.println(j);
		System.out.println(Sample.l1);
		System.out.println(Sample.l2);
		System.out.println(Sample.f1);
		System.out.println(Sample.f2);
		System.out.print(Sample);

	}



	

}

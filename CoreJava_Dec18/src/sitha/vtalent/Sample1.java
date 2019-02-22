package sitha.vtalent;

import com.vtalent.naveena.Demo;

public class Sample1 {
	long l1, l2;
	static float f1, f2;

	public int function(long l1, long l2) {
	l1 = l1 + l2;
		this.l2 = l1 * l2;
		return (int) ((int) this.l1 + this.l2);
	}

	public static void function(float f1, float f2) {
		Sample1.f1 = f1 + f2;
		Sample1.f2 = f1 - f2;
	}

	public static void main(String[] args) {
		Sample1 Sample = new Sample1();
		int k = Sample.function(2, 5);
		function((float) k, (float) k + 1);
		System.out.println(k);
		System.out.println(Sample.l1);
		System.out.println(Sample.l2);
		System.out.println(Sample.f1);
		System.out.println(Sample.f2);
		System.out.print(Sample);

	}


}

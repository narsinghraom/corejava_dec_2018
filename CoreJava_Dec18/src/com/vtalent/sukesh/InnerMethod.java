package com.vtalent.sukesh;

public class InnerMethod {
	int i;

	public void Function() {
		class Local {
			int k;

			public int Function(int k) {
				return this.k + k;
			}
		}
		Local l = new Local();
		i = l.Function(5);
	}

	public static void main(String[] args) {
		InnerMethod im = new InnerMethod();
		im.Function();
		System.out.println(im.i);
	}

}

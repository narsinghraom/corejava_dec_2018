package com.vtalent.corejava.nageswararao;

public class InheritanceTest1 {
	public static void main(String[] args) {
		Demo1 d = new Demo13();
		d.functionThree(5, 2);

		Demo12 d2 = new Demo13();
		d2.functionTwo(3);
		d2.functionThree(3, 2);

		Demo13 d3 = new Demo13();
		d3.functionTwo(3);
		d3.functionThree(3, 2);
		d3.functionOne();

		System.out.println(d.x + "  " + d.y);
		System.out.println(d2.x + "  " + d2.y);
		System.out.println(d3.x + "  " + d3.y);
	}

}

package com.vtalent.sujith.oops;

public interface Sample {

	public int MethodOne(int i);
	public long MethodOne(long l1,long l2);
}

interface SampleOne{
	public int MethodOne(int i);
}
abstract class SampleImp implements Sample{
	int i;
	public int MethodOne(int i) {
		return this.i+i;
	}
}
package com.vtalent.vijay.oops;

public interface InterfaceSample
{
	public int methodOne(int i);
	public long methodOne(long l1,long l2);
	

}
interface SampleOne
{
	public int methodOne(int i);
	
}
abstract class SampleImpl implements InterfaceSample
{
	int i;
	public int methodOne(int i){
		return this.i+i;
	}
	
}
class SampleOneImpl extends SampleImpl implements SampleOne

{
	public long methodOne(long l1,long l2)
	{
		return l1+l2;
	}
}

package com.vtalent.corejava.sunil;

public class SampleOne {
  static float f1,f2;
  int x,y;
  public int functionOne(int x,int y) {
	  x=x+y;
	  y=x+y;
	  this.x=x+x;
	  this.y=y+y;
	  return x+y;
  }
  public static float functionTwo(float f1,float f2) {
	  f1=f1+f2;
	  f2=f1+f2;
	  SampleOne.f1=SampleOne.f1+f1;
	  SampleOne.f2=SampleOne.f2+f2;
      return f1+f2;
  }

	public static void main(String[] args) {
        float f1=functionTwo(1.5f,1.5f);
           SampleOne s1=new SampleOne();
		f1=f1+s1.functionOne((int)f1,(int)f1+2);
		System.out.println("1st value   :"+f1);
		System.out.println("2nd value   :"+s1.x+s1.y);
		System.out.println("3rd value   :"+s1.f1+f2);
		
		
	}

}

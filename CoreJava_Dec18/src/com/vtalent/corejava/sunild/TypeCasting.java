package com.vtalent.corejava.sunild;


public class TypeCasting {
	static float f1, f2;
	int x, y;

public int functionList(int x, int y) 
{
	x = x+y;
	y = x+y;
	this.x = this.x + x;
	this.y = this.y + y;
	return x+y;
	
	}
public static float functionList(float f1, float f2)
{
	f1 = f1+f2;
	f2 = f1+f2;
	TypeCasting.f1 = TypeCasting.f1+f1;
	TypeCasting.f2 = TypeCasting.f2+f2;
	return f1 + f2;
	
}
public static void main(String[] args) {
	float f1 = functionList(1.5f, 1.5f);
	TypeCasting obj = new TypeCasting();
	f1 = f1+obj.functionList((int)f1, (int)f1+ 2);
	System.out.println(f1);
	System.out.println(obj.x + obj.y);
	System.out.println(TypeCasting.f1 + f2);
	
	}
}


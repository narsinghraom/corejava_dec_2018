package com.vtalent.corejava.suma.a;

public class Abc {
	int[] aArray;
	int i;
   	static float f1, f2;
	
	public static Abc getAbcInstance(){
		Abc abc = new Abc();


		abc.aArray = new int[4];
		abc.i = abc.aArray.length;
		for(int i = 0;i<=abc.i-1;i++){
			abc.aArray[i] = abc.i+i;
			abc.i = abc.i+i;
			System.out.println(abc.i);
		}
		f1 = f1+abc.i;
		f2 = f2+f1;
		return abc;
	}
	
	public static float getAnValue(Abc abc){
		for(int i = 0;i<=abc.aArray.length-1;i++){
			f1 = f1+abc.aArray[i];
			f2 = f2+f1;
		}
		return f1+f2;
	}
	
	public static void main(String[] args) {
		float value = getAnValue(getAbcInstance());
		System.out.println(value);
	}

}


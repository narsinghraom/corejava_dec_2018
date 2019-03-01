package sitha.vtalent;

public class ArrayEx {
int iArray[]=new int[4];
float fArray[]=new float[4];
public float[] returnFloatArray(int[] iArray){
	for(int i=0;i<=iArray.length-1;i++){
		fArray[i]=iArray[i]+0.5f;
	}
	return fArray;
}
public static void main(String[] args){
	ArrayEx ae= new ArrayEx();
	for(int i=0;i<=ae.iArray.length-1;i++){
		ae.iArray[i]=i+2;
	}
	float[] fArray=ae.returnFloatArray(ae.iArray);
	System.out.println(fArray);
}
}

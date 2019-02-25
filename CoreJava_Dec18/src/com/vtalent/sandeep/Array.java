package com.vtalent.sandeep;

public class Array {
int[] iArray = new int[4];
float[] fArray=new float[4];
public float[] returnFloatArray(int iArray[])
{
for(int i=0;i<=iArray.length-1;i++){
fArray[i]= (int) (iArray[i]+0.5f);	

}	
return fArray;
}

public static void main(String []args){
Array  ae=new Array ();
for (int i=0;i<= ae.iArray.length-1;i++){
ae.iArray[i]=i+2;	
}
float[] fArray	=ae.returnFloatArray(ae.iArray);
System.out.println (fArray);
for (int k=0; k<=ae.iArray.length-1;k++){
System.out.println(ae.iArray[k]+ "        "+ae.fArray[k]);
}
}

}
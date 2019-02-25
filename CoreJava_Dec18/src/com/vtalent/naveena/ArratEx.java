package com.vtalent.naveena;

public class ArratEx {
	int iSiva[]=new int[4];
	float fArray[]=new float[4];
	public float[] returnFloatArray(int iSiva[]){
		for(int i=0;i<=iSiva.length-1;i++){
			fArray[i]=iSiva[i]+0.5f;
		}
		return fArray;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArratEx ae=new ArratEx();
		for(int i=0;i<=ae.iSiva.length-1;i++){
			ae.iSiva[i]=i+2;
		}
		float[] fArray=ae.returnFloatArray(ae.iSiva);
		//System.out.println(fArray);
		for(int k=0;k<=ae.iSiva.length-1;k++){
			System.out.println(+ae.iSiva[k]+"--"+fArray[k]);
		}
		

	}

}

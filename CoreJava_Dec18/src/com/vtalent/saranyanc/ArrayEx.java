package com.vtalent.saranyanc;

public class ArrayEx {
	int[] iArray= new int[4];
	float[] fArray=new float[4];
	public float[] returnfloatArray(int[] iArray){
	//*public void floatArray(int[] iArray){
		for(int i=0;i<=iArray.length-1;i++){
			fArray[i]=iArray[i]+0.5f;
		}
			return  (fArray);
			}
	public static void main(String[] args){
		ArrayEx ae=new ArrayEx();
		for(int i=0;i<=ae.iArray.length-1;i++)
		{
			ae.iArray[i]=i+2;
		}
		float[] fArray=ae.returnfloatArray(ae.iArray);
		//*ae.floatArray(ae.iArray);
		System.out.println(fArray);
		for(int k=0;k<=ae.iArray.length-1;k++)
				
		{
			System.out.println(ae.iArray[k]+" "+fArray[k]);
			//*System.out.println(ae.iArray);
			//*System.out.println(fArray);
			//*for(k=0;k<=ae.iArray.length-1;k++){
				//*System.out.println(fArray[k]);
			}
			
			
			
			
			
			
		}
		
	}



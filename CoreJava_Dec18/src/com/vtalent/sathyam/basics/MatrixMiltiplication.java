package com.vtalent.sathyam.basics;

public class MatrixMiltiplication {
	public static void main(String[] args) {
		int a[][]= {{1,1,1},{2,2,2}};
		int b[][]= {{1,1,1},{2,2,2}};
		int c[][]=new int[2][3];
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				
		
				
				c[i][j]=a[i][j]+b[i][j];
			System.out.print(c[i][j]+" ");
			}
				System.out.println();
			}
			}
		}
		
			
			

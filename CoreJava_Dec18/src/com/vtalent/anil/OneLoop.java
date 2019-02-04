package com.vtalent.anil;

public class OneLoop {



	public static void main(String[] args)
	{
		int oddPlace=1;
		for(int i=1;i<=4;i++)
		{
			for(int k=i;k<=3;k++)
			{
				System.out.print(" ");
			}	
			for(int j=1;j<=oddPlace;j++)
			{
				System.out.print("*");
			}
			System.out.println("");
			oddPlace=oddPlace+2;
		}

	}

}

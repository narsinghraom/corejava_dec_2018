package com.vtalent.praveena;

import java.util.Scanner;

public class StringTest {
	Scanner input=new Scanner(System.in);

	
	public void word(String S)
	{
		
		System.out.println(S);
		int count=1;
		int k = 0;
		
	for(int i=0;i<S.length();i++)
	{
		{
			for(int j=S.length()-1;j>i;j--)
			{
				{
					if(S.charAt(i)==S.charAt(j))
					{
					  k=i;  
					//System.out.println(S1.charAt(i));
					 count++;
					
					
					}
			
				}
			}			
			if(count>=2)
			{
				int count1=0;
				for(int m=(i-1);m>=0;m--)
				{
					if(S.charAt(i)==S.charAt(m))
							{
						count1++;
						count=1;
							}
					
				}
				if(count1==0)
					{
						
			
							System.out.println(S.charAt(k)+"="+count);
							count=1;
					    //System.out.println("Repeated letter in the given word "+S1+ " is  "+S1.charAt(k)+" for "+count+"times");
						}
				}
			}
		}
	    //System.out.println("Repeated letter in the given word "+S1+ " is  "+S1.charAt(k)+" for "+count+"times");
		}
	


 	public void Removespaces(String S)
 	{
 		
 	S=S.replaceAll("\\s", "");
	System.out.println("given string after removing spaces is "+S);
	}
 	
 	
 	public void RepeatedWord(String[] S)
 	{
 	 String SW="";
 	 String St="";
 	int count1=1;
 		for(int n=0;n<S.length;n++)
		{
 			for(int m=S.length-1;m>n;m--)
			{
				{
					if(S[n].equals(S[m]))
					{
					  SW=S[n];
					  count1++;
					  
					}
			
				}
			}			
		
 	
 	if(count1>=2)
 	{
 		if(St.contains(SW))
 		{
 			count1=1;
 		}
 		else{
 			System.out.println(SW+" repeated "+count1+" times ");
 	 		count1=1;
 	 		St=St+SW;
 		}
 		}
 	
 	}
 	}
 	
 public void DeleteExtraChars(String S1)
 	{
 		
	 for(int i=0;i<S1.length();i++)
	 {
		 for(int j=S1.length()-1;j>i;j--)
		 {
			 if(S1.charAt(i)==S1.charAt(j))
			 {
				
				S1=S1.substring(0,j)+S1.substring(j+1,S1.length());
				
			}
		 }
		 
	 }
	
	 System.out.print(S1+" ");
 	}
 	
 	public void StringConcat(String S1,String[]words)
 	{
 		String S2=new String();
 		S2=S2+words[0];
 		

 			for(int n=1;n<words.length;n++)
 			{
 			int i=S2.length()-1;
 				if(S2.charAt(i)==words[n].charAt(0))
 				{
 					S2=S2.substring(0,i);
 					words[n]=words[n].substring(1,words[n].length());
 					S2=S2+words[n];
 				}
 			}
 			String S3=S2.replace(" ", "");
 			System.out.println(S3);
 				
 	}
 	public void StringAddition()
 	{
 		System.out.println("enter first String");
 		String S1=new String(input.nextLine());
 		System.out.println("enter second String");
 		String S2=new String(input.nextLine());
 		String S=new String();
 		for(int i=0;i<S1.length()-1;i++)
 		{
 			for(int j=0;j<S2.length()-1;j++)
 			{
 				if(S1.charAt(i)==S2.charAt(j))
 				{
 					S1=S1.replace(S1.charAt(i),' ');
 					S2=S2.replace(S2.charAt(j), ' ');
 				}
 			}
 		}
 		S=S1.concat(S2);
 		S=S.replace(" ", "");
 		System.out.println(S);
 	 	
 	 	}
 		
 		
 		/*String S=" ";
 	 		S=S+W[0];
 			for(int n=1;n<W[n].length();n++)

 			{
 	 			int i=S.length()-1;

 	 				if(S.charAt(i)==W[n].charAt(0))
 				{
 						S=S.replace(S.charAt(i),' ');
 						S=S.replace(" ", "");
 						W[n]=W[n].replace(W[n].charAt(0),' ');
 						W[n]=W[n].replace(" ", "");
 						S=S+W[n];
 							
 				}
 	 				S=S.replace(" ", "");
 	 				System.out.println(S);
 		}*/
 	 	
 	
 	
 	
 	public void StringFactorial(String S1)
 	{
 		
 		int f=S1.length();
 		int fact=1;
 		for (int i = 1; i <= f; i++) {
			fact = fact * i;
			

		}
		System.out.println("Factorial value is " + fact);
		
		
	}

 	}

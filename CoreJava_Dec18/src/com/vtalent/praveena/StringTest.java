package com.vtalent.praveena;

public class StringTest {
	
	
	public void word(String S)
	{
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
					break;
					}
			
				}
			}			
		}
	}
	
	if(count>=2)
	{
		
		System.out.println(count);
		System.out.println(S);
		System.out.println(S.charAt(k)+"="+count);
    //System.out.println("Repeated letter in the given word "+S1+ " is  "+S1.charAt(k)+" for "+count+"times");
	}
	
}

 	public void Removespaces(String S)
 	{
 	S=S.replaceAll("\\s", "");
	System.out.println("given string after removing spaces is "+S);
	}
 	
 	
 	public void RepeatedWord(String[] S,String S1)
 	{
 	 String SW="";
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
					  break;
					}
			
				}
			}			
		}
 	
 	if(count1>=2)
 	{
 		System.out.println("word "+SW+" repeated "+count1+" times ");
 	}
 	else
 	{
 		System.out.println("there is no repeated word in given string "+S1);
 	
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
 	
 	public void StringAddition(String S1, String S2)
 	{
 		String S3=" ";
 				if(S1.charAt(S1.length()-1)==S2.charAt(0))
			{
					S1=S1.replace(S1.charAt(S1.length()-1),' ');
					S2=S2.replace(S2.charAt(0),' ');
					S3=S3+S1+S2;
						
			}
 				S3=S3.replace(" ", "");
 				System.out.println(S3);
	}
 	
 	
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


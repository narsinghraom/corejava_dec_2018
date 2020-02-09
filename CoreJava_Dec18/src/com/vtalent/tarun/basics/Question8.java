package com.vtalent.tarun.basics;

//8. Count the spaces in a given string(String s="This is java Class and here we have got many friends";)

public class Question8 {

	public static void main(String[] args) {

		String s="This is java Class and here we have got many friends";
		String data[];
		int k=0;
        data=s.split("");
        for(int i=0;i<data.length;i++){
            if(data[i].equals(" ")){
                k++;
            }}
            int word = 1;

    		for (int i1 = 0; i1 < s.length(); ++i1) {
    			if (s.charAt(i1) == ' ')
    				word++;
  


        }
        System.out.println(k);
   
        System.out.println("Number of Words= " + word);
	}}

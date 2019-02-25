package com.vtalent.ram;
import java.util.*;

public class MinMax {
	  
		 
		  public static void main(String args[]){
			  int a0,a1,a2,a3;
		    int array[] = new int[5];
		    Scanner sc=new Scanner(System.in);
		    System.out.print("enter numbers");
		 array[0]=sc.nextInt();
		 array[1]=sc.nextInt();
		 array[2]=sc.nextInt();
		 array[3]=sc.nextInt();
		    // Calling getMax() method for getting max value
		    int max = getMax(array);
		    System.out.println("Maximum Value is: "+max);
		 
		    // Calling getMin() method for getting min value
		    int min = getMin(array);
		    System.out.println("Minimum Value is: "+min);
		  }
		 
		  // Method for getting the maximum value
		  public static int getMax(int[] inputArray){ 
		    int maxValue = inputArray[0]; 
		    for(int i=1;i < inputArray.length;i++){ 
		      if(inputArray[i] > maxValue){ 
		         maxValue = inputArray[i]; 
		      } 
		    } 
		    return maxValue; 
		  }
		 
		  // Method for getting the minimum value
		  public static int getMin(int[] inputArray){ 
		    int minValue = inputArray[0]; 
		    for(int i=1;i<inputArray.length;i++){ 
		      if(inputArray[i] < minValue){ 
		        minValue = inputArray[i]; 
		      } 
		    } 
		    return minValue; 
		  } 
		}


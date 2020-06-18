package com.vtalent.corejava.sunild;

public class QuickSort {
	
	int partition(int arr[], int low, int high) {
		int pivot = arr[high];
		int i = (low-1);//index of smaller element
		for(int j=low; j<high; j++)
		{
			//if current element is smaller or equal to pivot
			if(arr[j]<=pivot) {
				i++;
				//swap arr[i] and arr[j]	
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				
			}
		}
		//swap arr[i+1] and arr[high]
		int temp = arr[i+1];
		arr[i+1] = arr[high];
		arr[high] = temp;
		return i+1;
		}
	/* The main function that implements QuickSort() 
    arr[] --> Array to be sorted, 
    low  --> Starting index, 
    high  --> Ending index */
	void sort(int arr[], int low, int high)
	{
		if (low < high) {
			/* pi is the partitioning index of arr[pi]
			 
			 */
			int pi = partition(arr, low, high);
			//recursively sort the elements before partition and after partition
			sort(arr, low, pi-1);
			sort(arr, pi+1, high);
		}
	}
	/*  print array size of n*/
	static void printArray(int arr[]) {
		int n = arr.length;
		for(int i=0; i<n; ++i) {
			System.out.println(arr[i]+ " ");
		System.out.println();
		}
	}

	public static void main(String args[]) 
	{
		long start = System.currentTimeMillis();
		int arr[] = {5,6,8,9,7,4,3};
		int n = arr.length;
		QuickSort qs = new QuickSort();
		qs.sort(arr, 0, n-1);
		System.out.println("sorted array");
		printArray(arr);
		System.out.println();
		
		long end = System.currentTimeMillis();
		long time  = end - start;
		System.out.println(time +" "+"Milliseconds");
		
	}
	

  }
			

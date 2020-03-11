package com.vtalent.corejava.rajeshkumar;

public class BubbleSort {

	public static void main(String[] args) {
int[]a={15,16,6,8,5};
for(int i=0;i<5-1;i++){
	for (int j=0;j<5-1;j++){
		if(a[j]>a[j+1]){
			int temp=a[j];
			a[j]=a[j+1];
			a[j+1]=temp;
			
		}
	}
}System.out.println("Printing Sorted List is ");
for(int i=0;i<5;i++){
	System.out.println(a[i]);
}
	}

}

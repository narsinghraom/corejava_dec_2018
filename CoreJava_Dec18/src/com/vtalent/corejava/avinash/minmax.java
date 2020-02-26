
package com.vtalent.corejava.avinash;

public class minmax {
	public void min()
	{   
		int arr[]= {3,8,0,2,9,2};
		int n=arr.length;
		for(int i=0;i<n;i++) {
			if(arr[i]>arr[i+1]) {
			 arr[i]=arr[i+1];
			}
			System.out.println(+arr[i]);
		}
		

}
	public void max()
	{
		int arr[]= {3,8,0,2,9,2};
		int n=arr.length;
		for(int j=0;j<n;j++) {
			if(arr[j]<arr[j+1]) {
				arr[j]=arr[j+1];
			}
			System.out.println(+arr[j]);
		}
		
	}
public static void main(String[] args) {
	int arr[]= {3,8,0,2,9,2};
	minmax MinMax=new minmax();
	MinMax.min();
	MinMax.max();
/*System.out.println("maximum of array"+MinMax.min(arr));
System.out.println("minimum of array"+MinMax.max(arr));
*/}
}

public class Insertionsort {
  
public static void main(String args[]){
	 int j,i = 0,key,n;
	 int array[]={24,2,33,21,4,9};

	n=array.length;
		for(j=1;j<n;j++){
			 key=array[j];
			 i=j-1;
			 while((i>=0)&&(array[i]>key)){
				 array[i+1]=array[i];
				 i--;			
			 }
			 array[i+1]=key;		
			}
		for(i=0;i<n;i++){
		System.out.print("   "+array[i]);
		}
}
}

package JavaProgramsPractice;

import java.util.Arrays;

public class Array_SumofElements {

	public static void main(String[] args) {
	int sum=0;
		/*
		 * //Array arr[]=new Array[5]; //Array arr = new Array(); arr[0]=10; arr[1]=20;
		 * arr[2]=30; arr[3]=40;
		 */
		
		int arr[]= {10,20,30,40,50};
		
System.out.println(arr.length);
System.out.println(Arrays.toString(arr));

  for(int i=0;i<arr.length;i++) { sum=sum+arr[i]; }
 System.out.println("Sum of Arrays:"+sum);
 
	
//enhanced for loop:
for(int val:arr) {
	sum=sum+val;
	

	}
System.out.println("Sum of Arrays:"+sum);
}
}

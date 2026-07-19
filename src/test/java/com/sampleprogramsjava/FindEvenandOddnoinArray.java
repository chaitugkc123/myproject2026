package com.sampleprogramsjava;

public class FindEvenandOddnoinArray {

	public static void main(String[] args) {
		
		//int num,even_num,odd_num;
		int arr[]= {10,20,30,40,50,65};
			for(int i=0;i<arr.length;i++) {
		if(arr[i]%2==0) {
			System.out.println("Given no is even no:"+arr[i]);
		}
		else
		{
			System.out.println("Given no is odd no:"+arr[i]);
		}
		
		}
		

	}

}

package com.sampleprogramsjava;

public class SumofElementsinArray {

	public static void main(String[] args) {
		int sum=0;
		int arr[]= {10,20,30,40,50};
		
		for(int i=0;i<arr.length;i++){
		sum=sum+arr[i];
		}
System.out.println("Sum of Array Elements:"+sum);
	}

}

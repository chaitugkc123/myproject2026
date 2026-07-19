package com.sampleprogramsjava;



import java.util.Arrays;

public class Checkequityof2Arrays {

	public static void main(String[] args) {
		
		  
		  int a[]= {10,20,30,40}; 
		  int a1[]= {10,20,30,40};
		  boolean status =Arrays.equals(a.equals(a1));
		  
		  if(status==true) {
			  System.out.println("Arrays are equal");
		  }
		  else {
			  System.out.println("Arrays are not equal");
		  }
		  
		  
		  
			/*
			 * int a1[]=new int[4]; a1[0]=10; a1[1]=20; a1[2]=30; a1[3]=40;
			 */
		 
		  System.out.println(a.equals(a1));
		  System.out.println(a==a1);
		 

		/*
		 * String arr[]= {"Krishna","Chaitanya"}; String arr1[]=new String[1];
		 * arr1[0]="Krishna"; arr[1]="Chaitanya"; if(arr.equals(arr1)) {
		 * System.out.println("Arrays are equal"); } else {
		 * System.out.println("Arrays are not equal"); }
		 */
	}

}

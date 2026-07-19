package JavaProgramsPractice;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

public class Arrays_SortingArraysElements {

	public static void main(String[] args) {
		int arr1[]= {10,20,30,90,50,75};
		
		//Using built in functions:
		 Arrays.sort(arr1);
		String str=Arrays.toString(arr1);
		System.out.println(str);
		
		//Descending order elements sorting in Array: 
		Integer arr2[]= {10,30,50,75};
		Arrays.sort(arr2,Collections.reverseOrder());
		String str2=Arrays.toString(arr2);
		System.out.println(str2);
	
		}
		
	}
	
		


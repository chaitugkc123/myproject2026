package JavaProgramsPractice;

import java.util.Arrays;

public class Arrays_SortingElementswithoutFunctions {

	public static void main(String[] args) {
		int arr1[]= {50,20,30,90,10,75};
int temp;
		
		
		for(int i=0;i<arr1.length;i++) {
			for(int j=i+1;j<arr1.length;j++) {
				//replace < for descending order
				if(arr1[i]>arr1[j]) {
					temp=arr1[j];
					arr1[j]=arr1[i];
					arr1[i]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr1));
	}

}

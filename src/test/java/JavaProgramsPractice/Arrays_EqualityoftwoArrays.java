package JavaProgramsPractice;

import java.util.Arrays;

public class Arrays_EqualityoftwoArrays {

	public static void main(String[] args) {
		
int arr1[]= {10,20,30,40};
int arr2[]= {10,20,30,40};

//boolean b=Arrays.equals(arr1, arr2);

for(int i=0;i<arr1.length;i++) {
	for(int j=0;j<arr2.length;j++){
if(arr1[i]==arr2[j]) {
	System.out.println("Array elements are equal:"+arr1[i]+" "+arr2[j]);
	
}
}
//System.out.println(b);


	}
	}
	}


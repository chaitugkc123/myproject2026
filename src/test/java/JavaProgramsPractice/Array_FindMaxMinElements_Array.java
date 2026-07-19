package JavaProgramsPractice;

public class Array_FindMaxMinElements_Array {

	public static void main(String[] args) {
		
		boolean status=false;
int arr1[]= {10,30,50,75,90,55};

 /*int maxval=arr1[0]; 
 for(int i=0;i<arr1.length-1;i++) { 
	 if(arr1[i]>arr1[0]) {
 maxval=arr1[i]; }
 
 //status=true; } 
  
  
 

 }
 System.out.println("Maximum value in Array:"+maxval);*/
  int minval=arr1[0];
  
 for(int i=0;i<arr1.length-1;i++) { 
	 if(arr1[i]<arr1[0]) { 
		 minval=arr1[i];
 
 }
 
 } 
 System.out.println("Minimum no in Array elements:"+minval); 
	}
}


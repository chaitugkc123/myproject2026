package JavaProgramsPractice;

public class Array_PrintEven_OddnoinArray {

	public static void main(String[] args) {
		int arr1[]={10,21,30,43,50,67};
		for(int i=0;i<arr1.length;i++) {
		
			if(arr1[i]%2==0) {
			System.out.println("elements is even no:"+arr1[i]);
		}
		else {
			System.out.println("elements is odd no:"+arr1[i]);
			
		}
	}
		
		
}
}